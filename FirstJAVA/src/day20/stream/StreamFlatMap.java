package day20.stream;//13

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamFlatMap {

	public static void main(String[] args) {
		//Map 중에 flatMapXXX() 메서드의 사용
		
		//문자열 공백으로 분리해서 매핑
		List<String> list1 = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
		
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
		//data = list의 데이터를 내부 하나씩 넣음
		//split이 배열로 반환하기 때문에 Arrays.stream(배열을 스트림으로 변경)을 사용
		
		//문자열을 ","로 분리해서 double 자료형으로 변환해서 매칭
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3", "4.4, 5.5, 6.6");
		DoubleStream dsr = list2.stream().flatMapToDouble(data -> {//list2.stream() 는 double값이어야 함
			String[] strArr = data.split(",");
			double[] dArr = new double[strArr.length];
			for(int i=0; i<dArr.length; i++) {
				dArr[i] = Double.parseDouble(strArr[i].trim());	//문자열이었는데 실수로 변환
			}
			return Arrays.stream(dArr);
		});
		dsr.forEach(n -> System.out.print(n+"\t"));		
		System.out.println();
		
		//문자열을 ","로 분리해서 int 자료형으로 변환하여 매핑
		List<String> list3 = Arrays.asList("1,2, 3", "4, 5, 6");
		IntStream isr = list3.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] iArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				iArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(iArr);
		});
		isr.forEach(n -> System.out.print(n+"\t"));
	}

}
