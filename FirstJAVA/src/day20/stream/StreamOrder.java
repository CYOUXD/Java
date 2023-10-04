package day20.stream;//16

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {
//String은 이미 Comparable을 구현하고 있음
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김유신", "이순신", "유관순");
		
		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //Comparator.reverseOrder() - 역정렬
		System.out.println();
		

	}

}
