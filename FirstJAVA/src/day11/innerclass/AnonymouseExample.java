package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymouseExample {

	private Frame f;
	
	public AnonymouseExample() {
		f = new Frame("Annonybouse Class");
	}
	//익명 클래스 쓰는 방법1
	//익명 클래스를 바로 넣어서 쓰는방법
	public void launchFrame() {
		//익명 클래스 사용 - 익명 클래스는 이름이 없기 때문에 생성자도 가지지 않고, 호출 및 상속을 할 수 없음
		//생성자를 가지지 않고 인스턴스를 만들어야 하기 때문에 이미 만들어진 인터페이스나 클래스를 상속 또는 구현해서 만들어야 합니다.
		//내부 클래스와 달리 호출도 필요없는, 여러번이 아닌 한 번만 사용할 클래스에 주로 사용됩니다. 
		//또는 클래스 내에 메서드를 재정의하기 용이해 함수형 프로그램과 비슷하게 활용할 수 있습니다.
		//인터페이스와 익명 클래스를 같이 사용한다면 여러 상황에서 쓰일 수 있는 유틸리티 클래스를 만들 수 있음.
		//익명 클래스에 가져와서 쓰는 클래스는 모든 클래스를 쓸 수 있지만 {}내부에 사용할 메서드 들은 전부 재정의 해야한다.
		f.addWindowListener(new WindowAdapter() {	//익명클래스 - 추상클래스(WindowAdapter)를 상속받거나 그 클래스의 기능을 재 정의 하면서 객체로서의 형태를 가지게 된다. 1회용
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("X 버튼을 눌렀음.");
				System.exit(0); // 0 = 정상 종료를 의미함
			}
		});
		
/*		여기서 부터~
 * 		new WindowAdapter() {	
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("X 버튼을 눌렀음.");
				System.exit(0);
			}
		}
		~여기까지가 익명 클래스
 */
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		AnonymouseExample ae = new AnonymouseExample();
		ae.launchFrame();

	}

}
