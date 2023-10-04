package day26.dbconnect;//2

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnect2 {

	public static void main(String[] args) {
		//Select 처리
		
		//객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. JDBC 드라이버 로드 - Class.forName();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Connection 객체 생성 - DriverManager();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul", "root", "root1234");
			
			//3. Statement 객체 생성 - createStatment();
			stmt = conn.createStatement();
			
			//4. SQL 작성
			String sql = "select * from Persons";
			
			//5. Statement 객체를 통한 동작 - executeQuery(); -> ResultSet 객체 반환
			rs = stmt.executeQuery(sql);
			while(rs.next()) { //반환 값 boolean, 레코드 단위로 불러서 내부 실행(로우), 다음 값이 있으면 true, 없으면 false
				int id = rs.getInt("id");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n", id, lastname, firstname, age, city);
			}
			rs.close(); // 아래에서 한번만 닫으니까 그 전에 실행된 것들은 따로 닫아줘야 한다.
			
			//1. 입력값을 받아서 해당 결과를 출력하세요. id - id니까 while을 안써도 된다. primary key
//			Scanner scan = new Scanner(System.in);
//			System.out.println("아이디 번호를 입력하세요");
//			int uid = scan.nextInt();
//			String findId = "select * from Persons where id ="+uid;
//			rs = stmt.executeQuery(findId);
//			while(rs.next()) {
//				int id = rs.getInt("id");
//				String firstname = rs.getString("firstname");
//				String lastname = rs.getString("lastname");
//				int age = rs.getInt("age");
//				String city = rs.getString("city");
//				
//				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n", id, lastname, firstname, age, city);
//			}
			
			//1. 선생님 ver - 구분값 입력값을 이용한 검색
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 아이디를 입력하세요");
			int input = scan.nextInt();
			//sql 작성
			String sql1 = "select * from Persons where id ="+input;
			//sql 실행
			rs = stmt.executeQuery(sql1);
			if(rs.next()) {
				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n", rs.getInt("id"), rs.getString("lastname"), rs.getString("firstname"), rs.getInt("age"), rs.getString("city"));
			}else {
				System.out.println("입력한 id의 결과가 없습니다.");
			}
			rs.close();
			
			
			//2. 이름(firstname)으로 입력값 받아서 출력. 단, 일부 입력시에도 출력
//			System.out.println("이름을 입력하세요");
//			String uname = scan.next();
//			String findName = "select * from Persons where firstname like '"+uname+"%'";
//			rs = stmt.executeQuery(findName);
//			while(rs.next()) {
//				int id = rs.getInt("id");
//				String firstname = rs.getString("firstname");
//				String lastname = rs.getString("lastname");
//				int age = rs.getInt("age");
//				String city = rs.getString("city");
//				
//				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n", id, lastname, firstname, age, city);
//			}
			
			//2. 선생님 ver
			System.out.println("이름 입력을 통한 내용 출력 문제");
			System.out.print("검색할 이름을 입력하세요 : ");
			String searchName = scan.next();
			//SQL 작성
			String sql2 = "select * from Persons where firstname like '%"+searchName+"%'";
			//SQL 실행
			rs = stmt.executeQuery(sql2);
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n", id, lastname, firstname, age, city);
			}
			
			
			
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {};
		}
		
		
		
	}

}
