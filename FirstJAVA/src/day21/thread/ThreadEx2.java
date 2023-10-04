package day21.thread;//3-1

public class ThreadEx2 {
//Runnable을 이용하여 Thread 객체 생성
	public static void main(String[] args) {
		//Runnable을 이용한 Thread 동작!
		//Runnable을 implement하지 않아도 만들 수 있음!
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t1 스레드 시작");
				for(int i=0; i<50; i++) {
					System.out.println("t1 : "+i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t2 스레드 시작");
				for(int i=0; i<50; i++) {
					System.out.println("t2 : "+i);
				}				
			}
		});
		
		t1.start();
		t2.start();
	}

}
