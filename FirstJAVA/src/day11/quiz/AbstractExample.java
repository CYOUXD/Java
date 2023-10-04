package day11.quiz;

import java.util.Scanner;

public class AbstractExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좌표를 입력해 주세요.");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		Shape triangle = new Triangle(x, y);
		triangle.getArea();
		triangle.showPosition();
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		Shape square = new Square(x, y);
		square.getArea();
		square.showPosition();
	}

}

