package day04.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		// 1. 소수(PrimeNumber) 구하기
		// 	소수는 1과 자기 자신만으로 나누어지는 수
		// 	조건문과 반복문을 사용하여 100이하의 소수를 출력하기
		// 	(for문 안에 for문 사용)
		
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		// 	자바의 Scanner 개게를 이용하여 콘솔에 데이터를 입력
		// 	입력된 데이터를 for문을 사용하여 거꾸로 출력하기
		//	(String.charAt(index)를 사용)
		
		// 3. 로또 번호 추출하기
		// 	앞서 배운 난수를 활용하여, 중복되는 번호 없이 1~45 까지의 숫자 중 
		// 	6개의 숫자를 랜덤 추출하고, 콘솔에 출력하기
		// 	(while문에 for)
		
		
		//======== 1. 미완성
//		for(int i=1;i<=100;i++) {			
//			for(int j=1; j<=i; j++) {
//				if(i%j == 0 && !(i<j)) {
//					System.out.print(i);
//				}
//			}
//		}
		
		//======== 1. 선생님ver
		//boolean 알고리즘을 사용 할 수도 있음
//		System.out.println("===== Prime Number =====");
//		int cnt;
//		for(int i = 2; i<=100; i++) {
//			cnt = 0;	// 배수 여부 확인. 0으로 초기화.  각 숫자가 나눠 지는 숫자가 몇 개 있는지 저장
//			for(int j=1; j<=i; j++) {
//				if(i%j == 0) {
//					cnt++;
//				}
//			}
//			//소수인 경우
//			if(cnt == 2) {
//				System.out.print(i+" ");
//			}
//		}
//		
//		//======== 2.
//		Scanner txt = new Scanner(System.in);
//		String letter = txt.nextLine();
//
//		for(int i=letter.length()-1;i>=0;i--) {
//			System.out.print(letter.charAt(i));
//		}
//		
//		txt.close();
		
		//======== 2. 선생님 ver
		System.out.println("\n======= 입력 값 거꾸로 출력하기 =======");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String reverse = "";
		for(int i=str.length(); i>0; i--) {
			reverse += str.charAt(i-1);
			System.out.print(str.charAt(i-1)); //괄호 안은 인덱스 값이므로 1을 빼줌
		}
		System.out.println("거꾸로 문자열 : "+reverse);
		
		//======== 3.
//		int num = 0;
//		int lotto[] = new int[6];
//		int ran = (int)(Math.random()*45)+1;	
//		while(num<6) {
//
//			lotto[num] = ran;
//			int chk =0;
//			
//			ran = (int)(Math.random()*45)+1;
//			for(int j=0; j<num; j++) {
//				if(lotto[j] == ran) {
//					chk++;
//				}
//			}
//
//			if(chk==0) {
//				lotto[num] = ran;
//				num++;
//			}
//			
//		}
//		System.out.print(Arrays.toString(lotto));
		
		//======== 3. 선생님 ver
//		System.out.println("========== 로또 추출 ==========");
//		int[] lotto = {0, 0, 0, 0, 0, 0}; // 혹은 new int[6]으로 초기값을 지정해줘도 됨
//		
//		int index = 0;
//		while(true) {	// 배열의 값이 모두 차는 순간 break를 걸면 되니 무한 루프로 걸어도 됨
//			// 랜덤값 생성
//			int rand = (int)(Math.random()*45)+1;	// 0~44 + 1 > 1~45
//			int i = 0; // index와 비교하기 위해서
//			for(i=0; i<index; i++) {  // 중복 값이 있는지 확인
//				if(rand == lotto[i]) {	// 추첨 된 번호가 중복 된다면 = 중복 된 값이 있다는 뜻
//					break;	//for를 break한다
//				}
//			}
//			if(index == i) {  // 추첨 된 번호 중에 중복 값이 없다는 뜻, 중간에 break가 걸리지 않고 끝까지 비교 완료 했다는 의미
//				//위의 for문에서 break 없이 모두 반복됐다면 i의 값은 후치 증가하여 index값과 같아지기 때문에 i==index라는 뜻은 중복이 없다는 뜻이 된다.
//				lotto[index++] = rand;	// ++가 뒤에 있으므로 계산 후에 1증가한다
//			}
//			if(index > 5) break;  // 배열 내부 값이 다 찬다면 while문 break
//			
//		}
//		// 결과 출력
//		for(int i=0; i<lotto.length;i++) {
//			System.out.print(lotto[i]+"\t");
//			
//		}
//
	}

}
