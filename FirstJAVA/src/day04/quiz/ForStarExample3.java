package day04.quiz;

import java.util.Scanner;

public class ForStarExample3 {

	public static void main(String[] args) {
		// 다이아몬드 찍기...?
//		int dan = 9;
//		for(int i = 0; i < dan; i++) {
//			for(int j=0;j<(dan-i)%5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 다이아몬드 찍기_선생님
//		int dan = 5;
//		for (int i=0;i<dan;i++) {
//			for(int j=0; j<dan-i-1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i*2+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<dan-1;i++) {
//			for(int j=0;j<i+1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*(dan-i-1)-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// scan으로 홀수 값을 입력 받고 그 값에 따른 다이아몬드 찍기
//		Scanner scan = new Scanner(System.in);
//		System.out.println("홀수 값을 입력하세요.");
//		int num = scan.nextInt();
//		// 공백 조건, 별 조건, 중간에 반전되는 조건
//		int halfNum = num/2;
//		for(int i =0; i<num; i++) {
//			if(i < halfNum+1) {
//				for(int j=0; j<halfNum-i;j++) {
//					System.out.print(" ");
//				}
//				for(int j=0;j<i*2+1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();			
//			} else {
//				for(int j=0;j<i-halfNum;j++) {
//					System.out.print(" ");
//				}
//				for(int j=0;j<2*(num-i)-1;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}		
//		
//		scan.close();
		
		//다이아몬드 만들기_선생님
//		Scanner scan = new Scanner(System.in);
//		System.out.println("줄 수를 입력하세요 : ");
//		
//		int dan = scan.nextInt();
//		int sp = dan/2;
//		int star = 1;
//		boolean flag = true;
//		
//		for(int i=0;i<dan;i++) {
//			for(int j=0;j<sp;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<star;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			if(i==(dan/2)) flag = false;	// 반전을 위한 중간값 체크
//			if(flag) {
//				sp -=1; star +=2;
//			}else {
//				sp+=1; star -=2;
//			}
//						
//		}
//		scan.close();
		
		//테두리만 남기고 공백으로 바꾸기		
		Scanner scan = new Scanner(System.in);
		System.out.println("줄 수를 입력하세요 : ");
		
		int dan = scan.nextInt();
		int sp = dan/2;
		int star = 1;
		boolean flag = true;
		
		for(int i=0;i<dan;i++) {
			for(int j=0;j<sp;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				if(j==0 || j == star-1) {
					System.out.print("*");					
				}else {
					if((j%2)==0) System.out.print("$");	
					else System.out.print(" ");		
				}
			}
			System.out.println();
			
			if(i==(dan/2)) flag = false;	// 반전을 위한 중간값 체크
			if(flag) {
				sp -=1; star +=2;
			}else {
				sp+=1; star -=2;
			}
						
		}
		scan.close();
		
	}

}
