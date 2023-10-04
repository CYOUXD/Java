package day21.thread;//3-2

public class ThreadEx3 {
//Runnable을 이용하여 Thread 객체 생성
	public static void main(String[] args) {
		//람다식으로 Runnable을 이용하여 Thread 객체 생성
		//Runnable의 추상메서드인 run()을 가져와서 람다식으로 표현
		Thread t1 = new Thread(() -> { // run()에 매개변수가 없으므로 ()를 비워둔다.
			System.out.println("t1 스레드 시작");
			for(int i=0; i<50; i++) {
				System.out.println("t1 : "+i);
			}
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println("t2 스레드 시작");
			for(int i=0; i<50; i++) {
				System.out.println("t2 : "+i);
			}
		});
		
		t1.start();
		t2.start();
	}

}
