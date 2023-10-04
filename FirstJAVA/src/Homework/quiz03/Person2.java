package Homework.quiz03;

public class Person2 {
	String name;
	int age;
	int tall;
	
	Person2(String name, int age, int tall) {
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키 : "+tall);
	}
}
