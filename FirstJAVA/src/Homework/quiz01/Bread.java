package Homework.quiz01;

public class Bread {
	int price;
	String name;
	
	Bread(int price, String name){
		this.price = price;
		this.name = name;
	}
	
	public void info() {
		System.out.println(price+"원");
		System.out.println(name);
	}
}
