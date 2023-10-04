package day04;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// while 문
		// for문 보다 자유도가 더 높은 반복문
		// why? for문은 (시작값; 조건; 증가값)
		// 하지만 while은 조건만으로 반복 처리
		
		/*
		 * 		while (condition) {
		 * 			조건이 참일 때 실행할 문장
		 * 		}
		 * 
		 */
		
		// 증가값 위치에 따라서 결과에 차이가 생김
		
//		int i = 0;	// 시작값
//		
//		while(i<10) { // 조건
//			//i++;  // 증가값 위치에 따른 결과 차이
//			System.out.println(i);
//			i++;
//		}
		
		// while의 무한 루프
//		while (true) {
//			System.out.println(i += 10000);	// !!! int의 범위를 넘어섰기 때문에 2진수 기준 가장 앞이 1이 되어 -음수가 되기 때문에 마이너스 값이 나오게 된다.
//			if(i%20000 == 0) 
//				continue;
//			if(i<0) 
//				break;
//		}
		
		// do ~ while 구문 : 거의 안씀
		// 반복할 때 무조건 한 번 이상 실행해야 하는 경우
		
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		
//		while(((i=scan.nextInt()) != 0)) {
//			System.out.println("i가 0이 아닙니다.");
//		}

		do {
			System.out.println("> ");
			i = scan.nextInt();
			System.out.println("i가 0이어도 일단 한 번 실행합니다.");
		} while(i!=0);
		
		scan.close();
		
		
		

	}

}
