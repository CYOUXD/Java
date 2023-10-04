package day27.dbconnect;

import java.util.List;
import java.util.Scanner;

public class DBConnectionMain {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		PersonsDAO dao = new PersonsDAO();
//		PersonsVO vo = new PersonsVO();
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("원하는 메뉴를 입력하세요.");
//			System.out.println("select(A)ll : 모든 DB 조회 / select(O)ne : 특정 id 조회 / (I)nsert : DB 데이터 추가 / (U)pdate : 데이터 수정 / (D)elete : 데이터 삭제");
//			String menu = scan.next();
//			menu.toLowerCase();
//			
//			switch (menu) {
//			case "a":
//			case "ㅁ":
//				//Select All
//				System.out.println("+++++ DB 전체 출력 +++++");
//				dao.selectAll();
//				
//				break;
//			case "o":
//			case "ㅐ":
//				//Select One
//				System.out.println("+++++ DB 데이터 검색 +++++");
//				System.out.println("검색할 ID를 입력하세요.");
//				int srcId = scan.nextInt();
//				dao.selectOne(srcId);
//				
//				break;
//			case "i":
//			case "ㅑ":
//				//Insert
//				System.out.println("+++++ DB 데이터 추가 +++++");
//				System.out.println("성(LastName) 입력 : ");
//				String lastname = scan.next();
//				vo.setLastname(lastname);
//				System.out.println("이름 입력 : ");
//				String firstname = scan.next();
//				vo.setFirstname(firstname);
//				System.out.println("나이 입력 : ");
//				
//				int age = scan.nextInt();				
//				if(age < 18) {
//					System.out.println("18세 미만의 데이터는 입력할 수 없습니다.");
//					break;
//				} else {
//					vo.setAge(age);
//				}
//				
//				System.out.println("도시 입력 : ");
//				String city = scan.next();
//				vo.setCity(city);
//				
//				int result = dao.insert(vo);
//				
//				if(result != 0) {
//					System.out.println("데이터 입력 성공!");
//				}else {
//					System.out.println("데이터 입력 실패");
//				}
//				
//				break;
//			case "u":
//			case "ㅕ":
//				System.out.println("+++++ DB 데이터 수정 +++++");
//				System.out.println("수정할 데이터의 ID를 입력하세요.");
//				int editId = scan.nextInt();
//				dao.selectOne(editId);
//				
//				System.out.println("성(LastName) 입력 : ");
//				lastname = scan.next();
//				vo.setLastname(lastname);
//				System.out.println("이름 입력 : ");
//				firstname = scan.next();
//				vo.setFirstname(firstname);
//				System.out.println("나이 입력 : ");
//				
//				age = scan.nextInt();				
//				if(age < 18) {
//					System.out.println("18세 미만의 데이터는 입력할 수 없습니다.");
//					break;
//				} else {
//					vo.setAge(age);
//				}
//				
//				System.out.println("도시 입력 : ");
//				city = scan.next();
//				vo.setCity(city);
//				
//				result = dao.update(vo);
//				
//				if(result != 0) {
//					System.out.println("데이터 수정 성공!");
//				}else {
//					System.out.println("데이터 수정 실패");
//				}
//				
//				
//				break;
//			case "d":
//			case "ㅇ":
//				//Delete
//				System.out.println("+++++ DB 데이터 삭제 +++++");
//				System.out.println("삭제할 아이디를 입력하세요.");
//				int id = scan.nextInt();
//				dao.delete(id);
//				
//				if(dao.delete(id) != 0) {
//					System.out.println("데이터 삭제 성공!");
//				}else {
//					System.out.println("데이터 삭제 실패");
//				}
//				
//				break;
//
//			default:
//				break;
//			}
//		}
		
		//선생님 ver
		
//		PersonsDAO dao = new PersonsDAO();
//		PersonsVO vo = new PersonsVO();
		
		while(true) {
			System.out.println("[PersonsDB 처리 프로그램]");
			System.out.println("1. 전체 조회");
			System.out.println("2. 선택 조회");
			System.out.println("3. 레코드 추가");
			System.out.println("4. 레코드 수정");
			System.out.println("5. 레코드 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 : ");
			int se1 = scan.nextInt();
			
			switch (se1) {
			case 1:
				//전체 조회
				selectAll();
				
				break;
			case 2:
				//선택 조회
				selectOne();
				
				break;
			case 3:
				//레코드 추가
				insert();
				
				break;
			case 4:
				//레코드 수정
				update();
				
				break;
			case 5:
				//레코드 삭제
				delete();
				
				break;
			case 0:
				//종료
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 값을 입력했습니다.");
				break;
			}
		}
		
	}
	
	static void selectAll() {
		PersonsDAO dao = new PersonsDAO();
		List<PersonsVO> list = dao.selectAll();
		for(PersonsVO vo : list) {
			System.out.println(vo);
		}
	}
	
	static void selectOne() {
		PersonsDAO dao = new PersonsDAO();
		System.out.print("출력할 레코드의 ID를 입력하세요 : ");
		PersonsVO vo = dao.selectOne(scan.nextInt());
		System.out.println(vo);
	}
	
	static void insert() {
		PersonsDAO dao = new PersonsDAO();
		PersonsVO vo = new PersonsVO();
		System.out.print("레코드 추가하기");
		
		System.out.println("LastName(성) 입력 : ");
		vo.setLastname(scan.next());
		System.out.println("FirstName(이름) 입력 : ");
		vo.setFirstname(scan.next());
		System.out.println("Age(나이) 입력 : ");
		vo.setAge(scan.nextInt());
		
//		int age = scan.nextInt();				
//		if(age < 18) {
//			System.out.println("18세 미만의 데이터는 입력할 수 없습니다.");
//			break;
//		} else {
//			vo.setAge(scan.nextInt());
//		}
		
		System.out.println("City(도시) 입력 : ");
		vo.setCity(scan.next());
		
		int result = dao.insertPersons(vo);
		
		if(result != 0) {
			System.out.println("레코드 추가를 성공했습니다.");
		}else {
			System.out.println("레코드 추가를 실패했습니다.");
		}
	}
	
	static void update() {
		System.out.print("레코드 수정하기");
		PersonsDAO dao = new PersonsDAO();
		System.out.print("수정할 레코드의 ID를 입력하세요. : ");
		PersonsVO vo = dao.selectOne(scan.nextInt());
		
		System.out.println("LastName("+vo.getLastname()+") 수정 : ");
		vo.setLastname(scan.next());
		System.out.println("FirstName("+vo.getFirstname()+") 수정 : ");
		vo.setFirstname(scan.next());
		System.out.println("Age("+vo.getAge()+") 수정 : ");
		vo.setAge(scan.nextInt());
		System.out.println("City("+vo.getCity()+") 수정 : ");
		vo.setCity(scan.next());
		
		PersonsDAO dao2 = new PersonsDAO();
		int result = dao2.updatePersons(vo);
		
		if(result != 0) {
			System.out.println("레코드 수정을 성공했습니다.");
		}else {
			System.out.println("레코드 수정을 실패했습니다.");
		}
	}
	
	static void delete() {
		PersonsDAO dao = new PersonsDAO();
		System.out.print("삭제할 레코드 ID를 입력하세요. : ");
		dao.deletePersons(scan.nextInt());
		System.out.println("삭제했습니다.");
		
	}
	

}
