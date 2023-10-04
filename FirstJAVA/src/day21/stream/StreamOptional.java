package day21.stream;//1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		//집계함수
		int[] arr = new int[100];
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
		}
		
		//리턴값 long
		long count = Arrays.stream(arr).count();	//***IntStream 타입이기 때문에 내부에는 int들이 있다. Stream<Integer>와 구분하기
		System.out.println("요소들의 갯수 : "+count);
		
		//리턴값 int
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : "+sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();//OptionalInt의 첫번째 값을 가져옴 = OptionalInt[1];
		System.out.println("요소들 중 첫번째 값 : "+first.getAsInt());//OptionalInt로 넘어간 값(OptionalInt[1])은 getAsInt()로 빼온다
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : "+max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최소 값 : "+min.getAsInt());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균 값 : "+avg.getAsDouble());
		
		//OptionalXXX인 클래스들은 기능이 거의 유사함
		//isPresent() - 반환 타입 boolean, 값이 존재하는 여부
		//otElse(T)	  - 반환 타입 T, 기본값 설정. 가져올 값이 없으면 내가 설정한 T로 반환 
		//ifPresent(Consumer) - 반환 타입 void, 값이 존재하는 경우 Consumer 처리
		//Optional은 특정 값을 얻기 위해 사용함. 특정 값을 얻으려할 때 그 값이 없으면 예외처리가 발생함. 그러므로 그 값이 있는지 없는지 조건문으로 확인해야 한다.
		System.out.println("Optional 주요 메서드 확인");
		//요소가 없는 빈 ArrayList 객체 생성
		List<Integer> list = new ArrayList<>();
		
		long count1 = list.stream().count();
		System.out.println("요소들의 갯수 :"+count1);
		
		long sum1 = list.stream().mapToInt(Integer::intValue).sum(); 
		//***Stream<Integer> 타입이므로 Integer객체를 안에 집어 넣음. 객체는 바로 계산 할 수 없기 때문에 mapToInt가 필요함
		//mapToInt : Integer를 계산 할 수 있도록 int로 바꿈
		System.out.println("요소들의 합 :"+sum1);
		
		//요소가 존재하는경우에만 평균을 출력
		OptionalDouble avg2 = list.stream().mapToInt(Integer::intValue).average();
		if(avg2.isPresent()) { //isEmpty : 없다면(java11이상에서 사용), isPresent : 있다면
			System.out.println("요소들의 평균 : "+avg2.getAsDouble());
			//값이 없어서 평균이 나오지 않음. 값이 없는데 접근하려하면 예외처리 발생함
		}
		
		OptionalInt max2 = list.stream().mapToInt(Integer::intValue).max();
		if(max2.isPresent()) { 
			System.out.println("요소들 중 최대 값 : "+max2.getAsInt());			
		}
		
		int min2 = list.stream().mapToInt(Integer::intValue).min().orElse(0); //orElse(0) : 값이 없다면 기본값을 0으로 한다.
		//orElse는 반환타입이 int이기 때문에 OptionalInt를 int로 바꿔야 함		
		System.out.println("요소들 중 최소 값 : "+min2);
		
//		OptionalInt first2 = list.stream().mapToInt(Integer::intValue).findFirst()
		list.stream().mapToInt(Integer::intValue).findFirst()
				.ifPresent(a -> System.out.println("요소 중 첫번째 값 : "+a));
		//ifPresent를 사용하게 되서 반환타입이 void이기 때문에 OptionalInt first2로 값을 넘길 수 없기 때문에 OptionalInt first2를 지워줘야 한다.
		//ifPresent 값이 존재하면 Consumer에서 처리한다.

	}

}
