package day02;

public class CharExample {

	public static void main(String[] args) {
		char one = 'A'; //char는 '' String은 ""
		char two = '\t'; // \t = 탭 간격을 나타내는 문자
		
		/* 이스케이프 문자
		 * '\n' : 줄바꿈 (New Line(\u000A))
		 * '\t' : Tab(8자리 간격)(\u0009)
		 * '\b' : Backspace(뒤로가기. 삭제 아님)(\u0008)
		 * '\r' : Return(\u000D)
		 * '\f' : Form Feed(\u000C)
		 * '\\' : Backslash(\u005C)
		 * '\'' : Single Quote(\u0027)
		 * '\"' : Double Quote(\u0022)
		 */
		
		
		char three = '\uAC00'; //16진수 4자리 입력 = 한글 '가'
		String four = "\uD604\uC218";
		String five = "dream";
		System.out.printf("%c, %c, %c, %s %s", one, two, three, four, five); //%c = char  %s = string
		
		/*
		 * String 클래스를 이용한 변수 선언 (자료형이지만 클래스이기도하다)
		 * 	String s1 = "Hello"; //변수 선언 및 할당
		 * 	String s2 = new String("Hello"); //객체 생성
		 * 	String s3; //default 값은 null 객체의 기본 값는 null
		 * 	String s4 = ""; //null String, 길이 0. 초기 값으로 아무것도 안집어 넣었기 때문에 null이 들어감
		 * 	String s5 = " "; //blank String, 길이 1. 위랑 다름 null이 아니라 공백
		 * 
		 * 문자열과 다른 타입을 "+" 연산하게 되면 무조건 문자열로 변환
		 * 	예) 100+200 = 300, 100+"200" = 100200
		 * 	예) 10+20+"Hello" = 30Hello
		 * 	예) "Hello"+10+20 = Hello1020
		 */
		
		//char 문자형은 정수 0 ~ 65535의 범위 값을 가짐
		char t1 = 'A'+ 100;
		int t2 = 'A'+'A';
		System.out.printf("\nt1에 A의 값 : %d", t2);

	}

}
