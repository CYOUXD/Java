package day29.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
	/*
	 * JAVA에 DB 연동하기(Oracle)
	 * 1. Driver loading
	 * 2. DriverManager을 이용하여 Connection 객체 생성
	 * 3. SQL 작성(PreparedStatement의 매개변수로 사용해야하기 때문에 먼저 작성)
	 * 4. PreparedStatement 객체 사용(Statement 객체 대용) - mysql에서도 사용가능
	 * 5. SQL 실행
	 * 
	 * 왜 PreparedStatement를 사용할까?
	 * - SQL에 전달하여 처리하는 값을 변환하는 것이 Statement는 까다롭다는 점.
	 * - PreparedStatemen는 이것을 간결하게 할 수 있게 작업해 줌.
	 * - 간단하게 값을 전달할 때에 SQL에 ?로 처리하여 값을 지정하고 변환 처리는 자동으로
	 * - ?는 인덱스 값을 사용하여 참조하기 때문에 여러개인 경우 1번 부터 순서대로 지정!
	 */
	public static void main(String[] args) {
		//오라클 DB Connect -- PreparedStatement
		
		//연결 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String user = "mytest";
		String password = "mytest";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//1. 드라이버 로드
		try {
			Class.forName(driver);
			
			//2. Connection 객체 생성 - DriverManager
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			System.out.println("DB 연동 성공!");
			
			//3. SQL 작성 - insert
			String sql = "insert into testuser(name, age) values(?, ?)";
			
			//4. PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql); //여기서 이미 sql을 이미 받았음
			//?에 값을 대입
			pstmt.setString(1, "testuser"); //1번 부터 시작
			pstmt.setInt(2, 20);
			
			//5. SQL 실행
			int result = pstmt.executeUpdate(); //sql를 매개변수로 쓰지 않음
			//매개변수로 sql을 넣으면 ArrayIndexOutOfBoundsException : Index 0 out of bounds for length 0 에러가 뜸
			if(result != 0) {
				System.out.println("레코드 추가 성공");
			}else {
				System.out.println("레코드 추가 실패");
			}
			
			String sql2 = "select * from testuser";
			pstmt = conn.prepareStatement(sql2);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("이름 : %s, 나이 : %d\n",rs.getString("name"), rs.getInt("age"));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB 연동 실패");
			System.out.println(sqle.getMessage());
		}
		
		
	}

}
