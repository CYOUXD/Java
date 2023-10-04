package day21.thread;//7

public class ThreadEx7 {

	public static void main(String[] args) {
		//interrupt() 메서드 : 스레드가 일시 정지 상태에 있을 때 InturruptException 예외 발생 시켜 정상 종료시킨다.
		//sleep을 사용하지 않은 상태에서 중지
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 1;
				while(true) {
					System.out.println("t1 : "+i);
					i++;
					if(Thread.interrupted()) {//2) interrupted() 조건 충족되어 멈춤. interrupt상태가 되면 true 반환
						break;
					}
				}
				System.out.println("스레드 실행 종료");
			}
		});
		
		t1.start(); 		
		try {
			Thread.sleep(5000); 
		} catch (InterruptedException e) {}
		
		t1.interrupt();	//1) t1에 interrupt() 메세지를 보냄

	}

}
