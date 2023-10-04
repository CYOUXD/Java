package day11.quiz.teacher;

public class ZooKeeper {
	//동물들이 공통으로 묶여있는 Feed = 다형성	
	public void feed(Feed feed) {	
		//**Feed로 묶여있으므로 Feed로 써주면 하위의 클래스+변수를 매개변수로 가져올 수 있다. Feed로 묶여 있으니까 하위의 클래스를 매개변수로 사용할 수 있다.
		System.out.println(feed.getFood()+"를 줍니다.");
	};	
}
