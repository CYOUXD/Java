package day20.stream;//17-1

public abstract class Shape implements Comparable<Shape> {
	//필드
	int x, y;
	
	//생성자
	public Shape() {}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상 메서드
	public abstract double area();
	public abstract double length();
	
	//일반 메서드
	public String getLocation() {
		return "x : "+x+", y : "+y;
	}
	
	//넓이 기준 비교
	@Override
	public int compareTo(Shape o) {
		return (int)(this.area() - o.area()); //0, 1, -1로 정렬을 구분해줘야 하기 때문에 int로 캐스팅해야 한다.
	}
	
	
	
}
