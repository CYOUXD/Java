package day26.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		//SQLite DB 연결하기
		
		//필요 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. 드라이버 로드
			Class.forName("org.sqlite.JDBC");
			
			//2. Connection 객체 생성
			String dbfile = "SQLiteDB.db"; //DB 파일이 있는 실제 경로를 넣는다. 파일 형식이기 때문에 이렇게 연결한다.
			String url = "jdbc:sqlite:"+dbfile;	//SQLite의 url
			conn = DriverManager.getConnection(url);
			
			System.out.println("정상 동작합니다.");
			
			//3. stmt 객체 생성
			stmt = conn.createStatement();
			String sql = "create table if not exists test_table("
										+ "id int primary key,"
										+ "lastname text(20) not null,"
										+ "firstname text(20),"
										+ "age numeric,"
										+ "city text(20) default 'Seoul')";
			int result = stmt.executeUpdate(sql);
			System.out.println("sql 처리 결과 : "+result);
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 연동 실패");
			System.out.println(e.getMessage());
		}
	}

}
