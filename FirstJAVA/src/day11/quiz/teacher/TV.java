package day11.quiz.teacher;

public class TV extends Machine {
	public TV(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	public void show() {
		System.out.println("방송중입니다.");
	}
}
