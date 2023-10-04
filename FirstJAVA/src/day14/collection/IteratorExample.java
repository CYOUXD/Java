package day14.collection;//8

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("three");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		
		Iterator it = set.iterator();	//Set에서 Iterator 객체 생성 메서드
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		List list = new ArrayList();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(3);
		
		Iterator it2 = list.listIterator();	//listIterator() 의 반환 값은 listIterator이지만 listIterator의 부모가 Iterator이기 때문에 Iterator라고 써도 된다.
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

		
	}

}
