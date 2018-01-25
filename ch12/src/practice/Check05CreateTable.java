package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Check05CreateTable {
	public static void main(String[] args) {
		try {
			String driveName ="com.mysql.jdbc.Driver";
			String DBName = "world_0";
			String dbURL= "jdbc:mysql://localhost:3306/" + DBName;
			String sqlCT = "create table city (" +
							"id  	int				NOT NULL auto_increment, " +
							"name  	varchar(50)		NOT NULL, " +
							"major  varchar(20)		NULL, " +
							"pop  	int				NULL, " +
							"PRIMARY KEY ( id )" +
							");";
			String SQL = "select * from city";
			
			Class.forName(driveName);
			Connection con =DriverManager.getConnection(dbURL, "root", "koitt");

			Statement stmt =con.createStatement();

			stmt.executeUpdate(sqlCT);
			System.out.println("테이블 city가 생성되었습니다");

			stmt.executeUpdate("insert into city values('1','서울', '이명길', 20000000);");
			stmt.executeUpdate("insert into city values('2', '인천', '김동훈', 3500000);");
			stmt.executeUpdate("insert into city values('3', '대구', '강수복', 3000000);");
			stmt.executeUpdate("insert into city values('4', '부산', '남기문', 5000000);");
			stmt.executeUpdate("insert into city values('5', '목포', '신용현', 2000000);");
			System.out.println("테이블 city에 5개의 레코드가 삽입되었습니다.");
			
			//데이터베이스 world_0의 테이블 city의 레코드 조회
			ResultSet result =stmt.executeQuery(SQL);
			System.out.println(" ---------테이블 city 내용 조회---------");
			while (result.next()) {
				System.out.print(result.getInt(1)+"\t");
				System.out.print(result.getNString(2)+"\t");
				System.out.print(result.getNString(3)+"\t");
				System.out.println(result.getInt(4)+"\t");
			}
			stmt.close();
			con.close();
			
			//5-6 
			String checo05_6 = "select * from city where pop > 3000000";
			ResultSet result1 =stmt.executeQuery(checo05_6);
			System.out.println(" ---------테이블 city 내용 조회---------");
			while (result1.next()) {
				System.out.print(result1.getInt(1)+"\t");
				System.out.print(result1.getNString(2)+"\t");
				System.out.print(result1.getNString(3)+"\t");
				System.out.println(result1.getInt(4)+"\t");
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

