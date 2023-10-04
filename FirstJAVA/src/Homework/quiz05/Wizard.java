package Homework.quiz05;

public class Wizard extends Player {
	public Wizard(String job, String name, int hp, int mp) {
		super(job, name, hp, mp);
	}
	
	public Wizard(String job) {
		super(job);
	}
	
	public void iceArrow() {
		System.out.println("얼음화살 사용");
	}

}
