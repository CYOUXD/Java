package day11.innerclass;

public class StaticInnerClassExample {

	public static void main(String[] args) {
		//static이 있는 것과 없는 것 접근 방식
		
		//static이 있는 경우
		University.Student us = new University.Student();
		
		//static이 없는 경우
//		Highschool.Student high = new Highschool.Student(); //Student가 static이 아니라서 외부 객체를 먼저 만들고 가져와야 한다.
		
		Highschool high = new Highschool(); //외부 객체 생성 후
		Highschool.Student hs = high.new Student(); //내부 객체 생성을 해야한다.

		/*
		 * 이너클래스를 만들려면 객체가 생성되야 접근이 가능하고 사용할 수 있다.
		 * =
		 * 일반클래스는 객체가 생성되어야 그 안의 것들을 가져와서 사용할 수 있다.
		 * 
		 * static은 쓰자마자 이미 생성되어 있기 때문에 어떤 클래스의 누구라고 바로 적어도 사용할 수 있다
		 */
	}

}
