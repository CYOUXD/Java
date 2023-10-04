package Homework.quiz11;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("원주율 : "+ Calculator.pi);
		
		//원의 둘레공식 : 2 * pi * 반지름
		System.out.println("원의 둘레 : "+ Calculator.circle(3));  //매개변수 3전달
	}

}
