package day21.thread;//2

public class ThreadEx {
	
	public static void main(String[] args) {
		/*
		 * Thread 생성 방법 2가지
		 * 1. Thread 클래스 상속
		 * 2. Runnable 인터페이스 구현 후 Thread에 전달
		 */
		
		//Thread 상속 받는 방법
		ThreadExtend t1 = new ThreadExtend();
		
		//Runnable 인터페이스를 만들고 Thread에 집어 넣는다
		Runnable r = new RunnableImplement();
		//Thread 생성자에 매개변수로 전달
		Thread t2 = new Thread(r);
		
		//Thread 실행
		t1.start(); //start() : 스레드 생성, 실행
		t2.start();
		
	}

}

class ThreadExtend extends Thread {
	//Thread 클래스 상속
	@Override
	public void run() { 
		System.out.println("Thread 상속 받는 방법");
		for(int i=0; i<50; i++) {
			System.out.println("ThreadExtend : "+i);
		}
	}
}

class RunnableImplement implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable 구현하는 방법");
		for(int i=0; i<50; i++) {
			System.out.println("RunnableImplement : "+i);
		}
	}
}