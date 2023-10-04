package day11.quiz.teacher.shape;

public abstract class Shape {
	protected int x;
	protected int y;
	
	public void showPosition() {
		System.out.println("X 좌표 : "+x+", Y 좌표 : "+y);
	}
	
	//추상 메서드
	public abstract double getArea();
}
