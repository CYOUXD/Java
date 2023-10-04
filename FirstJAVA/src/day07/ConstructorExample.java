package day07;

public class ConstructorExample {
	/*
	 * 생성자(Constructor)
	 * 
	 * 객체를 생성하는 new를 통해서 인스턴스를 생성할 때 호출되는 것을 말함.
	 * 클래스 이름과 같은 이름을 가진 함수
	 * 
	 * 생성자의 역할은 객체를 생성하여 동작할 때 필요한 모든 작업이 가능
	 * 주로, 멤버 변수에 대한 초기화 작업을 진행함. (집어 넣지 않아도 각 자료형에 따른 값이 초기화 되지만 생성자를 통해 초기 값을 넣어주는 것)
	 * 클래스에 생성자를 정의하지 않은 경우에는 기본 생성자가 호출
	 * (기본 생성자란? 호출시 매개변수가 정의되어 있지 않은 생성자)
	 * 다른 생성자가 정의되어 있다면 정의된 생성자를 반드시 사용해야 한다.
	 */
	
	public static void main(String[] args) {
		//생성자 테스트
		Car c = new Car();	// 클래스 기본생성자
		//클래스는 참조 타입의 뭐 데이터 타입. Car는 클래스 Car()는 생성자
		System.out.println(c.wheel);
		c.wheel = "미쉐린";
		System.out.println(c.wheel);
		
		//매개변수가 있는 기본생성자를 불러서 사용할 때는 반드시 매개변수를 써주어야 한다.
		Car c2 = new Car("미쉐린", 6, "BMW", "티코");
		System.out.println(c2.name);
	}

}


/*
 * JAVA 클래스 규칙
 * 	- public class는 파일 이름과 같아야 한다.
 * 	- public class는 한 파일 내에 한개만 존재할 수 있다.
 * 	- 같은 패키지 내에서는 같은 이름의 클래스를 사용할 수 없다.
 * 	- 다른 패키지에서는 import할 때 public class에만 접근 할 수 있다.
 * 	- public class는 파일 이름이기 때문에 그 소스 파일 전체의 주제를 알 수 있는 이름을 짓는 것이 좋다.
 * 	- 클래스 이름은 대문자로 시작하는 것이 좋다.
 */

class Car{
	// 멤버(속성, 필드)선언
	String wheel;
	int numOfWheel;
	String brand;
	String name;
	
	//생성자를 생성하지 않아도 각 타입별 기초값이 들어가있는기본 생성자가 생성되어 있음
	//생성자는 한개 이상 있어야 한다. 만들지 않으면 시스템이 자동으로 텅 빈 생성자를 만들어 준다. = 생성자를 안만들어도 됨. 그럼 자동으로 만들어진 생성자 이름은 클래스 이름과 같다.
	//생성자 오버로드 : 생성자를 여러개 만드는 것
	
	// 생략되어 있는 기본 생성자  생성자를 통해서 위의 변수의 값을 정의할 수 있다.
	// 생성자에 값을 추가하지 않으면 각 타입의 기초 값이 들어가 있다.
	// 생성자는 메서드와 달리 반환 타입(데이터 타입)을 쓰지 않는다. 접근 제한자는 쓸 수 있다.
	Car(){	//매개변수가 없는 "기본 생성자" 
		wheel = "금호";
		numOfWheel = 4;
		brand = "KIA";
		name = "K5";
	}
	
	//생성자는 새로운 인스턴스를 생성할 때 가장 먼저 호출되기 때문에 값을 초기화하는 용도로 많이 사용된다.
	//생성자는 여러개 만들 수 있다. 각 매개변수가 중복되지 않으면 여러개 만들 수 있다.	- 나중에 오버로드에서 설명
	Car(String wheel, int numOfWheel, String brand, String name) {	//생성자	매개변수가 있는 "초기화 생성자"
		//this : 현재 인스턴스를 의미함.
		// 같은 wheel이지만 멤버변수가 아닌 지역변수(매개변수)가 더 가까우니까 wheel만 쓰면 매개변수를 의미한다. this를 붙여야 클래스 변수의 wheel을 의미함.
		
		//클래스 변수와 매개변수를 같은 이름으로 사용할 때, 클래스 변수를 지칭하기 위해서 "this"를 붙여야 한다.
		this.wheel = wheel;
		this.numOfWheel = numOfWheel;
		this.brand = brand;
		this.name = name;
	}
	
}

