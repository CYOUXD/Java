package day15.generic;//2

//클래스 생성시 이름에 Person<E>라고 입력
public class Person<E> {	//E = Object인 상태. 뭐든지 받아서 쓸 수 있는 상태  <T extends Object>라고 쓰면 T에 객체 타입과 wrapper타입만 올 수 있다. Object가 모든 객체 타입의 부모이기 때문
	//<E>는 <E extends Object>을 생략한 것이다.
	//extends를 사용하면 클래스에 대한 제한을 걸 수 있다.
	private E name;
	private int age;
	
	public Person(E name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//제너릭 메서드 사용하는 방법 2가지!
	//1) 제너릭을 이용한 반환타입 지정 
	//클래스 선언부에서 정의된 유형 매개변수를 사용하는 방법. 클래스 선언부에서 지정한 매개변수와 똑같아야 한다.
	public E getName() {	
		return name;
	}
	
	//2) 제너릭을 이용한 반환타입 지정	암기하기!!!!!
	//클래스 선언부에서 정의된 것과 상관없이 유형 매개변수를 사용하는 방법
	public <T extends Object> T test(T t) {	//<T extends Object> = 오브젝트를 상속하는 T(타입)
		//클래스 정의부에 <T extends Object> T 라고 적었을 때 뒤의 T는 메서드 자체의 반환타입이다.
		//(void, int, String 등 반환을 원하는 타입을 넣는다. 보통 이런 메서드의 반환 타입을 명확하게 지정하기 애매하기 때문에 반환 타입도 매개변수의 타입과 똑같이 써준다.)
		//매개변수 안의 T(반환타입)의 범위를 제한해 주는 것이 <T extends Object>이다.
		//= 실제 타입은 매개변수에서 지정한다.
		//제너릭은 여러개 써도 된다
		return t;
	}
	//<T extends Object>를 이용해서 다른클래스의 객체에 대한 반환 타입입니다. 라는 의미
	//test()의 매개변수의 값을 가져와서 그것에 해당하는 반환 타입을 정해준다.

	public void setName(E name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}
