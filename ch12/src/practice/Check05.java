package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Check05 {
	public static void main(String[] args) {
		try {
			String driveName ="com.mysql.jdbc.Driver";
			String DBName = "world_0";
			String dbURL= "jdbc:mysql://localhost:3306/" + DBName;
		
			String SQL = "select * from city";
			
			Class.forName(driveName);
			Connection con =DriverManager.getConnection(dbURL, "root", "koitt");

			Statement stmt =con.createStatement();

			//데이터베이스 world_0의 테이블 city의 레코드 조회
			ResultSet result =stmt.executeQuery(SQL);
			System.out.println(" ---------테이블 city 내용 조회---------");
			while (result.next()) {
				System.out.print(result.getInt(1)+"\t");
				System.out.print(result.getNString(2)+"\t");
				System.out.print(result.getNString(3)+"\t");
				System.out.println(result.getInt(4)+"\t");
			}
			
			//5-6 
			String checo05_6 = "select * from city where pop > 3000000";
			ResultSet result1 =stmt.executeQuery(checo05_6);
			System.out.println(" ---------테이블 city 300만이상 내용 조회---------");
			while (result1.next()) {
				System.out.print(result1.getInt(1)+"\t");
				System.out.print(result1.getNString(2)+"\t");
				System.out.print(result1.getNString(3)+"\t");
				System.out.println(result1.getInt(4)+"\t");
			}
			//5-7 
			String checo05_7 = "select name, major from city where pop > 3000000";
			ResultSet result2 =stmt.executeQuery(checo05_7);
			System.out.println(" ---------테이블 city 300만미만 내용 조회---------");
			while (result2.next()) {
				System.out.print(result2.getString(1)+"\t");
				System.out.println(result2.getNString(2)+"\t");
			}
			
			//5-8 
			String checo05_8 = "select * from city where name = '목포' ";
			ResultSet result3 =stmt.executeQuery(checo05_8);
			System.out.println(" ---------테이블 city 목포모든내용표시---------");
			while (result3.next()) {
				System.out.print(result3.getInt(1)+"\t");
				System.out.print(result3.getNString(2)+"\t");
				System.out.print(result3.getNString(3)+"\t");
				System.out.println(result3.getInt(4)+"\t");
			}
			
			//5-9 
			String checo05_9 = "delect from city where name = '목포' ";
			ResultSet result4 =stmt.executeQuery(checo05_9);
			System.out.println(" ---------테이블 city 목포삭제---------");
			while (result4.next()) {
				System.out.print(result4.getInt(1)+"\t");
				System.out.print(result4.getNString(2)+"\t");
				System.out.print(result4.getNString(3)+"\t");
				System.out.println(result4.getInt(4)+"\t");
			}
			
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Mysql 데이터 베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}


