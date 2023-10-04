package day11.quiz.teacher.animal;

public class Shark extends MarinAnimal implements Animal {

	@Override
	public void sleep() {
		System.out.println("상어는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		System.out.println("상어는 물고기를 먹습니다.");

	}

}
