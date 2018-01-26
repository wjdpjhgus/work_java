package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateDeptTable {
	public static void main(String[] args) {
		try {
			String url ="jdbc:mysql://localhost:3306";
			String dbName = "univ";
			
			//1. 드라이버로드
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url+"/"+ dbName,"root", "koitt");
			
			//3. SQL문 작성StringBuilder이점있음
			StringBuilder sql = new StringBuilder();
			sql.append("CREATE TABLE department(");
			sql.append("id INT, ");
			sql.append("name VARCHAR(30), ");
			sql.append("numstudent INT, ");
			sql.append("PRIMARY KEY (id)");
			sql.append(");");
			
			//4. SQL을 위한 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());//배열에 있는걸 스트링으로바꾸기위해
			
			//5. SQL문장 실행
			int result =pstmt.executeUpdate();
			System.out.println(result);
			
			//6. 객체 연결해제
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
		
			e.printStackTrace();

		}
	}
}