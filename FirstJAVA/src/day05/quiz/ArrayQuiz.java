package day05.quiz;

import java.util.Arrays;

public class ArrayQuiz {

	public static void main(String[] args) {
		// 1. 1000개 짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 랜덤 숫자로 채워보세요.
		// 2. 1000개의 랜덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요.
		
		
		// 1.
//		int num[] = new int[1000];
//		for(int i=0; i<num.length; i++) {
//			int ran = (int)(Math.random()*100)+1;
//			num[i] = ran;
//		}
//		System.out.println(Arrays.toString(num));
//		
//		// 2.
//		int cnt[] = new int[100];
//		for(int i=0; i<num.length; i++) {
//			int same = num[i];
//			cnt[same-1]++;
//		}
//		for(int j=0; j<cnt.length;j++) {
//			System.out.println((j+1)+"의 중복 개수 : "+cnt[j]);
//		}
		
		
		// 1. 선생님 ver
		int[] num = new int[1000];
		
		for(int i=0; i<1000; i++) {
			num[i] = (int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
		// 2. 선생님 ver
		int[] cnt = new int[100];
		for(int j=1; j<=100; j++) {
			for(int i=0; i<num.length; i++) {
				if(j==num[i]) {
					cnt[j-1]++;
				}
			}
		}
		int check = 0;  // 검증 : 전체 저장 값에 들어간 개수가 총 개수인 1000이 맞는지 확인
		for(int i=0; i<cnt.length; i++) {
			System.out.println((i+1)+"이 나온 횟수 : "+cnt[i]);
			check += cnt[i];	// 내부에 중복된 개수가 몇갠지가 전부 누적되면 총 1000개 이므로 cnt 배열 내부의 수를 모두 더했을 때 check = 1000;
		}
		System.out.println(check); //1000
		
	}

}
