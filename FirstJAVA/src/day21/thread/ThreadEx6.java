package day21.thread;//6

public class ThreadEx6 {

	public static void main(String[] args) {
		//interrupt() 메서드 : 스레드가 일시 정지 상태에 있을 때 InturruptException 예외 발생 시켜 정상 종료시킨다.
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {//sleep을 쓰려면 try - catch 필요
					int i = 1;
					while(true) {
						System.out.println("t1 : "+i);
						//sleep은 스레드를 지정된 시간동안 일시 정지
						Thread.sleep(1000);
						i++;
					}
				} catch (InterruptedException e) {
					System.out.println("스레드 내에서 일시정지 : "+e.getMessage());
				}
				System.out.println("스레드 실행 종료");
			}
		});
		
		t1.start(); //t1 여기서 시작
		
		try {
			Thread.sleep(10000); //10s
		} catch (InterruptedException e) {
			System.out.println("메인에서 일시정지 : "+e.getMessage());
		}
		
		t1.interrupt();//일시정지 상태일 때 interruptedException을 발생시켜 정상 종료 시킴
		//메인은 순서대로 실행된다. t1내부에 있는게 t1관련 스레드 임. 
		//t1.interrupt();는 메인에서 실행하는 스레드라서 10초가 지나고 t1이 정지 된 상태일 때 interrupt()가 실행된다.
	}

}
