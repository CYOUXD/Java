package Homework.quiz10;

public class Wizard extends Player {
	
	public Wizard(String name){
		this.name = name;
//		this(name, 500, 1000);
		this.hp = 500;
		this.mp = 1000;
	}
	
	public Wizard(String name, int hp, int mp) {
	}
	
	@Override
	public void info() {
		this.hp -= 100;
		System.out.println("캐릭명 : "+this.name);
		System.out.println("체력 : "+this.hp);
		System.out.println("마나 : "+this.mp);
	}
}
