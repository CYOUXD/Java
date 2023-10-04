package day11.quiz.teacher.animal;
//다중 상속 문제

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		GoldFish goldFish = new GoldFish();
		Tiger tiger = new Tiger();
		Shark shark = new Shark();
		
		dog.runs();	//LandAnimal에서 상속 받은 메서드 
		dog.sleep();
		dog.eat();
		goldFish.swim(); //MarinAnimal에서 상속 받은 메서드
		goldFish.sleep();
		goldFish.eat();
		tiger.eat();
		shark.eat();
		
		//여기서 추가적으로 뭔가를(애완동물) 넣고 싶을때(공통으로 묶고 싶을 때) 인터페이스로 추가한다.
		//애완동물로 묶을 수 있는 것을 인터페이스로 추가해 보기
		
	}

}
