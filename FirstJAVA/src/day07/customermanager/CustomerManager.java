package day07.customermanager; //같은 파일을 다른 패키지에서 복사해왔지만 자동으로 패키지 이름이 바뀌어서 실행될 수 있게 수정 된다.
//Cusotmer.java의 private 멤버변수가 담겨진 클래스를 가져와서 사용하는 방법

import java.util.Scanner;

import day07.customermanager.oop.Customer;

public class CustomerManager {
		
	// 배열에 저장할 수 있는 최대 고객의 수
	static final int MAX =100;	
	
	//Customer 객체의 배열을 선언 	Customer 클래스에서 get해서 데이터를 가져와서 사용한다.
	static Customer[] cusList = new Customer[MAX]; 
	
	static int index = -1;  

	static int count = 0; 
	
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		// 고객 관리 프로그램의 메뉴
		while(true) {	
			//고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.println("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase(); 
			
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
				if(index<=0) {	
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					index--;	
					printCustomerData(index);	
				}
				break;
			case 'n':	//next
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count-1) {	
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c':	//current
				System.out.println("현재 데이터를 출력합니다.");
				if((index>=0)&&(index<count)) {
					printCustomerData(index);
				} else { 	
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':	//update
				System.out.println("데이터를 수정합니다.");
				if(index>=0 && index<count) { 	
					System.out.println(index+"번째 데이터를 수정합니다.");
					updateCustomerData(index);
				}else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':	//delete
				System.out.println("데이터를 삭제합니다.");
				if(index>=0 && index<count) {	
					System.out.println(index+"번째 데이터를 삭제합니다.");
					deleteCustomerData(index);
				}else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':	//quit
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
				break;			

			default:	//메뉴 이외의 키 값을 입력 했을 때
				System.out.println("메뉴를 잘못 입력했습니다."); 	
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
		int birthYear = scan.nextInt();	
		
		//고객 객체를 배열에 저장(고객정보 = Customer 클래스의 객체)
		Customer c1 = new Customer();
		c1.setName(name);
		c1.setGender(gender);
		c1.setEmail(email);
		c1.setBirthYear(birthYear);
		cusList[count] = c1;
		System.out.println("aaaaa"+c1);

		count++;	
	}
	
	
	//현재 고객 정보 출력
	public static void printCustomerData(int index) {	
		//**private 데이터는 직접 참조가 안되므로 cusList[index].name의 형태가 아니라 getter와 setter 메서드로 가져와서 적용해야 한다.**
		// cusList[] 배열에는 Customer 클래스가 들어 있으므로 Customer 내부의 값을 조작할 때 getter와 setter를 사용한다.
		// 가져와서 보여줄 때는 .get...() 값을 넣을 때는 .set...() 메서드를 사용한다.
		System.out.println("========== CUSTOMER INFO ==========");
		System.out.println("이름 : "+cusList[index].getName());	
		System.out.println("성별 : "+cusList[index].getGender());
		System.out.println("이메일 : "+cusList[index].getEmail());
		System.out.println("출생년도 : "+cusList[index].getBirthYear());
		System.out.println("===================================");
		
	}

	
	//선생님 ver
	public static void updateCustomerData(int index) {
		System.out.println("---------- UPDATE CUSTOMER INFO ----------");
		
		System.out.println("이름("+cusList[index].getName()+") : ");	
		cusList[index].setName(scan.next());			
		System.out.println("성별("+cusList[index].getGender()+") : ");
		cusList[index].setGender(scan.next());
		System.out.println("이메일("+cusList[index].getEmail()+") : ");
		cusList[index].setEmail(scan.next());
		System.out.println("출생년도("+cusList[index].getBirthYear()+") : ");
		cusList[index].setBirthYear(scan.nextInt());
	}	

	
	// 선생님 ver
	public static void deleteCustomerData(int index) {
		for(int i=index; i<count-1; i++) {
			cusList[i] = cusList[i+1];
		}
		count--;
	}
	
	
}
