package Homework.quiz04;

public class Account {
	String name;
	int password;
	int balance;
	
	public Account(String name, int password, int balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	//입금
	public void deposit(int num1) {
		balance = balance+num1;
	}
	//출금
	public void withDraw(int num2) {
		if((balance-num2)<0) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance = balance-num2;
		}
	}
	//잔액조회
	public int getbalance() {
		return balance;
	}
}
