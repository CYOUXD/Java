package day20.stream;//5

import java.util.stream.Stream;

public class StreamByGenerate {

	public static void main(String[] args) {
		//generate() 메서드를 이용한 Stream 객체 생성
		//Supplier 람다 인터페이스는 반환 타입만 있으므로 값을 넣을 때 사용할 수 있다. 반환 값만 있는데 몇개만 반환할지 정해진게 아니기 때문에 반환값을 정해 놓으면 무한히 반환하게 되므로 limit로 제한해준다
		
		//리미트 설정 10개 - 리미트를 설정하지 않으면 무한반복한다(Stream은 크기 제한이 없음)
//		Stream<String> stream = Stream.generate(() -> "애국가"); //제한이 없으면 애국가를 무한히 만든다
		Stream<String> stream = Stream.generate(() -> "애국가").limit(10);
		
		//내부 반복자로 출력
		stream.forEach(s -> System.out.print(s + " "));
	}

}
