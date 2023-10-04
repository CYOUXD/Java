package day20.stream;//17-2

public class Rectangle extends Shape {
	
	//필드
	int w, h;
	
	//생성자
	public Rectangle() {
		this(1, 1); //비워둘 수 없으니 기본 값을 넣어준다.
	}	
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	//넓이
	@Override
	public double area() {
		return (w*h);
	}
	
	//둘레
	@Override
	public double length() {
		return (w + h)*2;
	}
	
	@Override
	public String toString() {
		return "넓이 : "+this.area()+", 둘레 : "+this.length();
	}

}
