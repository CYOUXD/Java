package day14.collection;//2

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		//LinkedList = 큐와 리스트의 구현체
		
		//- ArrayList는 내부 배열에 객체를 저장하여 인덱스로 관리하지만, LinkedList는 인접 참조를 링크하여 체인처럼 관리합니다.
		//- LinkedList는 특정 인덱스의 객체를 제거하면 앞, 뒤 링크만 변경되고 나머지 링크는 변경되지 않아 빈번한 객체의 삭제와 삽입은 ArrayList보다 좋은 성능을 발휘합니다.
		//각 인덱스의 값이 헤더와 푸터로 이전, 다음 값과 체인처럼 연결되어 있다. 중간에 새 값을 넣게 되면 헤더와 푸터의 링크만 변경해주면 되기 때문에 빈번한 삭제와 삽입에 유리하다.
		LinkedList<String> list = new LinkedList<>();	//앞의 <>에 String이라고 써줬으면 뒤의 <>에는 생략 가능
		//LinkedList<String> list = 리스트를 만들었는데 그 안의 엘리먼트는 String이다라
		
		list.add("hello");		// = push()
		list.add("java");
		list.add("banana");
		list.addFirst("apple");	//head에 값을 추가
		list.addLast("zoo");	//끝에 값을 추가
		System.out.println("list data : "+list);
		
		list.remove(); 		//head 엘리먼트를 삭제. 입력된 순서의 제일 앞에 있는 값 삭제 index 0
		System.out.println("list data after remove : "+list);
		
		list.remove(2);		//2번 인덱스 엘리먼트 삭제
		System.out.println("list data after remove(2) : "+list);
		
		list.set(1, "new element");		//1번 엘리먼트 변경
		System.out.println("list data after set() : "+list);
		
		String str1 = list.peek();	//엘리먼트 조회. 첫번째 엘리멘트 요소 조회
		String str2 = list.peekLast();	//마지막 엘리먼트 조회
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);		
		System.out.println("list data afer peek() : "+list);
		
		String str3 = list.poll();	//엘리먼트 조회 후 삭제  = pop()
		System.out.println("str3 : "+str3);
		System.out.println("list data after poll() : "+list);
		
		String str4 = list.pop();	//엘리먼트 조회 후 삭제 = poll()
		System.out.println("str4 : "+str4);
		System.out.println("list data after pop() : "+list);
		
		list.push("push element");	//push시 추가 위치 주의! add는 뒤에 push는 앞에 추가
		System.out.println("list data after push() : "+list);
		
		
	}

}
