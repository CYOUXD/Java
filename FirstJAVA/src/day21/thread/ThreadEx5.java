package day21.thread;//5

public class ThreadEx5 {

	public static void main(String[] args) {
		// sleep() 메서드 : 지정된 시간만큼 일시정지
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("t1 : "+i);
					try {
						Thread.sleep(1000);
						//sleep() 메서드는 InterruptedException 처리를 강제하기 때문에 try 구문 안에 작성해야 한다.
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println("스레드 실행 종료");
			}
		});
		t1.start();
	}

}
