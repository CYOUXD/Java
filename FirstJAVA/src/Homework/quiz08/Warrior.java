package Homework.quiz08;

public class Warrior extends Player {
	String name;

	public Warrior(String name) {
		this.name = name;
	}
	void info() {
		System.out.println("캐릭명: "+name);
		System.out.println("체력: "+1500);
		System.out.println("마나: "+500);
	}
}
