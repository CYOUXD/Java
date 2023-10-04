package Homework.quiz10;

public class Warrior extends Player {
	
	public Warrior(String name){
		this.name = name;
		this.hp = 1000;
		this.mp= 500;
	}

	public void bash(Player name) { //name에 class가 통채로 들어있으니까 그 안의 name을 가져올 수 있다.
		System.out.println(name.name+"님 배쉬 스킬 적중!");
		System.out.println();					
	}
	
	@Override
	public void info() {
		this.hp -= 100;
		System.out.println("캐릭명 : "+this.name);
		System.out.println("체력 : "+this.hp);
		System.out.println("마나 : "+this.mp);
	}
}
