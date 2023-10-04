package day17.quiz.teacher;

public class User {
	//멤버변수, 멤버 메서드, 생성자
	//멤버변수 접근제한자 선택
	private String name;
	private int age;
	
	public User() {}	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter, setter - 값을 입력 받을 때 오입력시 기본값 처리(음수 입력), 예외처리 작업을 할 수 있다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	@Override
	public String toString() {
		return "[이름 : "+name+", 나이 : "+age+"]";
	}
}
