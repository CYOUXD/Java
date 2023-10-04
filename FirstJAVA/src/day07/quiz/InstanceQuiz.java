package day07.quiz;

/*
 * 다음에 설명하는 객체에 클래스를 생성하여 확인하세요.
 * 
 * 모니터 클래스를 생성!!!
 * 	- 모니터는 해상도, 크기, 밝기, 상태(on/off) 속성을 가짐
 * 	- 모니터는 기본적으로 해상도, 크기, 밝기 값을 100, 상태는 off를 가리킴
 * 	- 모니터에는 버튼을 누르는 메서드 즉, 전원 on/off 기능이 존재함.
 * 		해당 메서드 실행시 전원이 켜져 있다면 꺼지고, 꺼져 있다면 켜져야 함.
 */

//public class InstanceQuiz {
//	public static void main(String[] args) {
//		
//		monitor myM = new monitor();
//		myM.onOff("on");
//	}
//}
//
//class monitor {
//	int resolution;
//	int size;
//	int brightness;
//	String state;
//	
//	monitor(){
//		resolution = 100;
//		size = 100;
//		brightness = 100;
//		state = "off";
//	}
//	monitor(String on_off) {
//		state = "off";
//	}
//	
//	String onOff(String onOff) {
//		if(onOff.equals("on")) {
//			onOff = "off";
//		} else {
//			onOff = "on";
//		}
//		System.out.println("전원을 "+onOff+"합니다.");
//		return onOff;
//	}
//}


//선생님 ver

class Monitor {
	//멤버 변수(속성)
	int resolution;
	int size;
	int brightness;
	boolean status;
	
	//생성자 constructor
	public Monitor() {
		this.resolution = 100;
		this.size = 100;
		this.brightness = 100;
		this.status = false;
	}
	//전원 메서드
	public void pressPowerButton() {
		status = !status;
	}
	
	//getter, setter	- 지금은 없어도 됨
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}

public class InstanceQuiz {
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		System.out.println("모니터의 기본 값 : 해상도-"+monitor.resolution+", 사이즈-"+monitor.size+", 밝기-"+monitor.brightness+", 전원-"+monitor.status);
		
		//전원 버튼 클릭
		monitor.pressPowerButton();
		System.out.println(monitor.status);
		
		//전원 버튼 클릭
		monitor.pressPowerButton();
		System.out.println(monitor.status);
	}
}




