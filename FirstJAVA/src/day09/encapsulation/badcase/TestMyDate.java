package day09.encapsulation.badcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBirth = new MyDate();
		myBirth.day = 32;	//32일은 있을 수 없음. 비정상적인 데이터를 집어 넣게 됨
		System.out.println("My birth day is "+myBirth.day);

	}

}
