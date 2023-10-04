package Homework.quiz05;

public class Warrior extends Player {
	
	public Warrior(String job, String name, int hp, int mp) {
		super(job, name, hp, mp);
	}
	
	public Warrior(String job) {
		super(job);
	}
	
	public void bash() {
		System.out.println("때리기 스킬 사용");
	}

}
