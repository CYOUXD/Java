package day11.innerclass;//4

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonyVarExample {
	
	private Frame f;
	
	public AnonyVarExample() {
		f = new Frame("AnonymouseVar Class");	
	}
	//익명 클래스 쓰는 방법2
	//변수에 익명 클래스를 넣어서 사용하는 방법
	WindowAdapter handler = new WindowAdapter() {	//handler = 인스턴스 변수
		//handler = 객체를 복사해서 담는 곳 / new WindowAdapter() = 객체 선언
		//여기서 사용할 추상클래스나 인터페이스는 객체로 선언하려면 실제로 구현해야하므로 이들은 정의만 있기 때문에 구현할 내용을 써줘야한다.
		//WindowAdapter는 (미리 선언 된)추상클래스이기 때문에 객체 선언해서 쓸 수 없는데 이거를 객체 선언해서 쓰려면 구체적인 기능을 구현해야 하기 때문에 new WindowAdapter() 뒤에 {}안에 구체적인 기능을 써준다.
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("X 버튼을 눌렀음.");
			System.exit(0);
		}
	};
	
	/*
	 * 익명 클래스 형태
	 * new WindowAdapter() {	
		};
	 */
	public void launchFrame() {
		f.addWindowListener(handler);
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		AnonymouseExample ave = new AnonymouseExample();
		ave.launchFrame();

	}

}
