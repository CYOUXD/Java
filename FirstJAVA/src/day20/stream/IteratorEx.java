package day20.stream;//1

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
//리스트를 이용한 스트림
	public static void main(String[] args) {
		// 내/외부 반복자
		List<String> list = Arrays.asList(new String[] {	//Arrays.asList : 배열을 리스트로 만듦
				"홍길동", "김유신", "이순신", "유관순"
		});
		System.out.println("for문 이용");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {//다음 값이 존재하면
			System.out.print(it.next());
		}
		System.out.println();
		
		System.out.println("내부 반복자 이용");
		list.stream().forEach(s -> System.out.print(s));//forEach(s) : s에 list의 정보를 하나씩 집어 넣음
		
	}

}
