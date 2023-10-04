package day11.quiz;

public class Dog extends Land implements Animal {
	@Override
	public String getName() {
		return "개";
	}
	@Override
	public String getFood() {
		return "사료";
	}
}
