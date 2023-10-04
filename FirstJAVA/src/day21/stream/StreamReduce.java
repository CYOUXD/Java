package day21.stream;//2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day20.stream.Circle;
import day20.stream.Rectangle;
import day20.stream.Shape;

public class StreamReduce {
//집계 메서드
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		//Stream에서 제공하는 집계 메서드 사용
		double areaSum = list.stream().mapToDouble(Shape::area).sum(); //Shape의 area가 default여서 오류가 났음. public으로 변경
		System.out.println("sum()을 이용한 면적 합계 : "+areaSum);
		
		//reduce() 사용
		areaSum = list.stream().mapToDouble(Shape::area)
				.reduce((a, b) -> a+b).getAsDouble(); //reduce의 반환 타입은 OptionalDouble[]이기 때문에 getAsDouble로 값을 꺼내준다
		System.out.println("reduce(Operater)를 이용한 면적 합계 : "+areaSum);
		
		areaSum = list.stream().mapToDouble(Shape::area)
				//.reduce(기본값, op)
				.reduce(0, (a, b) -> a+b); 
		//***위의 result는 반환 값이 OptionalDouble[]값이기 때문에 getAsDouble이 필요한거고 이 reduce의 계산식은 결과 값만 반환하기 때문에 getAsDouble이 필요없다.
		System.out.println("reduce(0, Operater)를 이용한 면적 합계 : "+areaSum);
		
		
	}

}
