package database.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateUnivDB {
	public static void main(String[] args) {
		try {
			String URL ="jdbc:mysql://localhost:3306";
			//1. 드라이버로드
			Class.forName("com.mysql.jdbc.Driver");
			//2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(URL, "root", "koitt");
			//3. SQL을 위한 객체 생성 및 sql문 설정
			PreparedStatement pstmt = conn.prepareStatement("CREATE DATABASE univ");
			//4.SQL문 실행
			int result =pstmt.executeUpdate();
			System.out.println(result);

			//5.ResultSet을 이용해 질의 결과 처리(생략)

			//6. 객체 연결해제
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("SQL문이 잘못되었거나, 데이터베이스 생성이 중복되었습니다.");
			e.printStackTrace();

		}
	}
}