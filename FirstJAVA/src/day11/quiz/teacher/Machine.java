package day11.quiz.teacher;

public class Machine {
	protected String name;
	
	//getter setter를 쓴다는 것은 생성자를 만들지 않겠다는 뜻
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void machineWork(Remocon remocon, Machine machine) {
		remocon.on();	//리모콘의 on()메서드
		remocon.off();	//리모콘의 off()메서드
	}
		
}
