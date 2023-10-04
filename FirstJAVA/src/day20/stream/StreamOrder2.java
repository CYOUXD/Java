package day20.stream;//17-4

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder2 {
//Shape 객체의 크기 비교
	public static void main(String[] args) {
		//Shape를 상속 받는 자식들은 Shape의 area()에 따라서 비교한다.
		
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println("오름차순 정렬");
		list.stream().sorted().forEach(System.out::println); // = a.compareTo(b) 만 동작하는 것과 같음
		
		System.out.println("내림차순 정렬1");
		list.stream().sorted((a, b) -> b.compareTo(a) - a.compareTo(b))	//b.compareTo(a) = b - a =10   a.compareTo(b) = a - b = -10  -> 10 - (-10) = 20(양수) = a, b 자리 바꿈
			.forEach(System.out::println); 
		//일반 객체에서 sorted를 쓰려면 Comparator를 구현한 클래스를 사용해야 한다. 
		System.out.println("내림차순 정렬2");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//기본 비교 방식은 area() 넓이로 비교
		//둘레(length())를 기준으로 비교 정렬하고 싶은 경우!!
		List<Shape> list2 = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println("정렬하지 않고 출력");
		list2.stream().forEach(System.out::println);
		
		System.out.println("둘레(length()) 순으로 정렬");
		System.out.println("함수적 인터페이스로 구현");
		list2.stream().sorted(new Comparator<Shape>() {
			@Override
			public int compare(Shape o1, Shape o2) {
				return (int)(o1.length()-o2.length());
			}
		}).forEach(System.out::println);
		
		System.out.println("람다표현식을 이용하여 둘레순으로 정렬");
		list2.stream().sorted((a, b) -> (int)(a.length() - b.length())).forEach(System.out::println);
		
	}

}
