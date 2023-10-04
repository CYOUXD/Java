package day14.collection.quiz;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetQuiz {

	/*
	 * TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!
	 * 1. TreeSet을 생성하세요
	 * 2. 무한루프를 사용하여 1~45까지의 난수를 발생시키세요
	 * 3. 발생한 난수를 추가합니다.
	 * 4. 크기가 6이되면 무한루프를 빠져나옵니다.
	 */
	
	public static void main(String[] args) {		
//		TreeSet<Integer> lotto = new TreeSet<>();	// <>안에 int가 아니라 Integer라고 넣어야 함. int는 객체가 아니고 데이터 타입이라 integer를 넣어야 한다. Integer는 객체이다. Integer를 wrapper로 만든게 int이기 때문
//		
//		while(lotto.size()<6) {
//			int a = (int)(Math.random()*45)+1;
//			lotto.add(a);
//		}
//		System.out.println(lotto);	// TreeSet - 자동 정렬, 중복 제거
		
		
		
		// 선생님 ver
		//1.
		TreeSet<Integer> lotto = new TreeSet<>();
		
		//2.
		Random r = new Random();
		while(true) {
			int rn = r.nextInt(45)+1;	//난수 생성
			
			//3.
			lotto.add(rn);
			
			//4.
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		
	}
	
	

}
