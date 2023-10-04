package Homework.quiz10_2;

public class Main {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("강한친구");
		Wizard w2 = new Wizard("구르미");
		Warrior me = new Warrior("나의 캐릭터");
				
		Player[] p = {w1, w2, me}; //아래와 같다.
//		Player[] p = new Player[3];
//		p[0] = w1;
//		p[1] = w2;
//		p[2] = me;
		
		w2.blizzard(p);
		w2.blizzard(p);
		w2.blizzard(p);
		w2.blizzard(p);
		w2.blizzard(p);
	}

}
