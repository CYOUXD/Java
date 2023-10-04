package day06;

import java.util.Scanner;

public class CustomerManager {
	
	/*
	 * 1. 변수 선언
	 * 2. 인덱스 
	 * 3. 카운터
	 * 4. txt ui = 메뉴 만들기
	 * 5. 메뉴 선택시 동작 구현
	 * 6. 고객 데이터 입력 메서드
	 * 7. 고객 데이터 출력 메서드
	 * 8. 고객 데이터 수정 메서드
	 * 9. 고객 데이터 삭제 메서드
	 */
	
	// 배열에 저장할 수 있는 최대 고객의 수
	static final int MAX =100;	// static이 붙었으니까 멤버변수면서 클래스 변수, 메인 메서드가 static이므로 static사용
	
	// 고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도
	static String[] nameList = new String[MAX];		//이름 저장
	static String[] genderList = new String[MAX];	//성별 저장
	static String[] emailList = new String[MAX];	//이메일 저장
	static int[] birthYearList = new int[MAX];		//출생년도 저장
	
	//인덱스 값을 메서드 안에 저장하면 메서드가 끝나면서 사라지기 때문에 미리 정의해 둔다
	//배열을 참조하기 위해서 인덱스가 필요함
	static int index = -1; // 배열은 0번부터 시작하기 때문에 최초의 인덱스는 -1이어야 한다.  
	// 참조할 데이터가 없는 상태 이니까 -1로 시작하고 데이터가 들어가면서 0이 되어 참조를 시작한다.
	//0이라고 시작하면 첫번째 값을 참조하게 되는데 첫번째 사용자 값이 없을때는 참조하지 않아야 하므로 -1부터 시작해야 한다.
	// -1이라는건 고객정보가 없다는 뜻
	
	//배열의 처음 선언한 크기보다 같거나 작은 개수의 자료를 저장
	//그래서 현재 데이터가 몇 개 저장되어 있는지 알 수 있는 변수를 선언
	static int count = 0;  //저장된 데이터의 개수
	
	//기본 입력 장치로부터 데이터를 입력 받기 위해서 Scanner 객체 생성
	static Scanner scan = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		// 고객 관리 프로그램의 메뉴
		while(true) {	//프로그램을 종료하기 전까지 작업이 계속 이어져야하기 때문에 while(true)를 사용
			//고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.println("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();  //입력 받은 값을 모두 소문자로 바꿔서 대소문자 상관없이 입력가능하게 한다.
			
			//메뉴 선택시 동작을 구현...
			switch (menu.charAt(0)) {	//입력받은 첫번째 글자 체크
			case 'i':	//insert
				System.out.println("고객 정보 입력을 시작합니다.");
				if(count>=MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");
				}else {
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 'p':	//previous
				System.out.println("이전 데이터를 출력합니다.");
				if(index<=0) {	// index가 0이거나 0보다 작으면 이전 데이터가 없다는 뜻
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					index--;	//여기서 줄여야 현재 index가 앞으로 보여줄 이전 데이터의 index가 된다.
					printCustomerData(index);	//여기서 줄이면 index 값이 변경되지 않는다.
				}
				break;
			case 'n':	//next
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count-1) {	//count-1과 index값이 같으면 현재 데이터가 마지막 데이터라는 뜻, 더 크면 오류라는 뜻
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c':	//current
				System.out.println("현재 데이터를 출력합니다.");
				// index(=현재 데이터 위치)가 count값 보다 크면 없는 데이터에 접근하는 것이기 때문에 오류이므로 index가 count보다 작아야 한다.
				if((index>=0)&&(index<count)) {
					printCustomerData(index);
				} else { 	//출력한 데이터가 없을 때
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':	//update
				System.out.println("데이터를 수정합니다.");
//				updateCustomerDate(index);
				if(index>=0 && index<count) { 	//현재 만들어진 전체 데이터 영역이라는 뜻. 영역 제한을 걸지 않으면 오작동이 일어날 수 있다. 예측 못할 에러를 막거나 최소화 하기 위해서 영역을 지정해 준다.
					System.out.println(index+"번째 데이터를 수정합니다.");
					updateCustomerData(index);
				}else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':	//delete
				System.out.println("데이터를 삭제합니다.");
//				deleteCustomerData(index);
				if(index>=0 && index<count) {	//현재 만들어진 데이터 영역 내에서만 작동하라는 의미
					System.out.println(index+"번째 데이터를 삭제합니다.");
					deleteCustomerData(index);
				}else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':	//quit
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);	//프로세스 종료
				break;			

			default:	//메뉴 이외의 키 값을 입력 했을 때
				System.out.println("메뉴를 잘못 입력했습니다."); 	
				//break가 없어야 다시 반복할 수 있다.
			}
		}
	}
	
	// 고객 데이터 입력 추가
	public static void insertCustomerData() {
		//이름, 성별, 이메일, 출생년도
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.println("출생년도 : ");
		int birthYear = scan.nextInt();		//next()는 문자든 숫자든 상관없이 모두 문자형으로 바꿔줘서 상관없는데 nextInt()는 숫자만 입력해야 한다.
		
		//고객 객체를 배열에 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++;		//count번 째 배열에 객체를 저장한 후 count값 증가
	}
	
	
	//현재 고객 정보 출력
	public static void printCustomerData(int index) {	//출력이니까 매개변수로 데이터를 전달해야한다. 매개변수 = 지역변수
		System.out.println("========== CUSTOMER INFO ==========");
		System.out.println("이름 : "+nameList[index]);
		System.out.println("성별 : "+genderList[index]);
		System.out.println("이메일 : "+emailList[index]);
		System.out.println("출생년도 : "+birthYearList[index]);
		System.out.println("===================================");
		
	}
	
	//현재 고객 데이터 수정
//	public static void updateCustomerDate(int index) {		//현재 보고 있는 index의 데이터를 수정
//		System.out.print("이름 : ");
//		String name = scan.next();
//		System.out.print("성별(M/F) : ");
//		String gender = scan.next();
//		System.out.print("이메일 : ");
//		String email = scan.next();
//		System.out.println("출생년도 : ");
//		int birthYear = scan.nextInt();		//next()는 문자든 숫자든 상관없이 모두 문자형으로 바꿔줘서 상관없는데 nextInt()는 숫자만 입력해야 한다.
//		
//		//새 데이터 객체를 배열에 저장
//		nameList[index] = name;
//		genderList[index] = gender;
//		emailList[index] = email;
//		birthYearList[index] = birthYear;
//	}
	
	//선생님 ver
	public static void updateCustomerData(int index) {
		System.out.println("---------- UPDATE CUSTOMER INFO ----------");
		
		System.out.println("이름("+nameList[index]+") : ");	//기존 값과 비교하기 위해 보여주는 것
		String name = scan.nextLine();
		if(name.length()!=0) {		//새 값을 입력하지 않으면 기존 데이터를 바꾸지 않고 값을 입력하면 데이터를 바꿔준다.
			nameList[index] = scan.next();			
		}
		System.out.println("성별("+genderList[index]+") : ");
		genderList[index] = scan.next();
		System.out.println("이메일("+emailList[index]+") : ");
		emailList[index] = scan.next();
		System.out.println("출생년도("+birthYearList[index]+") : ");
		birthYearList[index] = scan.nextInt();
	}
	
	//현재 고객 데이터 삭제
//	public static void deleteCustomerData(int index) {

//		for(int i=index;i<count; i++) {	
//			if(index == count-1) {
//				count--;	//배열의 마지막 데이터를 지웠을 겨우엔 데이터를 땡겨오지 않고 count만 줄여서 마지막 배열을 가려준다.
//			}else {
//				nameList[index] = nameList[index+1];		//배열 안의 값을 index가 아니라 i로 했어야 했다
//				genderList[index] = genderList[index+1];
//				emailList[index] = emailList[index+1];
//				birthYearList[index] = birthYearList[index+1];		
////				count--;	//삭제 후 빈 자리로 데이터를 땡겨온 후 마지막 배열 칸을 count에서 없애준다.			
//			}
//		}
	
//		if(index ==count-1) {
//			count--;
//		}else {
//			for(int i=index;i<count; i++) {
//				nameList[i] = nameList[i+1];
//				genderList[i] = genderList[i+1];
//				emailList[i] = emailList[i+1];
//				birthYearList[i] = birthYearList[i+1];					
//			}
//			count--;
//		}
//	}
	
	
	// 선생님 ver
	public static void deleteCustomerData(int index) {
		for(int i=index; i<count-1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthYearList[i] = birthYearList[i+1];
			
		}
		count--;
	}
	
	
}
