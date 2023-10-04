package Homework.quiz06;

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
	
	@Override
	void action() {
		System.out.println("-----"+job+"-----");
		System.out.println(job+"는 귀여운 동작을 합니다.");
	}

}
