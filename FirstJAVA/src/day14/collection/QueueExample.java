package day14.collection;//5

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> qu = new LinkedList<>();		//Queue는 인터페이스라서 객체 생성이 안되서 하위의 LinkedList로 객체를 생성한다.
		qu.add(1);
		qu.offer(2);
		qu.add(3);
		qu.add(4);
		
		System.out.println(qu.toString());
		System.out.println(qu.remove(2));	//인덱스가 아니라 밸류 값 2를 찾아서 삭제
		System.out.println(qu.toString());
		System.out.println();
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}		
	}
}
