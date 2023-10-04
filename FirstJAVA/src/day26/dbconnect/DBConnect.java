package day26.dbconnect;//1

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		//JDBC 연동 테스트
		
		//데이터베이스 접속 객체 (Connection 클래스)
		Connection conn = null; //Connection 인터페이스 : 공통적으로 만들 것 명세화 함
		
		//Checked Exception : SQL
		try {
			//1. 드라이버 로드
			/*
			 * MySQL 사용 드라이버
			 * MySQL 6.xx 버전 미만 : com.mysql.jdbc.Driver
			 * MySQL 6.xx 버전 이후 : com.mysql.cj.jdbc.Driver
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			//드라이버 위치 - Referenced Libraries > mysql-conn... > com.mysql.cj.jdbc > Drever.class
		
			//2. connection 객체 생성 = DriverManager
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root1234");
			//포트번호 보는 법 - 워크벤치 -> 왼쪽 server status -> connection
			/*
			 * url -> JDBC 연결을 위한 주소
			 * MySQL 6.xx 버전 이전 : jdbc:mysql://호스트이름:포트번호/DB이름
			 * MySQL 6.xx 버전 이후 : jdbc:mysql://호스트이름:포트번호/DB이름?serverTimezone=UTC
			 * ? 뒤는 매개변수, 인자값
			 * SSL 설정 오류 발생시 &&useSSL=false 추가
			 */
			
			/* Insert, Update, Delete */
			//3. Statement 객체 생성 - creageStatment() 메서드 사용
			Statement stmt = conn.createStatement();  //Statement 인터페이스
			
			//4. sql을 작성
			String sql = "insert into Persons (firstname, lastname, age, city)" + "values('아지', '강', 4, 'Seoul')"; //입력
			String sql2 = "update Persons set firstname = '양이', lastname = '고', age = '6'" + "where id = 14"; //수정
			String sql3 = "delete from Persons where id = 14"; //삭제
			
			//5. Statement 객체를 통해서 작성된 SQL을 실행
//			int result = stmt.executeUpdate(sql); //실행 성공한 숫자만큼 리턴. 0 = 실패
//			int result = stmt.executeUpdate(sql2);
			int result = stmt.executeUpdate(sql3);
			
			//실행 성공 여부 확인
			if(result != 0) {
				System.out.println("Insert SQL 성공");
			}else {
				System.out.println("SQL 실패");
			}
			
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 오류");
			System.out.println(sqle);
		} finally {
			try {if(conn!=null) conn.close();} catch (Exception e) {}
		}
	}

}
