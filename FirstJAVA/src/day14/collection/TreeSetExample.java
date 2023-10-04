package day14.collection;//6

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("computer");
		ts.add("monitor");
		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("get");
		
		for(String str : ts) {
			System.out.print(str + "\t");
		}
		// 중간 값을(hello) 기준으로 앞글자 기준 왼쪽 오른쪽으로 정렬한 다음 출력한 순서. 정렬이 되어 출력된다.
		//넣은 값에 따라 위치가 달라짐. 순서를 지정할 수 없다. 인덱스로 찾을 수 없다.
		//비교해서 정렬해야 하기 때문에 같은 유형의 값이어야 한다.

	}

}
