package day08.Inheritance.overriding;

public class Person {
	//이름과 나이
	protected String name;		// protected는 상송관계에서 접근 가능
	protected int age;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age;
	}
	
}
