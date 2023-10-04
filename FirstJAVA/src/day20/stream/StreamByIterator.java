package day20.stream;//6

import java.util.stream.Stream;

public class StreamByIterator {

	public static void main(String[] args) {
		//Iterate() 메서드를 이용한 Stream 객체 생성
//		Stream<Integer> stream = Stream.iterate(시드 값, Operator);	//시드 값(시작 값)을 Operator가 매개변수(n)로 받아서 연산(n+1)한 값을 "매개변수에 반환". 시드값은 처음에 한번만 넣는 값.
		Stream<Integer> stream = Stream.iterate(1, n -> n+1).limit(10);
		//내부 반복자를 이용하여 출력
		stream.forEach(s -> System.out.print(s + " "));
				
		
	}

}
