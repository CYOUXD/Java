package day10.abstract_;

public abstract class Shape { //abstract를 붙이면 추상클래스
	
	private int x;
	private int y;
	
	public Shape() {}	//기본생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상 메서드
	public abstract double getArea();	//구현되어 있지 않음
	//상속을 받는 순간 반드시 구현해야 한다.
	
	public String position() {
		return "[x="+x+", y="+y+"]";
	}
	//오버라이드를 할거면 그 때 새로 구현하면 된다
}
