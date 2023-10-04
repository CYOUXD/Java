package day20.stream;//15

import java.util.Arrays;

public class StreamOther {

	public static void main(String[] args) {
		// 
		int intArr[] = {10, 20 , 30 , 40 , 50, 60};
		
		//double 타입의 요소를 갖는 DoubleStream으로 형변환
		Arrays.stream(intArr).asDoubleStream().forEach(d -> System.out.println(d));
		//Arrays.stream(intArr) = 인트 스트림
		//Arrays.stream(intArr).asDoubleStream() = 더블 스트림   
		//asDoubleStream : double 타입으로 형변환 시켜줌
		System.out.println();
		
		//int 타입의 요소를 갖는 intStream -> Stream<Integer>로 형변환. 자료형 타입을 객체 타입으로 변환
		//boxed() : int -> Integer, long -> Long, double -> Double
		Arrays.stream(intArr).asDoubleStream().boxed().forEach(i -> System.out.println(i.getClass()));
		//Arrays.stream(intArr).boxed().forEach(i -> System.out.println(i.getClass()));
		//asDoubleStream()를 빼면 int -> Integer로 바뀜. 캐스팅
		
	}

}
