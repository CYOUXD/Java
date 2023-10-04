package day09.polymorphism;

public class Person {	//공통 특성을 일반화하여 빼기 
	// 이름, 나이
	public String name;
	public int age;
	protected float height;
	float weight;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age;
	}
	
	//생성자 오버로드 예제
	public Person(int age, String name) {	//Person(int, String)
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age) {	//Person(String, int)
		this.name = name;
		this.age = age;
	}

	public Person() {
		this("이름 없음", 1);		// = 위에서 만든 public Person(String name, int age) {..} 생성자
	}
	
	public Person(String name) {
		this(name, 1);		// = 위에서 만든 public Person(String name, int age) {..} 생성자
	}
	
	public Person(String name, int age, float height) {
		this(name, age);	// = 위에서 만든 public Person(String name, int age) {..}생성자
		this.height = height;
	}
	
	public void wark() {
		System.out.println(name+"는 걸어가요");
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;	//계산 값이 커져야 두 수를 비교 했을때 차이를 쉽게 알아볼 수 있다. 계산 값의 차이를 알아보기 쉽게 하기위해 곱해주는 임의의 값
		int result =1;
		result = prime*result+age;	//age를 담아 계산한 result값을 name를 계산할 때 그대로 넣었으니까 age의 값과 name의 값이 둘 다 같아야 결과 값이 같아진다. 
		result = prime*result+((name == null)? 0: name.hashCode());	//hashCode : 문자열 값을 숫자값으로 변환해서 반환해 준다. 그 숫자 값으로 서로 같은지 비교할 때 사용함
		return result;
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
