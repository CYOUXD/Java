package day10.abstract_;

//자바에서의 abstract의 의미
//사용자 정의 클래스를 정의할 때, 굳이 abstract를 설계할 필요는 없다.
//하지만, 자바 내부의 많은 클래스는 abstract 클래스로 정의되어 있습니다.
//또한, 자식 클래스로 생성해서 부모클래스(추상클래스)에 저장해서 사용가능하다는 점에 익숙해져야함. = 다형성 = Shape부모 circle = new Circle()자식;

public class AbstractExample {

	public static void main(String[] args) {
//		Shape circle = new Shape() {
//			//추상 클래스니까 정의하라고 자동으로 뜬다.
//			@Override
//			public double getArea() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		
		Shape circle = new Circle(10);
		System.out.println("원의 넓이는 ? : "+circle.getArea());
		System.out.println("도형의 위치는 ? : "+circle.position());

	}

}
