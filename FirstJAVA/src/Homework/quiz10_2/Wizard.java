package Homework.quiz10_2;

import java.util.Arrays;

public class Wizard extends Player {
	
	Wizard(String name){
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
	}

	void iceArrow() {
		System.out.println("얼음화살 사용");
	}
	
	public void blizzard(Player[] players) {
		System.out.println("---------------------");
		System.out.println(this.name + "님의 눈보라 시전!");
		
		for(Player p : players) {	//Player 자료형으로 만든 p라는 곳 안에 players 배열 내부의 것들을 하나씩 넣으면서 반복한다.
			int ran = (int)(Math.random()*6)+10;
			if((p instanceof Wizard) == false) {
				System.out.println(p.name+"님이 "+ran+"의 피해를 입었습니다.");
			}
		}
	}
}
