package day11.quiz.teacher;

public class Lion extends Carnivore implements Feed {
	@Override
	public String getFood() {
		return "고기";
	}
}
