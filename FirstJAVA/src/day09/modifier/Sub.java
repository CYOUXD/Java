package day09.modifier;

import day09.modifier.pac.Super;

public class Sub extends Super {//자식
	private int num5 = 50;
	
	public void print() {
		System.out.println("Super num1 = "+num1);
		System.out.println("Super num2 = "+num2);
//		System.out.println("Super num3 = "+num3);		//Error : default - 같은 패키지에서만 접근 가능
//		System.out.println("Super num4 = "+num4);		//Error : private - 같은 클래스에서만 접근 가능
		System.out.println("Super num4 = "+getNum4());	//부모로 부터 받은 메서드가 num4를 받을 수 있는 메서드라서 에러나지 않음
		System.out.println("Sub num5 = "+num5);
	}
}
