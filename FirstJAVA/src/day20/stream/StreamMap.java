package day20.stream;//14

import java.util.Arrays;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		// mapXX() 메서드
		List<String> list = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
		
		System.out.println("함수적 인터페이스 방식");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.print(len+" "));
		System.out.println();
		
		System.out.println("메서드 참조 방식");
		list.stream().mapToInt(String::length).forEach(len -> System.out.print(len+" "));
		//(String::length) = 클래스::메서드명 = String클래스의 length메서드를 호출 = (s -> s.length())와 의미가 같음.
		//"::" = 메서드 호출
		System.out.println();
	}

}
