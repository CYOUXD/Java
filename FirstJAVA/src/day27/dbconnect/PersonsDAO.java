package day27.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO {
	private String url = "jdbc:mariadb://localhost:13306/testdb";
	private String user = "root";
	private String password = "root1234";
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public PersonsDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		}		
	}
	
	//생성자로 만들어서 url, user, password를 넣어도 됨
	//public PersonDAO(String url, String user, String password) {
	//      ... 위와 같음 ...
	//}
	
	//전체 출력
//	public List<PersonsVO> selectAll() {
//		List<PersonsVO> list = new ArrayList<>();
////		PersonsVO vo = new PersonsVO();
//		
//		String sql = "select * from Persons";
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				int id = rs.getInt("id");
//				String lastname = rs.getString("lastname");
//				String firstname = rs.getString("firstname");
//				int age = rs.getInt("age");
//				String city = rs.getString("city");
//				
//				PersonsVO vo = new PersonsVO(id, lastname, firstname, age, city);
//				
//				//이걸로 만들면 똑같은게 여러개씩 출력된다.
////				vo.setId(rs.getInt("id"));
////				vo.setLastname(rs.getString("lastname"));
////				vo.setFirstname(rs.getString("firstname"));
////				vo.setAge(rs.getInt("age"));
////				vo.setCity(rs.getString("city"));
//				list.add(vo);
////				System.out.println(list);
//				
//			}
//			for(PersonsVO all : list) {
//				System.out.println(all);
//			}
//			
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패");
//			e.printStackTrace();
//		} finally {
//			try {
//				if(stmt != null) stmt.close(); 
//			} catch (Exception e2) {}
//		}
//		return list;
//	}
	
	
	
	
	//특정 ID 출력
//	public PersonsVO selectOne(int id) {
//		PersonsVO vo = null;
//		
//		String sql = "select * from Persons where id="+id;
//		
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			if(rs.next()) { 
//				vo = new PersonsVO();
//				vo.setId(rs.getInt("id"));
//				vo.setLastname(rs.getString("lastname"));
//				vo.setFirstname(rs.getString("firstname"));
//				vo.setAge(rs.getInt("age"));
//				vo.setCity(rs.getString("city"));
//				
//				System.out.println(vo);				
//			}else {
//				System.out.println("DB에 찾는 데이터가 없습니다.");
//			}
//			
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패");
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				if(stmt != null) stmt.close();
//				if(rs != null) rs.close();
//			} catch (Exception e2) {}
//		}
//		
//		return vo;
//	}
	
	
	
	
	//데이터 입력
//	public int insert(PersonsVO vo) {
//		int result = 0;
//		
//		String sql = "insert into Persons(lastname, firstname, age, city) "
//				+ "values ('"+vo.getLastname()+"', "
//						+ "'"+vo.getFirstname()+"', "
//							+vo.getAge()+", "
//						+ "'"+vo.getCity()+"')";
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
//				if(stmt != null) stmt.close(); 
//			} catch (Exception e2) {}
//		}
//		return result;
//	}
	
	
	
	
	
	
	//데이터 수정
//	public int update(PersonsVO vo) {
//		int result = 0;
//		String sql = "update Persons set "
//				+ "lastname='"+vo.getLastname()+"', "
//				+ "firstname='"+vo.getFirstname()+"', "
//				+ "age="+vo.getAge()+", "
//				+ "city='"+vo.getCity()+"' "
//				+ "where id="+vo.getId();
//		
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패");
//		} finally {
//			try {
//				if(stmt != null) stmt.close(); 
////				if(rs != null) rs.close(); 
//			} catch (Exception e2) {}
//		}
//		
//		return result;
//	}
	
	
	
	//데이터 삭제
//	public int delete(int id) {
//		int result = 0;
//		
//		String sql = "delete from Persons where id="+id;
//		
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//		} catch (SQLException e) {
//			System.out.println("SQL 연동 실패!");
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				if(stmt != null) stmt.close();
//				if(rs != null) rs.close();
//			} catch (Exception e2) {}
//		}
//		
//		return result;
//	}
	
	// ---------------------------------------------------------------
	
	//1. Insert 선생님 ver
	public int insertPersons(PersonsVO vo) {
		int result = 0;
		String sql = "insert into Persons(lastname, firstname, age, city) "
				+ "values ('"+vo.getLastname()+"', "
						+ "'"+vo.getFirstname()+"', "
						+vo.getAge()+", "
						+ "'"+vo.getCity()+"')";
		
		try {
			//SQL 처리를 위한 Statement 객체 생성
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(conn != null) conn.close(); 
				if(stmt != null) stmt.close(); 
			} catch (Exception e2) {}
		}		
		return result;
	}
	
	//2. selectAll 선생님 ver
	public List<PersonsVO> selectAll() {
		List<PersonsVO> list = new ArrayList<>();
		
		String sql = "select * from Persons Order by id desc"; 
		//데이터를 주고받는 과정중에 정렬이 자동으로 되지 않는 경우가 있으니 정렬해주면 좋다.
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String lastname = rs.getString("lastname");
				String firstname = rs.getString("firstname");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				PersonsVO vo = new PersonsVO(id, lastname, firstname, age, city);

				list.add(vo);				
			}
			for(PersonsVO all : list) {
				System.out.println(all);
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close(); 
				if(stmt != null) stmt.close(); 
				if(rs != null) rs.close(); 
			} catch (Exception e2) {}
		}
		return list;
	}
	
	//3. selectOne 선생님 ver
	public PersonsVO selectOne(int id) {
		PersonsVO vo = null;
		
		String sql = "select * from Persons where id='"+id+"'"; 
		//'id'이렇게 쓰면 묵시적 형변환을 한다. 이렇게 값을 자동으로 바뀌게 숨기면 SQLinjection 공격하기 어려워짐
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) { 
				vo = new PersonsVO(
						rs.getInt("id"),
						rs.getString("lastname"),
						rs.getString("firstname"),
						rs.getInt("age"),
						rs.getString("city")
						);
				System.out.println(vo);				
			}else {
				System.out.println("DB에 찾는 데이터가 없습니다.");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(conn != null) stmt.close();
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return vo;
	}
	
	//4. update 선생님 ver
	public int updatePersons(PersonsVO vo) {
		int result = 0;
		
		String sql = "update Persons set "
				+ "lastname='"+vo.getLastname()+"', "
				+ "firstname='"+vo.getFirstname()+"', "
				+ "age="+vo.getAge()+", "
				+ "city='"+vo.getCity()+"' "
				+ "where id='"+vo.getId()+"'";
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
		} finally {
			try {
				if(conn != null) conn.close(); 
				if(stmt != null) stmt.close(); 
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	//5. delete 선생님 ver
	public void deletePersons(int id) {
		//void 성공, 실패 결과값을 전달하지 않을거라서 void로 함
		String sql = "delete from Persons where id='"+id+"'";
		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패!");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
	}
	
	
	
	
}
