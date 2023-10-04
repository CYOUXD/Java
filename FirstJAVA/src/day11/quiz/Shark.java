package day11.quiz;

public class Shark extends See implements Animal {
	@Override
	public String getName() {
		return "상어";
	}
	@Override
	public String getFood() {
		return "물고기";
	}

}
