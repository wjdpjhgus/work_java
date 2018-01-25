package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {
	public static void main(String[] args) {
		try {
			String driveName ="com.mysql.jdbc.Driver";
			String DBName = "myjavadb";
			String dbURL= "jdbc:mysql://localhost:3306/" + DBName;
			String SQL = "select * from student";

			//JDBC 드라이버로드
			Class.forName(driveName);
			Connection con =DriverManager.getConnection(dbURL, "root", "koitt");
			
			//질의를 할 statement만들기
			Statement stmt =con.createStatement();
			
			//데이터베이스 myjavadb의 테이블 student의 레코드 조회
			ResultSet result =stmt.executeQuery(SQL);
			System.out.println(" ---------테이블 student 내용 조회---------");
			while (result.next()) {
				System.out.print(result.getNString(1)+"\t");
				System.out.print(result.getNString(2)+"\t");
				System.out.print(result.getInt(3)+"\t");
				System.out.println(result.getNString(4)+"\t");
			}
			stmt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("Mysql 데이터 베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
