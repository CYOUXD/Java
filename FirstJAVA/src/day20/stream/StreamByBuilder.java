package day20.stream;//4

import java.util.stream.Stream;

public class StreamByBuilder {

	public static void main(String[] args) {
		// Builder() 메서드를 이용한 Builder 객체 생성
		// add() 메서드를 사용하여 추가 가능
		Stream stream = Stream.builder()		//builder() : Builder 객체를 만들어 줌
				.add("무궁화")
				.add("삼천리")
				.add("화려강산")
				.add("대한사람")
				.build();	//마지막에 build()를 써주면 완성
		//build() 메서드를 사용하여 Stream 객체 생성
		
		//내부 반복자를 사용하여 출력
		stream.forEach(s -> System.out.print(s + " "));
	}

}
