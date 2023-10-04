package day11.quiz;

public class Square extends Shape {
	double area;
	
	Square(int x, int y) {
		this.x = x;
		this.y = y;
		area = x*y;
	}
	
	@Override
	public double getArea() {
		System.out.println("사각형의 넓이 : "+area);
		return area;
	}
}
