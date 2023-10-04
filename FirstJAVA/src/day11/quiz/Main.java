package day11.quiz;

public class Main {

	public static void main(String[] args) {
//		Machine m1 = new TV();
//		m1.onOff();

	}

}

class Machine{
	String name;
	
	public Machine(String name) {
		this.name = name;
	}
	
	public void machineWork() {
		
	}
}

class TV extends Machine implements RemoteController{
	boolean onOff;
	
	public TV(String name) {
		super(name);
		onOff = false;
	}
	
	@Override
	public void onOff() {
		if(onOff == false) {
			System.out.println(name+"을 켰습니다.");
			onOff = true;
		}else {
			System.out.println(name+"을 껐습니다.");
			onOff = false;
		}
		
	}
}

class Computer extends Machine implements RemoteController{
	public Computer(String name) {
		super(name);
	}
	@Override
	public void onOff() {
		
	}
}

class Aircon extends Machine implements RemoteController{
	public Aircon(String name) {
		super(name);
	}
	@Override
	public void onOff() {
		
	}
}
