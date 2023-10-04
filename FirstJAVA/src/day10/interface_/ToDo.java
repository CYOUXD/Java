package day10.interface_;

/*
 * 인터페이스끼리 다중 상속 가능
 * 가장 하위 인터페이스를 구현할 경우 상속 관계에 있는 인터페이스들이 모든 메서드를 구현해야 함.
 */


public class ToDo implements IToDo3, IToDo4 {	//1, 2를 상속받은 3과 4를 상속 받았으니 1~4까지 추상메서드가 생성된다

	@Override
	public void m1() {						//가장 상위
		System.out.println("m1() 구현");

	}

	@Override
	public void m2() {						//가장 상위
		System.out.println("m2() 구현");

	}

	@Override
	public void m4() {						//가장 상위
		System.out.println("m4() 구현");

	}

	@Override
	public void m3() {						//부모로 m1, m2가 있어서 m3은 두번째 순서 이므로 m4보다 아래에 위치함
		System.out.println("m3() 구현");

	}
}
