package day07;

public class PenSetGet {

	public static void main(String[] args) {
		// Pen 인스턴스 생성
		Pen p1 = new Pen("Black", 20, 2000);
		
		// getting 정보를 불러옴
		System.out.printf("%s, %d, %d",p1.getColor(), p1.getLength(), p1.getPrice());
		System.out.println();
		
		// setting
		p1.setColor("Red");
		p1.setLength(40);
		p1.setPrice(4000);
		
		System.out.printf("%s, %d, %d",p1.getColor(), p1.getLength(), p1.getPrice());
		System.out.println();
		
	}

}
