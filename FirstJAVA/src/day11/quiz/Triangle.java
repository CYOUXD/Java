package day11.quiz;

public class Triangle extends Shape {
	double area;
	
	Triangle(int x, int y) {
		this.x = x;			//부모에게서 상속 받았기 때문에 따로 선언 안해줘도 됨
		this.y = y;
		area = x*y/2;
	}
	
	@Override
	public double getArea() {
		System.out.println("삼각형의 넓이 : "+area);
		return area;
	}
}
