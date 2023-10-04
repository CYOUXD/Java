package day26.dbconnect;//3-3

import java.util.List;
import java.util.Scanner;

public class DBConnectMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PersonsDAO dao = new PersonsDAO();
		PersonsVO vo = new PersonsVO();
		
		//insert
//		System.out.println("Persons 정보 입력(Insert)");
//		System.out.print("성 입력 : ");
//		vo.setLastname(scan.next());
//		
//		System.out.print("이름 입력 : ");
//		vo.setFirstname(scan.next());
//		
//		System.out.print("나이 입력 : ");
//		vo.setAge(scan.nextInt());
//		
//		System.out.print("도시 입력 : ");
//		vo.setCity(scan.next());
//		
//		int result = dao.insert(vo);
//		if(result != 0) {
//			System.out.println("SQL 입력 성공");
//		}else {
//			System.out.println("SQL 실패");
//		}
//		
//		scan.close();
		
		//전체 출력
//		List<PersonsVO> list = dao.allPersons();
//		for(PersonsVO vo1 : list) {
//			System.out.println(vo1);
//		}
		
		//id 입력 값을 통한 출력
//		vo = dao.selectOne(3);
//		System.out.println(vo);
		//id : 3, lastname : user3, firstname : user3, age : 21, city : Daegu
		
		//Update
////	PersonsDAO dao2 = new PersonsDAO(); 
//		//selectOne에서 conn, stmt, rs를 다 close()했기 때문에 PersonsDAO 새로 객체를 생성해야 사용할 수 잇다.
//		System.out.println("Persons 수정 정보 입력");
//		System.out.print("성 입력 : ");
//		vo.setLastname(scan.next());
//		
//		System.out.print("이름 입력 : ");
//		vo.setFirstname(scan.next());
//		
//		System.out.print("나이 입력 : ");
//		vo.setAge(scan.nextInt());
//		
//		System.out.print("도시 입력 : ");
//		vo.setCity(scan.next());
//		
//		int result = dao.updatePersons(vo);
//		if(result != 0) {
//			System.out.println("SQL 수정 성공");
//		}else {
//			System.out.println("SQL 실패");
//		}
		
		//Delete
//		int result = dao.deletePersons(3);
//		if(result != 0) System.out.println("SQL 삭제 성공");
//		else System.out.println("SQL 실패");
		
		//선생님 ver - Update
//		System.out.println("수정하기");
//		System.out.println("id = 13 정보 수정하기");
//		PersonsVO vo = dao.selectOne(13);
//		System.out.println("수정할 성을 입력하세요 ("+vo.getLastname()+") : ");
//		String lastname = scan.next();
//		if(!lastname.equals("")) {
//			vo.setLastname(lastname);
//		}
//		
//		System.out.println("수정할 이름을 입력하세요 ("+vo.getFirstname()+") : ");
//		String firstname = scan.next();
//		if(!firstname.equals("")) {
//			vo.setFirstname(firstname);
//		}
//
//		System.out.println("수정할 나이를 입력하세요 ("+vo.getAge()+") : ");
//		int age = scan.nextInt();
//		if(age !=0 && age >= 0) {
//			vo.setAge(age);
//		}
		//생략 - 선생님 깃허브 참고 후 수정
	}

}
