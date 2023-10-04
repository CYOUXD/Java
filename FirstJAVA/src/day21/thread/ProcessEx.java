package day21.thread;//1

public class ProcessEx {

	public static void main(String[] args) {
		// 자바에서 다른 프로그램의 프로세스를 실행할 수 있는 방법
		//Runtime = Checked Exception
		try {
			//메모장 실행
			Process p1 = Runtime.getRuntime().exec("notepad.exe");//exec : 명령어 처리, 프로세스 반환
			System.out.println(p1.pid()); //pid : 프로세스 아이디. os로부터 받아온다
			
			//그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			p1.waitFor(); //p1 프로세스 종료 될 때까지 메인 스레드 대기. 종료가 안되면 그 다음 단계까지 안넘어감
			//p1이 종료될 때까지 기다렸다가 다음 실행
			p2.destroy(); //p1 프로세스가 종료되면 실행된다.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
