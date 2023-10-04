package day22.thread;

public class ThreadEx11 {

	public static void main(String[] args) {
		/*
		 * 생산 스레드와 소비 스레드 예시
		 * 통장에 돈이 입금되어야 출금 가능!
		 * 입금은 잔액이 없어야 입금 가능!
		 */
 		
		//통장 객체 생성
		Account acc = new Account();
		
		//엄마 스레드 객체 생성
		Mother mother = new Mother(acc);
		//아들 스레드 객체 생성
		Son son = new Son(acc);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		//스레드 중지
		son.interrupt();
		mother.interrupt();
		
		System.out.println("main 종료"); 
		//????????? 메인 스레드가 끝났는데 왜 아들 스레드가 실행되지?
		//답 : 동기화로 공유 자원을 사용중이기 때문에 마지막으로 사용할 때까지 기다려준다.
		//멀티 스레드인 경우 메인 스레드가 작업 스레드보다 먼저 종료되어도 작업 스레드가 실행 중이라면 프로세스는 종료되지 않음
	}

}

//통장 클래스 - 공동 자원
class Account {
	//필드
	int money; //싱크로 메서드들이 공통으로 사용하는 필드
	//싱크로 메서드 안에서 사용하는 필드기 때문에 처음 필드를 가져간 싱크로 메서드에서 다 쓸 때끼지 다른 싱크로 메서드가 사용할 수 없다.
	
	synchronized void widthdraw() {
		while(money == 0) { 
			try {
				wait();	//돈이 0이 되면 멈추고
			} catch (InterruptedException e) {
				break;	//메서드에서 나감
			}
			
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName()+money+"원 출금");
		money = 0; //출금
	}
	
	synchronized void deposit() {
		while(money > 0) {
			try {
				wait(); //돈이 남아 있으면 멈춤
			} catch (InterruptedException e) {
				break;
			}
		}
		//랜덤 입금 1~5만원
		money = (int)((Math.random()*5)+1)*10000;
		notifyAll();
		System.out.println();
		System.out.println(Thread.currentThread().getName()+money+"원 입금");
	}
}

//엄마 스레드
class Mother extends Thread {
	//필드
	Account account;
	
	public Mother(Account account) {
		super("엄마"); //super - Thread를 의미함
		this.account = account;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.deposit();
				sleep((int)(Math.random()*2000)); //입금 후 대기
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

//아들 스레드
class Son extends Thread {
	//필드
	Account account;
	
	public Son(Account account) {
		super("아들"); //super - 스레드를 의미함
		this.account = account;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.widthdraw();
				sleep((int)(Math.random()*300)); //출금 후 대기
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}



