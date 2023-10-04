package day26.dbconnect;//3-2

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO { 
	//나중에 유지보수하기 편하게 DB와 관련된 파일에는 DB와 관련된 내용만 만든다. 클래스는 내용별, 기능별로 구분해주는게 좋다.
	//즉 DB에 넣을 입력 값을 받는건 여기가 아니라 main에서 받는다. main을 인터페이스라고 생각한다.
/*
 *DAO 클래스 (Data Access Object)			- Persons DB에 대한 작업이 모여있는 파일이라고 생각하면 됨.
 *- 데이터베이스에 접속해서 데이터의 CRUD 등의 작업을 하는 클래스입니다.
 *- 일반적으로 다른 프로그램 로직 위에서 동작하기도 하지만 별도의 DAO 클래스를 만들어 사용하기도 합니다.
 *	-> 유지보수 및 코드의 모듈화를 위해 사용. 
 *- 보통 한 개의 테이블마다 한 개의 DAO를 작성합니다.
 *- DAO 클래스는 테이블로부터 데이터를 읽어와 자바 객체로 변환하거나 자바 객체의 값을 테이블에 저장합니다.
 *- 때문에 DAO를 구현하면 테이블의 컬럼과 매핑되는 값을 가지고 있는 클래스를 항상 작성해야 합니다.
 *	이것을 VO 클래스라고 합니다.
 *
 */
	//멤버 변수 - 필드, 속성
	//DB 연동을 위한 정보는 뭐가 필요할까?
	//Connection 객체 생성을 위한 값
	private String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul";
	private String user = "root";
	private String password = "root1234";
	
	//데이터 접속을 위한 객체
	Connection conn = null; //연결한 db의 정보가 들어있다. close() 사라진다.
	Statement stmt = null;
	ResultSet rs = null;
	
	//생성자 - Connection 객체 생성
	//생성할 때 DB랑 연결 할 설정
	public PersonsDAO() {
		try {
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 오류");
			System.out.println(sqle.getMessage());
		}
		//final 만들면 안됨. close()닫으면 객체가 바로 사라지니까
	}
	
	//메서드(CRUD) - Insert, Update, Delete, Select
	
	//데이터 입력 메서드 구현 - Insert
	public int insert(PersonsVO vo) {
		int result = 0;
		//id값은 auto_increment라서 자동으로 생성되서 안만들어도 됨
		String sql = "insert into Persons (lastname, firstname, age, city)"
				+ "values  ('"+vo.getLastname()+"', '"+vo.getFirstname()+"', '"+vo.getAge()+"', '"+vo.getCity()+"')";
		try {
			//Statement 객체 생성
			stmt = conn.createStatement();
			
			//SQL 실행
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
//				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}		
		return result;
	}
	
	//전체 테이블 정보 출력
//	public List<PersonsVO> allPersons() {
//		List<PersonsVO> list = null;
//		PersonsVO vo = new PersonsVO();
//		String sql = "select * from Persons";
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				vo.setId(rs.getInt("id"));
//				vo.setLastname(rs.getString("lastname"));
//				vo.setFirstname(rs.getString("firstname"));
//				vo.setAge(rs.getInt("age"));
//				vo.setCity(rs.getString("city"));
//				
//				list.add(vo);
////				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n", rs.getInt("id"), rs.getString("lastname"), rs.getString("firstname"), rs.getInt("age"), rs.getString("city"));				
//			}
//			for(int i=0; i<list.size(); i++) {
//				System.out.println(list.indexOf(i));
//			}
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패");
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				if(conn != null) conn.close();
//				if(stmt != null) stmt.close();
//				if(rs != null) rs.close();
//			} catch (Exception e2) {}
//		}
//		
//		return list;
//	}
	
	//선생님 ver - Select All
	public List<PersonsVO> allPersons() {
		List<PersonsVO> list = new ArrayList<>();
		String sql = "select * from Persons";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {//rs.next() : 내용이 있는지 확인
				int id = rs.getInt("id");
				String lastname = rs.getString("lastname");
				String firstname = rs.getString("firstname");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				PersonsVO vo = new PersonsVO(id, firstname, lastname, age, city);
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return list; //List<PersonsVO>로 출력하기 위해서 PersonsVO vo를 만들어서 안에 각 정보를 담은 객체를 생성한 것.
	}
	
	//id 입력 값을 통한 정보 출력
//	public PersonsVO selectOne(int id) {
//		PersonsVO vo = null;
//		
//		String sql = "select * from Persons where id="+id;
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			String lastname = rs.getString("lastname");
//			String firstname = rs.getString("firstname");
//			int age = rs.getInt("age");
//			String city = rs.getString("city");
//			
//			vo = new PersonsVO(id, firstname, lastname, age, city);
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패");
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				if(conn != null) conn.close();
//				if(stmt != null) stmt.close();
//				if(rs != null) rs.close();
//			} catch (Exception e2) {}
//		}
//		
//		return vo;
//	}
	
	//선생님 ver - Select One
	public PersonsVO selectOne(int id) {
		PersonsVO vo = null;
		
		String sql = "select * from Persons where id="+id;
		
		try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				vo = new PersonsVO();
				vo.setId(rs.getInt("id"));
				vo.setLastname(rs.getString("lastname"));
				vo.setFirstname(rs.getString("firstname"));
				vo.setAge(rs.getInt("age"));
				vo.setCity(rs.getString("city"));
				
			}else {
				System.out.println("찾는 DB가 없음");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		}
		
		return vo;
	}	
	
	//수정 메서드 구현
//	public int updatePersons(PersonsVO vo) {
//		int result = 0;
//		
//		int id = vo.getId();
//		String lastname = vo.getLastname();
//		String firstname = vo.getFirstname();
//		int age = vo.getAge();
//		String city = vo.getCity();
//		
//		String sql = "update Persons set firstname ='"+firstname+"',"
//				+ "lastname = '"+lastname+"',"
//				+ "age = "+age+","
//				+ "city = '"+city+"'"
//				+ "where id="+id;
//		try {
//			stmt = conn.createStatement();
//			result = stmt.executeUpdate(sql);
//			
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패");
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				if(conn != null) conn.close();
//				if(stmt != null) stmt.close();
//				if(rs != null) rs.close();
//			} catch (Exception e2) {}
//		}
//		
//		return result;
//	}
	
	//선생님 ver - Update
	public int updatePersons(PersonsVO vo) {
		int result = 0;		
		
		String sql = "update Persons set lastname ='"+vo.getLastname()+"',"
				+ "firstname = '"+vo.getFirstname()+"',"
				+ "age = "+vo.getAge()+","
				+ "city = '"+vo.getCity()+"'"
				+ "where id="+vo.getId();
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	//삭제 메서드 구현
//	public int deletePersons(int id) {
//		int result = 0;
//		
//		String sql = "delete from Persons where id="+id;
//		
//		try {
//			stmt = conn.createStatement();
//			result = stmt.executeUpdate(sql);
//			
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패");
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				if(conn != null) conn.close();
//				if(stmt != null) stmt.close();
//				if(rs != null) rs.close();
//			} catch (Exception e2) {}
//		}
//		
//		return result;
//	}
	
	//선생님 ver - Delete
	public int deletePersons(int id) {
		int result = 0;
		
		String sql = "delete from Persons where id="+id;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}

}
