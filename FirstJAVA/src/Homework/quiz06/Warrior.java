package Homework.quiz06;

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
	
	@Override
	void action() {
		System.out.println("-----"+job+"-----");
		System.out.println(job+"는 멋진 동작을 합니다.");
	}

}
