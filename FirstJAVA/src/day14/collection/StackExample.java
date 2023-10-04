package day14.collection;//3

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.push(2);
		st.add(3);
		st.push(4);
		
		System.out.println(st.toString());
		System.out.println(st.get(0));		//1
		System.out.println(st.search(1)); 	//4 : 1이 어디있는지 찾는데 위에서부터 찾기 때문에 4번 위치를 반환하다.(1부터 시작)
		System.out.println();
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
			
		
		
	}

}
