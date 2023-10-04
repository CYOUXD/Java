package day07;

public class PenConstuctorExample {

	public static void main(String[] args) {
		// 생성자 테스트
		Pen redPen = new Pen("red");
		//"생성자를 이용하여 color 값 초기화"가 출력되는 이유는 Pen redPen = new Pen("red"); 여기서 클래스로 객체가 만들어지면서 Pen 생성자 함수가 실행되어 System.out.Print가 출력 된 것.
		System.out.println("펜의 색은 "+redPen.color+"입니다.");		
		
		//day06.Pen : 다른 패키지에 있는 클래스를 부를 때는 패키지명.클래스명 으로 쓴다.
		Pen pen2 = new Pen("yellow", 1000);		
		System.out.println("펜의 색은"+pen2.color+"이고, \n"+"가격은"+pen2.price+"원 입니다.");
		
		
	}

}
