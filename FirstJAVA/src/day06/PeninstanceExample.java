package day06;

public class PeninstanceExample {
	
	//pen class에서 가져오기

	public static void main(String[] args) {
		/*
		 * 생성된 Pen클래스의 객체 생성 예
		 * 
		 * 객체 생성 명령
		 *  ClassName instanceName = new Constructor();
		 */
		Pen redPen = new Pen();	// 생성자 이름은 클래스 이름으로 되어 있어 항상 같다. 클래스 이름에 소괄호를 붙인 것.
		redPen.color = "red";
		System.out.println(redPen); //redPen은 생성된 객체의 주소를 저장한 변수이기 때문에 해쉬 값이 출력된다.	
		System.out.println(redPen.color);
		//쓰기
		redPen.write();

	}

}
