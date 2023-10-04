package day15.generic;//1

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();	//제너릭을 생략하면 Object 타입
		ArrayList<String> genericList = new ArrayList<>();	//사용할 때 선언
		
		list.add("first");
		list.add("second");
		list.add("third");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		
		genericList.add("first");
		genericList.add("second");
		genericList.add("third");
		//제너릭을 사용하면 지정된 타입 이외의 다른 타입은 저장할 수 없음
//		genericList.add(new Integer(4));	//위에서 String라고 지정했으므로 int타입은 들어갈 수 없다.
		
		//Object 타입이기 때문에 String으로 캐스팅 해 주어야 함
		String s1 = (String)list.get(0);	//(String)으로 캐스팅해주지 않으면 Object 객체를 String에 넣을수 없다는 오류가 뜸
		
		//캐스팅 필요하지 않음
		String s2 = genericList.get(0);
		System.out.println(s1);
		System.out.println(s2);
		for(String s : genericList) {
			System.out.println(s);
		}
		
	}

}
