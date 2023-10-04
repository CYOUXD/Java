package day21.stream;//4

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import day20.stream.Circle;
import day20.stream.Rectangle;
import day20.stream.Shape;

public class StreamGroupingBy {

	public static void main(String[] args) {
		// GroupingBy() : Map 객체로 생성!
		Shape s1 = new Rectangle(10, 3);
		System.out.println("s1(Rectangle)의 getClass 값 : "+s1.getClass());
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		try {
			//객체 타입으로 그룹핑(Rectangle, Circle)
			Map<Object,	List<Shape>> map = list.stream()
					.collect(Collectors.groupingBy(f -> f.getClass())); 
			//collect를 사용한 후 groupingBy로 값을 구분해서 객체를 생성
			//groupingBy를 쓴다는 것은 Map객체를 만든다는 의미이기 때문에 Map 객체로 받아준다.
			//getClass로 groupingBy의 기준 값을 정해서준 것. 여기서는 클래스가 기준 값이 되기 때문에 map의 키 값은 클래스가 된다.
			//키 값은 getClass로 가져온 Rectangle과 Circle이고 value는 각 클래스의 값이다.
			//키 : Rectangle, Circle / value : 각 클래스 내부의 값 Rectangle(10, 3);, Rectangle(20, 2);, Circle(10);, Circle(11);
			System.out.println("사각형 출력");
			//Object : 클래스가 들어감
			
			//groupingBy는 그룹핑 기준을 getClass()를 사용한다. getClass()는 해당 객체의 클래스를 말한다.
			
			map.get(Class.forName("day20.stream.Rectangle")).stream().forEach(f -> System.out.println(f));
			//Class.forName : 특정 클래스가 있는지 검색
			
			map.get(Class.forName("day20.stream.Circle")).stream().forEach(f -> System.out.println(f));
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
