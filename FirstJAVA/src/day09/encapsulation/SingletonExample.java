package day09.encapsulation;

import day09.encapsulation.singleton.Company;

/*
 * Singleton Design Pattern
 * 
 * private 제한자와 static 제한자를 사용하여 클래스의 인스턴스 갯수를 제한하는 프로그래밍 방법
 * 
 */

public class SingletonExample {

	public static void main(String[] args) {
		//싱글톤은 객체 생성시 new를 사용하지 않는다. 메서드를 이용해서 객체 생성 
		//static 메서드는 new로 객체를 생성하지 않아도 접근 할 수 있다.
		Company c1 = Company.getCompany();
		Company c2 = Company.getCompany();
		
		System.out.println(c1);
		System.out.println(c1 == c2);	//해쉬값까지 똑같다.
		System.out.println(c2);

	}

}
