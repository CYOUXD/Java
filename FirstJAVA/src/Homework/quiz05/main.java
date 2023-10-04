package Homework.quiz05;

public class main {

	public static void main(String[] args) {
		Wizard p1 = new Wizard("마법사", "구르미그린달빛", 500, 1000);
		p1.info();
		p1.iceArrow();
		Warrior p2 = new Warrior("전사", "강한친구대한전사", 1000, 500);
		p2.info();
		p2.bash();

	}

}
