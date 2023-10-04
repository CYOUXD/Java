package day11.quiz.teacher.shape;

public class Triangle extends Shape {
	
	private int z;
	
	public Triangle(int x, int y) {	//매개변수로 받는 애가 없으니 z는 this로 안쓰고 그냥 초기화 해줘도 된다.
		this.x = x;
		this.y = y;
		z=0; 	//기본 값은 원점
	}
	
	@Override
	public double getArea() {
		return (x-z)*(y-z)/2;
	}
	
}
