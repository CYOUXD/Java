package day20.stream;//2

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		//배열을 이용한 스트림 생성하기
		
		//문자열 배열 객체 생성
		String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
		
		//배열 전체 Stream 객체 변환
		Stream<String> stream1 = Arrays.stream(arr);//배열을 스트림으로 바꾸기. 배열 자체를 스트림으로 쓸 수 없어서 변경 후 사용한다.
		stream1.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		//인덱스 지정해서 반환(2부터 5전까지) - 두번째 사용된 인덱스는 포함 X
		Stream<String> stream2 = Arrays.stream(arr, 2, 5);
		stream2.forEach(s -> System.out.print(s+" "));
				
	}

}
