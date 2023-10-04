package Homework.quiz02;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age+"세");
	}

}
