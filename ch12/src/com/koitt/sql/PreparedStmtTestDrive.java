package com.koitt.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtTestDrive {
	public static void main(String[] args) {

		String driveName ="com.mysql.jdbc.Driver";
		String DBName = "myjavadb";
		String dbURL= "jdbc:mysql://localhost:3306/" + DBName;

		//1. JDBC 드라이버로드
		try {
			Class.forName(driveName);
			Connection con =DriverManager.getConnection(dbURL, "root", "koitt");

			
			//2.SELECT문 사용
			String sql = "select * from student";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet result =pstmt.executeQuery();
			
			while (result.next()) {
				System.out.print(result.getNString(1)+"\t");
				System.out.print(result.getNString(2)+"\t");
				System.out.print(result.getInt(3)+"\t");
				System.out.println(result.getNString(4)+"\t");
			}
			
			result.close();
			pstmt.close();
	
			
			//3. INSERT 문 statement는 따로 만들어줘야함
			sql ="insert into student  values(?, ?, ?, ?)"; //중간에 조작불가 해킹으로부터 안전
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "04");
			pstmt.setString(2, "고길동");
			pstmt.setInt(3, 20131122);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate();
		
			pstmt.setString(1, "05");
			pstmt.setString(2, "둘리");
			pstmt.setInt(3, 201311112);
			pstmt.setString(4, "정보통신공학과");
			pstmt.executeUpdate();
			
			pstmt.close();
			//4. 종료
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
