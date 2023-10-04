package day26.dbconnect;//3-1

public class PersonsVO {
	//VO 클래스 or DTO 클래스
	/*
	 * VO 클래스 (Value Object Class) : 객체에 값을 저장하는 형태. DB나 "데이터를 저장"하는 용도
	 * 		- 변수들의 모음 역할(여러 값을 묶어서 변수에 넣고 처리 하기 위해 사용)
	 * DTO 클래스 (Data Transfer Object Class) : "데이터 전송" 처리를 위한 값을 저장하는 형태의 객체
	 * 
	 */
	
	//멤버 변수 - 필드, 속성
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String city;
	
	//기본 생성자
	public PersonsVO() {}
	
	//필드 생성자
	public PersonsVO(int id, String firstname, String lastname, int age, String city) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.city = city;
	}
	
	//getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "id : "+id+", lastname : "+lastname+", firstname : "+firstname+", age : "+age+", city : "+city;
	}
	
	
}
