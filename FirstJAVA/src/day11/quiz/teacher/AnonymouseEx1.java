package day11.quiz.teacher;

public class AnonymouseEx1 {

	public static void main(String[] args) {
		
		Machine tv = new TV("TV");
		Machine computer = new Machine();	
		
		//각 기기의 클래스마다 리모콘 인터페이스를 임플리먼트해서 사용할게 아니고 익명클래스와 인터페이스를 사용해서 만들 것
		//Machine.machineWork(remocon, tv); 의 형태가 아니라 아래처럼 익명 클래스를 사용해서 만든다. 매개변수로 익명클래스와 tv 객체가 들어간다
		//장비에 따라 실행하는 코드가 달라진다. 그래서 메서드를 각각 넣어준다. 그때그때 필요에따라 각자 다르게 정의해서 사용할 수 있다.
		Machine.machineWork(new Remocon() { 
			
			@Override
			public void on() {
				System.out.println(tv.getName()+"를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(tv.getName()+"를 끕니다.");
			}
		}, tv);
		
		//computer 객체에는 이름을 넣지 않아서 System..에 "컴퓨터를..."라고 넣어준다.
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println("컴퓨터를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 끕니다.");
			}
		}, computer);

	}

}
