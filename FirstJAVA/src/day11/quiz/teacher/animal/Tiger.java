package day11.quiz.teacher.animal;

public class Tiger extends LandAnimal implements Animal {

	@Override
	public void sleep() {
		System.out.println("호랑이는 잠을 잡니다.");

	}

	@Override
	public void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");

	}

}
