package com.koitt.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.model.Board;
import com.mysql.jdbc.Statement;

public class DBManager {
	public static final String URL = "jdbc:mysql://localhost:3306";
	public static final String DB_NAME = "koitt";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String ID = "root";
	public static final String PASSWORD = "koitt";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 싱글턴 패턴 (Singleton Pattern): Board 프로그램 내부에서 객체 하나만 생성하도록 하는 패턴
	private static DBManager instance;

	private DBManager() {	// private: 클래스 내부에서만 객체를 생성하도록 하기위해
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
		}
	}

	public static DBManager getInstance() {
		if (instance == null) {	// null일 경우는 아직 한번도 객체를 생성하지 않은 경우
			instance = new DBManager();	// 객체를 생성한다.
		}
		return instance;	// 방금 생성한 객체를 리턴하거나 기존에 생성했었던 객체를 리턴
	}
	//////////////////////////////////////////////////////

	public List<Board> selectAll() throws SQLException {
		conn = DriverManager.getConnection(URL+ "/" +DB_NAME, ID, PASSWORD);
		String sql = "SELECT * FROM board";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();

		List<Board> list = new ArrayList<Board>();
		while (rs.next()) {
			Board item = new Board(rs.getInt("no"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getString("writer"),
					rs.getDate("regdate"),
					rs.getDate("modidate"));
			list.add(item);
		}
		this.close();

		return list;
	}

	public void insert(Board board) throws SQLException {

		conn = DriverManager.getConnection(URL+ "/" +DB_NAME, ID, PASSWORD);
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO board (title, content, writer, regdate, modidate)");
		sql.append("VALUES (?,?,?, CURDATE(),NULL)");

		pstmt=conn.prepareStatement(sql.toString());

		pstmt.setString(1, board.getContent());
		pstmt.setString(2, board.getTitle());
		pstmt.setString(3, board.getWriter());

		pstmt.executeUpdate();


		this.close();
	}

	public void delete(Board board) throws SQLException {
		//1.데이터베이스와 연결
		conn = DriverManager.getConnection(URL+ "/" +DB_NAME, ID, PASSWORD);
		//2.sql문작성
		StringBuilder sql = new StringBuilder();
		sql.append("delete from board where no= ?");

		//3.sql문 실행을 위한 객체생성
		pstmt = conn.prepareStatement(sql.toString());

		//4.sql문 물음표 채우기
		pstmt.setInt(1, board.getId());
		//5.채운 sql문실행
		pstmt.executeUpdate();	
		//6.객체연결해제
		this.close();

	}

	public void update(Board board) throws SQLException {

		//1.데이터베이스와 연결
		conn = DriverManager.getConnection(URL+ "/" +DB_NAME, ID, PASSWORD);
		//2.sql문작성
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE board SET title = ?, content = ?, modidate = CURDATE() WHERE no = ?");

		//3.sql문 실행을 위한 객체생성
		pstmt = conn.prepareStatement(sql.toString());

		//4.sql문 물음표 채우기
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setInt(3, board.getId());
		//5.채운 sql문실행
		pstmt.executeUpdate();	
		//6.객체연결해제
		this.close();
	}

	// 객체 연결 해제
	private void close() throws SQLException {
		if (rs != null) { rs.close(); }
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
	}
}

/*
 * koitt 파일 시스템에서 데이터 베이스 시스템으로 변경하기
 * 1DBManager
 * JDBC 이용하여 SQL문 실행 후
 * 실행한 결과를 리턴하는 기능구현
 * 2BoardDao
 * 디비 매니저의 겟인스턴스 이용하여
 * 디비 매니저 객체에 접근한후 각 해당하는 메소드 호출
 * 
 * 3.보더서비스
 * 
 * 
 */

