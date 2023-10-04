package day08.Inheritance;

/*
 * 상속(Inheritance)
 * - 상속은 기존의 클래스를 확장하여 새로운 클래스를 이끌어 내는 것을 의미함.
 * - 기존 코드를 재사용함으로써 불필요한 코드 재작성을 줄여줌.
 * - 단일 상속만 가능(상속은 하나의 부모 클래스만 가질 수 있음) -> 인터페이스 다중 상속이 가능함.
 * - 키워드 extends를 사용하여 상속을 표현
 * - 부모(super)클래스의 멤버(변수, 메서드)를 자식(sub)클래스에서 사용이 가능함.
 * - 생성자는 상속이 안됨.
 * - Sub Class "is a" Super Class
 * - ex) 말 extends 포유류 -> 말 is a 포유류
 * 	** has a 관계?
 * 		- 객체가 멤버를 가지고 있다.
 * 		- class NameCard{
 * 			String name,
 * 			int size;	
 * 		   } 일 경우, NameCard has a name
 * - Object 클래스는 최상위 클래스(기본적으로 최상위기 때문에 extends라고 쓰지 않음. 내가 생성하지 않은 메서드들은 object에서 상속받은 것이다.ex. .close())
 * - final 클래스는 상속 불가
 * - abstract 클래스는 반드시 상속해서 사용해야 함. (추상 클래스는 메서드 정의를 하지 않으므로 사용하려면 재정의해서 사용해야 하기 때문에 반드시 상속해야함)
 * 
 * 상속 : Bad Case와 Good Case
 * 	Bad Case
 * 	- 개별 클래스들이 중복된 속성/기능을 포함하는 경우
 * 	Good Case
 * 	- 중복된 기능을 빼내 새로운 클래스로 작성한 후 구체화 시킴
 * 	- 일반화 된 클래스는 부모 클래스
 * 	- 구체화 된 클래스는 자식 클래스
 * 	- extends 키워드를 사용!!!
 */

public class Person {	//공통 특성을 일반화하여 빼기 
	// 이름, 나이
	public String name;
	public int age;
	protected float height;
	float weight;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age;
	}
	
	/*
	 * this와 super	****암기
	 * - this
	 * 	> this는 현재 객체(자기 자신)
	 * 	> this.
	 * 		- 변수 또는 메서드를 참조 (. : 직접 참조 연산자)
	 * 		- this.name => 자기 자신의 name 멤버 참조
	 * 		- this.go() => 자기 자신의 go() 메서드 참조
	 * 
	 * 	> this()
	 * 		- 자기 자신 클래스 내의 다른 생성자를 참조
	 * 		- this();	=> 기본 생성자를 불러옴
	 * 		- this("hello");	=> 생성자 호출, 인자 값을 처리하는 생성자
	 * 
	 * 	- super
	 * 		> super는 현재 객체의 부모 객체, 한단계 위 부모를 의미함.
	 * 		> super.
	 * 			- 부모의 변수 또는 메서드를 참조
	 * 			- super.name
	 * 			- super.go();
	 * 		> super()
	 * 			- 부모의 생성자를 참조
	 * 			- super();
	 * 			- super(10, 20);
	 * 			- super("hello");
	 */
	
	/*
	 * 부모인 Person에 생성자 만들기
	 * 반환값, 이름, 매개변수의 타입과 갯수와 순서가 중요! 같아야 함!
	 */
	//생성자 오버로드 예제
	public Person(int age, String name) {	//Person(int, String)
		this.name = name;
		this.age = age;
	}
	
	//매개변수의 타입이 다른 순서로 되어 있어도 다른 생성자로 구분!
	public Person(String name, int age) {	//Person(String, int)
		this.name = name;
		this.age = age;
	}

	//생성자의 첫라인은 반드시 super() 또는 this()가 와야 합니다.
	public Person() {
//		super();		//생략가능
		this("이름 없음", 1);		// = 위에서 만든 public Person(String name, int age) {..} 생성자
	}
	
	public Person(String name) {
		this(name, 1);		// = 위에서 만든 public Person(String name, int age) {..} 생성자
	}
	
	public Person(String name, int age, float height) {
		this(name, age);	// = 위에서 만든 public Person(String name, int age) {..}생성자
		this.height = height;
	}
	
	
	
	
	
	//********** Object클래스가 제공하는 기본 메서드를 오버라이드(메서드 수정)해서 Person에 맞게끔 수정해서 사용하는 예제 ***********
	@Override
	public int hashCode() {
		final int prime = 31;	//계산 값이 커져야 두 수를 비교 했을때 차이를 쉽게 알아볼 수 있다. 계산 값의 차이를 알아보기 쉽게 하기위해 곱해주는 임의의 값
		int result =1;
		result = prime*result+age;	//age를 담아 계산한 result값을 name를 계산할 때 그대로 넣었으니까 age의 값과 name의 값이 둘 다 같아야 결과 값이 같아진다. 
		result = prime*result+((name == null)? 0: name.hashCode());	//hashCode : 문자열 값을 숫자값으로 변환해서 반환해 준다. 그 숫자 값으로 서로 같은지 비교할 때 사용함
		return result;
		
		//임의의 큰 값 prime을 곱하는 이유는 큰 값을 곱해야 비교할 값의 차이가 커지기 때문에 임의의 큰 값을 곱해준다. 
		//여기서는 객체의 age와 name이 같은지를 비교하기 위한 코드이다. age를 담은 result값을 그대로 name의 조건을 계산할 때 넣어줌으로써 이 메서드를 사용해 age와 name이 들어있는 두 객체를 비교할 때 사용한다.
	}
	
	@Override
		public boolean equals(Object obj) {
			if(this == obj) {	//동일한 객체인지 확인
				return true;
			}
			if(obj == null) return false;	//비어있는지 확인
			if(getClass() != obj) return false; //객체를 생성한 클래스가 같은지 확인	객체 생성 클래스가 다르다는 뜻은 객체가 다르다는 뜻
			Person other = (Person)obj;		// (Person)으로 캐스팅을 해 준다는 의미
			if(age != other.age) return false;	//객체 내에 age 멤버 비교 확인
			if(name == null) {	//이름이 비어 있는데 비교 대상이 null이 아니라면 다른 값
				if(other.name != null) return false;	//객체 내에 이름 확인
			}else if(!name.equals(other.name)) return false;	//이름이 안비어 있고 이름이 서로 다르면 true를 반환하게 되어 return false가 실행된다.
			return true;
		}
	
	@Override
		public String toString() {		//이거는 걍 외우기
			return "Person [name="+name+", age="+age+"]";
		}
}
