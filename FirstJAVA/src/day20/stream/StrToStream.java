package day20.stream;//9

import java.util.stream.IntStream;

public class StrToStream {

	public static void main(String[] args) {
		//문자열 Stream : 문자열을 처리하기 위해서 chars() 메서드를 사용
		String str = "자바 세상을 만들자";
		
		//Stream 객체 생성
		IntStream isr = str.chars();	//char는 숫자로 표현 가능. char 정수 타입이기 때문에 IntStream을 사용함
//		isr.forEach(s -> System.out.print(s + " "));	//숫자로 출력. 캐스팅 필요
		isr.forEach(s -> System.out.print((char)s + " ")); //forEach() : 스트림 객체 내부의 각 엘리먼트를 매개변수로 받아서 실행
		
	}

}
