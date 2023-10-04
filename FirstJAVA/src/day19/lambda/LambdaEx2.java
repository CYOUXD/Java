package day19.lambda;//3

public class LambdaEx2 {

	public static void main(String[] args) {//main thread
		//Runnable 인터페이스를 이용한 람다식
		System.out.println("시작");
		Runnable run = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("첫번째 : "+i);
			}
		};
		//컨트롤을 누른채로 Runnable에 커서를 가져다대면 정보를 볼 수 있다.
		Runnable run2 = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("두번째 : "+i);
			}
		};
		//별도의 작업 흐름을 만들어 주는 것
		Thread t = new Thread(run); //thread를 각각 만들어 주는 것. 별개로 동작
		Thread t2 = new Thread(run2);
		t.start();
		t2.start();
		System.out.println("종료");
	}

}
