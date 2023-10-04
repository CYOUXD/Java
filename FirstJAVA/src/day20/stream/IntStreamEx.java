package day20.stream;//7

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {

	public static void main(String[] args) {
		//IntStream의 range(), rangeClosed() 메서드 사용
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Arrays.stream() IntStream 생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStrea 생성하기");
		IntStream intstream2 = IntStream.of(arr); 
		intstream2.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		//두번째 매개변수 인덱스 포함 안함
		System.out.println("IntStream.range(10,16) IntStream 생성하기");
		IntStream intstream3 = IntStream.range(10, 16);	//range() : 사이의 값으로 스트림 객체로 만들어 줌. 내가 정한 정수로 스트림 객체를 만들어 줌.
		intstream3.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		//두번째 매개변수 인덱스 포함
		System.out.println("IntStream.range(10,15) IntStream 생성하기");
		IntStream intstream4 = IntStream.rangeClosed(10, 15);
		intstream4.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		
	}

}
