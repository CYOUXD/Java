package day11.quiz;

public class AnimalExam {

	public static void main(String[] args) {
		Dog d = new Dog();
		Tiger t = new Tiger();
		GoldenFish g = new GoldenFish();
		Shark s = new Shark();
		
		AnimalExam.print(d);
		AnimalExam.print(t);
		AnimalExam.print(g);
		AnimalExam.print(s);
		
	}
	static void print(Animal animal){
		System.out.println(animal.getName()+"는 잠을 잡니다.");
		System.out.println(animal.getName()+"는 "+animal.getFood()+"를 먹습니다.");
	}
}
