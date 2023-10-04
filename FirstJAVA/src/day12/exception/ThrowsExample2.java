package day12.exception;//5

public class ThrowsExample2 {

	private static String[] greetings = {"안녕", "Hi", "니하오"};
	public static void doIt(int index) {	//Throws를 사용하지 않으면 예외가 발생한 그 부분에서 예외처리를 해줘야 함!
		try {
			System.out.println(greetings[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스 입니다.");
			e.printStackTrace();	//getMassage랑 다르게 에러 텍스트 전체가 나온다.
		}
	}
	
	public static void main(String[] args) {	
		int i = (int)(Math.random()*4);
		doIt(i);
		
	}

}
