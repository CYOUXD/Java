package day10.abstract_;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int r) {//x, y값은 변수는 부모한테서 받아왔고 0, 0으로 고정한 다음 r만 추가 할 때 이 생성자를 쓴다
		this(0, 0, r); 	
	}
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.radius = r;
	}
	
	//자동으로 추상클래스의 추상 메서드가 뜬다. 반드시 오버라이드 해야함.
	@Override
	public double getArea() {
		return (Math.PI * radius * radius); //원 계산식
	}

}
