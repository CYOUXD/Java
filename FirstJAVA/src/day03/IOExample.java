package day03;

//패키지는 소문자로만 구성됨. 대/소문자로 패키지와 클래스를 쉽게 구분
import java.util.Scanner;	//java.util 패키지 Scanner 클래스


public class IOExample {

	public static void main(String[] args) {
		// Scanner 클래스는 입력 값을 받아서 처리하는 객체
		Scanner scan = new Scanner(System.in); //new : 참조할 객체 값을 만들어 준다
		
		// 사용자의 입력
		// next()는 한 단어를 nextLine()은 한 문장 읽기
		System.out.print(">");
		//String line = scan.next(); // next() : 입력 값의 공백(space, tab, enter)까지 입력값으로 처리 = 단어 = String
		String line = scan.nextLine(); // nextLine() : 입력값 중 enter("\n")까지 입력 처리 = 문장
		System.out.println("사용자가 입력한 문자열 : "+ line);
		
		// 참조 타입 변수에 "."을 찍은 후에 Ctrl + Space를 사용하여 그 타입에서 사용할 수 있는 기능들(= 메서드)을 볼 수 있음
//		System.out.print("has next boolean : ");
//		boolean b = scan.hasNextBoolean(); //boolean의 포함 여부 판단 띄어쓰기 전까지만 판단하기 때문에 aaa true 라고 쓰면 false로 뜬다
//		System.out.println("boolean 포함 여부 : "+ b);
		
		// 사용자 입력을 기다리고 
		// 사용자가 입력한 정수 값을 읽어들임
		System.out.print("아무 정수 값이나 입력하세요 >>>");
		int num = scan.nextInt(); //정수를 입력 받아서 처리한다.
		System.out.println("사용자가 입력한 정수 : " + num);
		System.out.println("사용자가 입력한 정수로 만든 char : "+ (char)num);
		
		// 객체 정리하는 close : 객체는 힙메모리에 생성되므로 힙메모리를 지우는 것과 같다
		scan.close();
		
	}

}
