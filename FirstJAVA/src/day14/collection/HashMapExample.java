package day14.collection;//9

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map maps = new HashMap(); 			//Map<K, V> : K, V자리에는 클래스(객체)를 써야한다.
		
		//추가
		String s1 = new String("홍길동");
		maps.put("name", s1);
		maps.put("hiredate", new Date());
		maps.put("salary", 20000);
		
		System.out.println(maps);	//중괄호로 출력되면 map이라는 의미
		
		//불러오기 - 하나씩 불러오는 방법
		System.out.println();
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));
		
		System.out.println();
		//map안에 엘리먼트를 entrySet() 메서드를 이용하여 조회하는 방법
		Set<Map.Entry<String, Object>> s = maps.entrySet();		//value 값은 자료형이 여러개라서 Object 객체로 써준다.
		//entrySet()은 키와 밸류의 쌍으로 반환하기 때문에 String과 Object로 받아야 한다. 그래서 Set 안에 Map.Entry<String, Object>라고 써준다.
		//중복을 제거하기 위해 Set을 사용함.
		//Map.Entry<String, Object> = key, value값을 받아 처리할 수 있는 객체이다.
//		System.out.println(s);  //대괄호로 출력되면 list 또는 set이라는 의미
		for(Map.Entry<String, Object> me : s) {	//s에 들어있는 요소의 객체 타입이 Map.Entry<String, Object>이기 때문에 Map.Entry<String, Object> 형태인 me에 넣어서 반복한다.
			System.out.println(me.getKey() + " : "+me.getValue());
		}
		
		System.out.println();
		
		//keySet() 메서드로 map 키를 리턴받고 get(key) 메서드를 사용하여 조회하는 방법
		Set<String> ss = maps.keySet();
		for(String key : ss) {
			System.out.println(key+" :: "+maps.get(key));
		}
		System.out.println();
		
		//Iteration : 컬렉션에서 저장되어 있는 엘리먼트를 검색하는 절차 
		//Iterator 인터페이스 : 컬렉션에 저장된 엘리먼트를 순차적으로 하나씩 접근하고자 할 때 사용
		//- Set 계열 : Collection 인터페이스에 정의된 iterator() 메서드를 통해서 Iterator 객체를 반환 받아 사용.
		//- List 계열 : listIterator() 메서드를 통해서 ListIterator 객체를 반환 받아 사용!!
		//- Iterator 인터페이스의 주요 메서드
		//	> boolean hasNext()
		//	> E next()
		//	> void remove()
		System.out.println("** values를 이용한 value 값 출력 **");
		Collection valueList = maps.values();	//values()의 반환타입이 Collection이기 때문에 Collection으로 객체 선언을 한다.(values()에 마우스 오버하면 보임)
		System.out.println(valueList);
		
		Iterator iter = valueList.iterator();
		while(iter.hasNext()) {		//hasNext() : 다음 값이 있는지 여부 확인(boolean)
			System.out.println(iter.next());
		}
		
		
		
		
		
	}

}
