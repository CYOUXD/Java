package Homework;

public class Main {

	public static void main(String[] args) {
		// ------- 1 선생님 ver
//		Bread a = new Bread(500,"피자빵");
//		a.info();
//		Bread b = new Bread(1000,"딸기케익");
//		b.info();
		
//		// ------- 2
//		//방법1 이걸 쓰려면 bread 클래스의 static을 public으로 써야한다. static도 접근 제한자
//		Person a = new Person();
//		a.info("홍길동", 19);
//		a.info("김길동", 30);
//		
//		//방법2 객체 선언하지 말고 클래스를 가져와서 쓰기
//		//다른 클래스의 static 메서드 사용 방법
//		//static 메서드 객체 선언을 안해도 불러올 수 있어서 객체 선언을 하고 불러오면 경고창이 뜸
////		Person.info("홍길동", 19);
////		Person.info("김길동", 30);
		
//		Person p1 = new Person("홍길동", 19);
//		p1.info();
//		Person p2 = new Person("김길동", 30);
//		p2.info();
		
//		// ------- 3
//		Person2 p1 = new Person2("홍길동", 20, 180);
//		p1.info();
//		Person2 p2 = new Person2("김길동", 40, 170);
//		p2.info();
		
//		// ------- 4
//		Account myAcc = new Account("홍길동", 1234, 3600);
//		
//		myAcc.deposit(800);
//		myAcc.withDraw(1900);
//		
//		int bal = myAcc.getbalance();
//		System.out.println(myAcc.name+"님의 계좌 잔액은 : "+bal+"원입니다.");
		
//		// ------- 5(상속)
//		Wizard p1 = new Wizard("마법사", "구르미그린달빛", 500, 1000);
//		p1.info();
//		p1.iceArrow();
//		Warrior p2 = new Warrior("전사", "강한친구대한전사", 1000, 500);
//		p2.info();
//		p2.bash();
//				
		
//		// ------- 6
//		Player p1 = new Wizard("마법사");
//		p1.action();
//		Player p2 = new Warrior("전사");
//		p2.action();
		
//		// ------- 7
//		Calculator cal = new Calculator();
//		cal.add(1);
//		System.out.println("cal의 누적값 : "+cal.result);
//		cal.add(2, 3);
//		System.out.println("cal의 누적값 : "+cal.result);
//		cal.add(1, 2, 3);
//		System.out.println("cal의 누적값 : "+cal.result);
//		cal.add(1, 2, 3, 4);
//		System.out.println("cal의 누적값 : "+cal.result);
//		
//		// ------- 7-1
//		ArrayPrint ap = new ArrayPrint();
//		String[] sArr = {"감자", "고구마", "당근"};
//		int[] iArr = {1, 2, 3, 4, 5};
//		char[] cArr = {'가', '나'};
//		
//		ap.printArray(sArr);
//		ap.printArray(iArr);
//		ap.printArray(cArr);
		
		// ------- 8
		System.out.println("----마법사----");
		Wizard play1 = new Wizard("구르미그린달빛");
		play1.info();
		
		System.out.println("----전사----");
		Warrior play2 = new Warrior("강한친구대한전사");
		play2.info();
		
		
		
		
		
		
		
		

	}

}

////------- 7-1
//class ArrayPrint {
//	void printArray(String[] sArr) {
//		for(int i=0; i<sArr.length; i++) {
//			System.out.print(sArr[i]+" ");
//		}
//		System.out.println();
//	}
//	void printArray(int[] iArr) {
//		for(int i=0; i<iArr.length; i++) {
//			System.out.print(iArr[i]+" ");
//		}
//		System.out.println();
//	}
//	void printArray(char[] cArr) {
//		for(int i=0; i<cArr.length; i++) {
//			System.out.print(cArr[i]+" ");
//		}
//		System.out.println();
//	}
//}







