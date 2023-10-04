package day05.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		/*
		 * 배열 + 이전 배운 것들 퀴즈
		 * 
		 * 1. 대문자가 입력된다면 소문자로 출력하고, 소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해 보세요.
		 * 
		 * 2. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 커피는 1500원을 받는다.
		 * 	    커피의 개수를 입력받고, 총 가격이 얼마인지 계산하여 출력하는 프로그램을 만들어보세요.
		 * 
		 * 3. 랜덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어보세요.
		 * 	    출력은 10개 마다 줄바꿈해서 출력되게 해주세요.
		 * 	    예 > ASFEGSEFSE
		 * 		  ASDFEGSEFE
		 * 		  ... 
		 * 
		 */
		
		// ======= 1.
//		Scanner al = new Scanner(System.in);
//		System.out.println("영문자를 입력하세요 >");
//		String cng = al.nextLine();
//		
//		for(int i=0; i<cng.length(); i++) {
//			int inNum = cng.charAt(i);
//			if(cng.charAt(i)>96) {
//				inNum -= 32;
//			} else {
//				inNum += 32;
//			}
//			char cngTxt = (char)inNum;
//			System.out.print(cngTxt);
//		}
		
		
		// ======= 2.
//		Scanner num = new Scanner(System.in);
//		System.out.println("커피 개수를 입력하세요 >");
//		int coffee = num.nextInt();
//		
//		int price[] = {2000, 1500};
//		int sum = 0;
//		
//		for(int i=1;i<=coffee; i++) {
//			if(i<10) {
//				sum += price[0];
//			} else {
//				sum += price[1];
//			}
//		}
//		System.out.println("총 가격 : "+sum);

		// ======= 3.
//		for(int i=1; i<=50; i++) {
//			
//			int ran = (int)(Math.random()*25)+66;
//			char alpha = (char)ran;
//			
//			if(i%10==0) {
//				System.out.print(alpha+"\n");
//				
//			} else {
//				System.out.print(alpha);
//			}
//			
//		}
		
		
		
		
		
		
		// ======= 1. 선생님 ver
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("영문자를 입력하세요 >");
//		char ch = scan.nextLine().charAt(0);	
//		
//		if(ch >= 'A' && ch <= 'Z') {	// 문자끼리 계산할 때는 자동으로 short 정수 값으로 취급되어 계산 됨. 계산 한 후에는 정수 값으로 사용할지 문자값으로 사용할지 캐스팅해서 자료형을 지정해 줘야함.
//			ch = (char)(ch - 'A'+'a');	// 특정 값에서 대문자 A를 빼고 소문자 a 값을 더하면 특정 문자의 소문자 위치를 알 수 있음
//		}else if(ch >='a' && ch <= 'z') {
//			ch = (char)(ch - 'a' + 'A');
//		}
//		System.out.println(ch);
//		
//		// String.toUpperCase() : 문자열을 대문자 문자로로 변경, 한글x
//		// String.toLowerCase() : 문자열을 소문자 문자열로 변경
//		System.out.println("Hello, world".toUpperCase());	// HELLO, WORLD
//		System.out.println("Hello, world".toLowerCase());	// hello, world
		
		
		// ======= 2. 선생님 ver
		System.out.println("커피 값 계산 프로그램");
		System.out.println(">");
//		Scanner scan =new Scanner(System.in);
		int qty = scan.nextInt();	// 몇 잔?
		int price = 0;	// 커피 가격
		int normal_price = 2000;
		int discount_price = 1500;
//		if(qty>10) {			// if 사용할 때
//			price += (10*normal_price)+(qty-10)*discount_price;
//		}else {
//			price += qty*normal_price;
//		}
		
		switch (qty/10) {		// switch 사용 할 때
		case 0 : //10잔 미만
			price += qty * normal_price;
			break;
		default:
			price += (10*normal_price)+(qty-10)* discount_price;
			break;
		}
		
		System.out.println("커피 가격은"+price+"입니다.");
		
		
		
		
		
		// ======= 3. 선생님 ver
//		int symbol_size = 'Z' - 'A' + 1; //26	대문자 숫자 범위를 알기 위한 식
//		for(int i=0; i<50; i++) {	// 랜덤 값 50개
//			char ch3 = (char)(Math.random()*symbol_size + 'A');	// 65숫자를 몰라도 'A'라고 쓰면 된다.
//			System.out.print(ch3);
//			if(i%10==9) {	// 0~9 번째에 줄바꿈
//				System.out.println();
//			}
//		}
		
		

	}

}
