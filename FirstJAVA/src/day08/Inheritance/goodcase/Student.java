package day08.Inheritance.goodcase;

import day08.Inheritance.Person;

public class Student extends Person {
	public String studentId;
	public String major;
	
	//기본 생성자
	public Student() {
		//super();생략되어 있음
		
	}
	public Student(String name, int age) {
		super(name, age);	//부모 생성자를 가져온 것
	}
	
	public Student(String name, int age, String StudentId, String major) {
		this(name, age);	//부모 생성자를 가져온 것으로 만들어진 생성자를 가져온 것
		this.studentId = StudentId;
		this.major = major;
	}



	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t학번: "+studentId+"\t전공: "+major;
	}
}
