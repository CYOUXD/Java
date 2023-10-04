package day10.interface_;

/*
 * 인터페이스 정리!
 * - 단일 상속 문제점을 해결할 수 있음
 * - 인터페이스 메서드는 추상메서드이어야 함
 * - 인터페이스의 변수는 자동으로 상수가 됨
 * - 인터페이스를 구현할 때는 implements
 * - 인터페이스를 여러개 implements 할 수 있다.(구현)
 * - 인터페이스는 다른 인터페이스 여러개를 extends 할 수 있다.(상속)
 * *** 기능의 명세를 위해서 사용합니다. ***
 */

public class InterfaceImpExample {

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo;	//다형성이 적용됨
		//todo에는 m4()가 있는데 IToDo3에는 m4()가 없기 때문에 IToDo3 itodo3은 .m4()를 이해하지 못한다.	
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4();			//Error = IToDo3에는 m4()가 없음.
		IToDo4 itodo4 = todo;
		itodo4.m4();			//얘는 m1(), m2(), m3()을 알지 못한다. 부모한텐 있지만 IToDo4에겐 없기 때문
//		itodo4.m1();			//Error = IToDo4에는 m1(), m2(), m3()가 없음
	}

}
