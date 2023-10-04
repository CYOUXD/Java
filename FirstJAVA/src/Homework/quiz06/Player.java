package Homework.quiz06;

public class Player {

	String job;
	String name;
	int hp;
	int mp;
	
	public Player(String job, String name, int hp, int mp) {
		this.job = job;
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Player(String job) {
		this.job = job;
	}
	
	void info() {
		System.out.println("-----"+job+"-----");
		System.out.println("캐릭명: "+name);
		System.out.println("체력: "+hp);
		System.out.println("마나: "+mp);
	}
	
	void action() {
		
	}


}
