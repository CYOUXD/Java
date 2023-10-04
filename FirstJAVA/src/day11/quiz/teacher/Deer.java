package day11.quiz.teacher;

public class Deer extends Herbivore implements Feed {
	//객체는 다양한 형태의 정보를 모아서 전달해 주는 것
	@Override
	public String getFood() {
		return "건초";
	}
}
