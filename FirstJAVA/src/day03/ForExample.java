package day03;

public class ForExample {

	public static void main(String[] args) {
		// 반복문(Loop) : for, while, do ~ while
		// for문 : 반복 회차가 정해진 경우에 사용
		/*
		 * 	for(초기값; condition; 증가값){
		 * 		조건(condition)이 참인 경우 반복할 문장
		 * 	}
		 */
		
		// 기본
		// 초기값은 for문에 사용할 변수의 초기 값을 의미함
		for(int i = 0; i < 10; i++) {
			System.out.println("i의 값 : "+i);
		}
		
		// 초기값과 증가값의 위치는 변경이 가능함(단. 보기 좋지는 않음)
		int i = 0; // 밖으로 뺀 초기 값
		for (;i < 10;) { // 초기 값과 증감 값을 넣지 않았으므로 각 값을 구분하기 위해 세미콜론을 넣어준다.
			// 반복문 내에서 증감
			System.out.println("i의 값 : "+i);
			i++; // 반복문 내부로 뺀 증감값
		}
		
		// 예제1) for문을 사용하여 1부터 10까지 숫자들의 합을 구하기
		int sum = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		// 예제2) for문을 사용하여 1부터 100 사이의 홀수만 더한 값을 구하기
		int odd = 0;
		for(i=1; i<=100; i++) {
			if(i%2 == 1) odd += i;
		}
		System.out.println("1~100 사이의 홀수만 더한 값 : "+odd);
	}

}
