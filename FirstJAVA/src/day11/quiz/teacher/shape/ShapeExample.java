package day11.quiz.teacher.shape;

public class ShapeExample {

	public static void main(String[] args) {
		Triangle tri = new Triangle(10, 5);
		Ractangle rect = new Ractangle(10, 10);
		System.out.println(tri.getArea());
		System.out.println(rect.getArea());
		tri.showPosition();
		rect.showPosition();
	}

}
