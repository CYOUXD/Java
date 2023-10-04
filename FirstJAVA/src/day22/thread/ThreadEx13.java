package day22.thread;

public class ThreadEx13 {

	public static void main(String[] args) {
		//그룹 객체 생성(Thread 그룹 객체)
		ThreadGroup group = new ThreadGroup("Group1");
		MyThread t1 = new MyThread(group, "First");
		MyThread t2 = new MyThread(group, "Second");
		MyThread t3 = new MyThread(group, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000); //Thread = main
		} catch (Exception e) {}
		
		//모든 스레드 중지
		group.interrupt();
	}
}

class MyThread extends Thread {
	public MyThread(ThreadGroup group, String name) {
		super(group, name);		
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500); 
				//?? 그냥 sleep과 위의 Thread.sleep의 차이는?
				//답 : 이 sleep은 어떤 스레드에서 실행되야 하는지 알 수 있어서 앞에 어떤 스레드라고 써주지 않아도 됨
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted 발생");
				break;
			}
		}
		System.out.println(getName()+" 종료");
	}
}



