package day17.quiz2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PbConsole {
	
	static Scanner sc = new Scanner(System.in);
	static PhoneBook book = new PhoneBook();
	static Map<String, String> person = new HashMap<>();
	
	File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\PhoneBook.txt");

	public static void main(String[] args) {
//		PhoneBook book = new PhoneBook();
		while (true) {
			System.out.println("==== What to do ====");			
			System.out.println("1. New Group");
			System.out.println("2. Print");
			System.out.println("3. New Address");
			System.out.println("4. Find Phone");
			System.out.println("5. Find Name");
			System.out.println("6. Exit");
			System.out.print("> ");
			int behavior = sc.nextInt();
			sc.nextLine();
			
			switch (behavior) {
			case 1:
				doNewGroup();
				break;
			case 2:
				printAll();
				break;
			case 3:
				doNewAddress();
				break;
			case 4:	
				findPhone();
			case 5:
			case 6:
			default:
				break;
			}
		}		

	}
	
	public static void doNewGroup() {

		System.out.println("새로운 그룹명을 입력하세요.");
		String newGroup = sc.next();
		boolean hasGroup = book.group.containsKey(newGroup);
		
		if(hasGroup) {//그룹이 이미 존재 할 때
			System.out.println("해당 그룹은 이미 존재합니다.");
			return;
		}else {
			Map<String, String> person = new HashMap<>();
			book.group.put(newGroup, person);			
		}
	}

	public static void printAll() {
		for(Map.Entry<String, Map> list : book.group.entrySet()) {	
			System.out.println(list.getKey() + " : "+list.getValue());
		}
	}
	
	public static void doNewAddress() {
//		Map<String, String> person = new HashMap<>();
		if(book.group.size() > 0) {//그룹이 1개 이상 존재 할 때
						
			System.out.println("전화번호를 추가할 그룹을 입력하세요.");
			String findGroup = sc.next();
			boolean find = book.group.containsKey(findGroup);
			
			//그룹의 기존 person 정보
			Map<String, String> hasData = book.group.get(findGroup);
//			System.out.println(hasData);
			
			if(find) {//추가할 그룹이 있을 때
				//새 전화번호 입력
				System.out.println("추가할 전화 번호를 입력해 주세요.");
				String uNum = sc.next();
				
				boolean have = hasData.containsKey(uNum);
				if(have) {//중복 된 전화번호가 있을 때
					System.out.println("중복 된 전화번호는 추가 할 수 없습니다.");
					return;
				}else {
					//새 이름 입력
					System.out.println("추가할 이름을 입력해 주세요.");
					String uName = sc.next();
					
					//기존 person 데이터 리셋
					Map<String, String> person = new HashMap<>();
					
					//기존의 전화번호와 이름을 가져와서 저장한 후 새 값 추가
//					for(Map.Entry<String, String> newData : hasData.entrySet()) {
//						person.put(newData.getKey(), newData.getValue());
//					}
					person.putAll(hasData);
					
					//데이터 추가
					person.put(uNum, uName);
					book.group.put(findGroup, person);
					return;
				}
			}else {	//추가할 그룹이 존재하지 않을 때
				System.out.println("해당 그룹이 존재하지 않습니다.");
				return;
			}
			
//			System.out.println("그룹이 존재합니다.");
		}else {	//만든 그룹이 하나도 없을 때
			System.out.println("그룹이 없어서 추가할 수 없습니다.");
		}
	}
	
	public static void findPhone() {
		System.out.println("검색할 전화번호를 입력해 주세요.");
		String srcNum = sc.next();
//		person.get(srcNum);
//		for(String num : person.keySet()) {
//			System.out.println(num);
//		}
//		System.out.println(book.group.entrySet());
		for(Map.Entry<String, Map> a : book.group.entrySet()) {
			System.out.println(a.getValue().get(srcNum));
//			System.out.println(a.getValue().);
		}
		
//		if(person.containsKey(srcNum)) {//검색한 번호가 있을 때
//
//		}else {//검색한 번호가 없을 때
//			System.out.println("검색 결과가 없습니다.");
//			
//		}
		
	}
	
	

}
