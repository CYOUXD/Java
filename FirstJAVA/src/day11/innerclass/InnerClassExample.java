package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 대표적인 내부 클래스 사용 예제 - JAVA GUI(Graphic User Interface)
 * 
 * JAVA GUI란?
 * - 프로그램을 그래픽화(프레임창) 시켜 작동시키는 것을 말함. AWT(만들기 쉽고, 무거움), SWING(만들기 어려움, 가벼움) 패키지
 * - Frame 또는 Jframe 클래스를 이용해서 프레임 창을 구현. 각종 이벤트 및 버튼, 패널, 입력창, 메뉴바, 속성 같은 구성 요소들을 각 클래스들을 이용해서 구현
 * - Frame(a) 클래스가 각종 구성 요소(B) 클래스들을 전부 호출. 구성 요소(B) 클래스들은 각 프레임 창 별로 달라지는 형태로 개별 클래스화하면 여러 측면에 낭비가 일어날 수 있음. 때문에 내부 클래스 사용
 */

public class InnerClassExample {
	
	private Frame f;	//여기서만 조작 할 수 있도록 private
	
	public InnerClassExample() {
		f=new Frame("Inner 예제");
	}
	
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdaptor()); //MyWindowAdaptor() = 내부 클래스의 생성자
		//MyWindowAdaptor의 실행 결과를 addWindowListener 에 넘겨줘서 이벤트 실행
		//MyWindowAdaptor에서 결과 값을 전달해 줄 때까지 대기했다가 전달한 값(=창 닫기)를 addWindowListener가 감지하여 실행해 줌
		f.setSize(300, 200); //창의 가로 세로
		f.setVisible(true);	 //창을 보일지 말지
	}
	
	public static void main(String[] args) {
		InnerClassExample ie = new InnerClassExample();
		ie.launchFrame();

	}
	
	//내부 클래스라서 접근제한자를 자유롭게 사용할 수 있다.
	//멤버 이너클래스
	//컴파일시에 같이 컴파일 되고 온전한 클래스이기 때문에 상속 및 다형성 기능 사용이 가능하다.
	//WindowAdapter는 띄워놓은 프레임에 최소, 최대, x등의 버튼을 누르는 이벤트 처리시 사용한다.
	//때문에 프레임을 만들 때 마다 필요하지만, 각 프레임에 종속되어야하기 때문에 하나의 클래스로 만들기엔 여러가지 제약이 걸림. 그렇기 때문에 이너클래스로 사용한다.
	private class MyWindowAdaptor extends WindowAdapter {	//WindowAdapter = 추상클래스, 기능만 정의
		@Override
		public void windowClosing(WindowEvent e) {	//x를 눌렀을 때의 이벤트를 넣어준다.
			System.out.println("x를 눌렀어요!!!");
			System.exit(0);	//현재 프로세스 종료			
		}
	}

}
