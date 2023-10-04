package day20.stream;//3

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStream {

	public static void main(String[] args) {
		//컬렉션 프레임워크(Collection, List, Set)
		String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
		
		//문자열 배열을 컬렉션 프레임워크 List로 변환 
		List<String> list = Arrays.asList(arr);
		
		//List 객체를 stream() 메서드를 이용하여 Stream객체로 생성
		Stream<String> stream = list.stream();	//stream() : list를 Stream 객체로 변환
		
		//내부 반복자를 이용해 출력
		stream.forEach(s -> System.out.print(s+ " "));		
	}
}
