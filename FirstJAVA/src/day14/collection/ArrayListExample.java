package day14.collection;//1

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List list = new ArrayList(); 		//List는 클래스가 아니고 인터페이스
		//ArrayList is a raw type. = ArrayList()의 형태가 정해지지 않았다(형 안정성 문제 발생)
		//오브젝트 타입에는 모든 유형을 넣을 수 있다.
		
		//추가
		list.add("one");
		boolean a = list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		boolean b = list.add("second");		//list는 중복 저장 가능!!
		list.add(new Integer(4));
		list.add("SECOND");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(list);
		
		//set 수정
		list.set(6, 8);
		System.out.println(list);
		
		//제거
		list.remove(0);				//지정된 인덱스 값을 삭제
		list.remove("SECOND");		//지정된 값을 제거, 순서대로 제거
		System.out.println(list);
		
		//값 얻어오기 : get()
		Object o = list.get(5);		//형태가 지정되지 않아서 Object로 받아온다
		System.out.println(o);
		
		//사이즈
		int i = list.size();
		int idx = list.indexOf("second");
		System.out.println("list 크기는 : "+i);
		System.out.println("second = "+idx);
		
//		String s = (String)list.get(5);	//5번의 값은 8인 int 형이라서 String으로 캐스팅 할 수 없어서 아래의 오류가 뜸
		// Error : Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
		//         at day14.collection.ArrayListExample.main(ArrayListExample.java:47)
		String s = (String)list.get(4);	//list.get(5) : 제너릭 설정X 타입이 지정되지 않음. 기본 Object 타입
//		String s = list.get(5).toString(); 으로 바꾸면 문자열로 바꾼 후 s에 저장하는 것이기 때문에 오류가 나지 않음. 형 자체를 바꾸는건 아님
		System.out.println("문자열의 길이 : "+s.length());
		
		//정리
		list.clear();
		if(list.isEmpty()) {
			System.out.println("list is Empty!");
		}		
	}
}
