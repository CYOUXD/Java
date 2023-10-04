package day29.dbconnect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class quiz {
	static int exists;

	public static void main(String[] args) {
		//테이블 생성
		/*
		 * 오라클에 mytest 계정에 Persons 테이블을 생성
		 * id, lastname, firstname, age, city를 가지는 테이블 생성
		 * 각 테이블에 정보를 입력 받아 데이터를 생성할 수 있게 만들어주세요.(id는 자동생성)
		 * 모든 레코드 추가가 성공하면, Persons 테이블에 있는 레코드 전체를 출력하는 코드를 작성
		 */
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String user = "mytest";
		String password = "mytest";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select count(*) cnt from all_tables where table_name = 'PERSONS'";
			
			pstmt = conn.prepareStatement(sql);
			ResultSet rs1 = pstmt.executeQuery();
			
			while(rs1.next()) {
				exists = rs1.getInt("cnt");
				System.out.println(rs1.getInt("cnt"));				
			}
			
			if(exists == 0) { //데이터 없음 = 테이블 없음
				String sql1 = "create sequence person_seq "
						+ "start with 1 "
						+ "increment by 1";
				pstmt = conn.prepareStatement(sql1);
				pstmt.executeUpdate();
				
				String sql2 = "create table Persons("
//						+ "id varchar(255) default person_seq.nextval, "
						+ "id varchar(255) default person_seq.nextval, "
						+ "lastname varchar(255), "
						+ "firstname varchar(255), "
						+ "age int, "
						+ "city varchar(255))";
				
				pstmt = conn.prepareStatement(sql2);
				pstmt.executeUpdate();
			}

			System.out.print("성(lastname)을 입력하세요.");
			String lastname = scan.next();
			System.out.print("이름(firstname)을 입력하세요.");
			String firstname = scan.next();
			System.out.print("나이(age)를 입력하세요.");
			int age = scan.nextInt();
			System.out.print("도시(city)를 입력하세요.");
			String city = scan.next();
			
//			String sql3 = "insert into Persons(lastname, firstname, age, city) "
			String sql3 = "insert into Persons(lastname, firstname, age, city) "
					+ "values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql3);
//			pstmt.setString(1, "person_seq.nextval");
			//??????????????????? 여기에서 시퀀스를 집어 넣고 싶으면 어떻게 하지?
			//답 : 
			pstmt.setString(1, lastname);
			pstmt.setString(2, firstname);
			pstmt.setInt(3, age);
			pstmt.setString(4, city);
			
			int result = pstmt.executeUpdate();
			if(result != 0) {
				System.out.println("레코드 추가 성공");
			}else {
				System.out.println("레코드 추가 실패");
			}
			
			String sql4 = "select * from Persons";
			pstmt = conn.prepareStatement(sql4);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("id: %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s\n", 
						rs.getInt("id"), rs.getString("lastname"), rs.getString("firstname"), 
						rs.getInt("age"), rs.getString("city"));	
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB 연동 실패");
//			System.out.println(sqle.getMessage());
			sqle.printStackTrace();
		}
		
	}

}
