package day11.quiz;

public class Tiger extends Land implements Animal {
	@Override
	public String getName() {
		return "호랑이";
	}
	@Override
	public String getFood() {
		return "고기";
	}

}
