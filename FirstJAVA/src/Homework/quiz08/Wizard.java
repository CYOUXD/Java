package Homework.quiz08;

public class Wizard extends Player {
	String name;
	
	public Wizard(String name) {
		this.name = name;
	}
	
	void info() {
		System.out.println("캐릭명: "+name);
		System.out.println("체력: "+500);
		System.out.println("마나: "+1500);
	}

}
