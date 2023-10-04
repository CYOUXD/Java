package day12.exception;//4

public class ThorwsExample {

	private static String[] greetings = {"안녕", "Hi", "니하오"};
	public static void doIt(int index) throws ArrayIndexOutOfBoundsException{
		System.out.println(greetings[index]);
	}
	
	public static void main(String[] args) {
		//throws로 넘겨서 받은 예외 처리를 try catch로 처리한다
		
		int i = (int)(Math.random()*4);
		try {	//예외가 발생할만한 곳에 예외처리 사항을 만들기
			doIt(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("main에서 i가 잘못 선택 되었습니다. 다음 명령문으로 넘어감!!");
		}
		System.out.println("다음 명령문이 실행되었습니다.");
	}

}
