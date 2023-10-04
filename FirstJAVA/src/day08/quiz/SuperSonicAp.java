package day08.quiz;

public class SuperSonicAp extends Airplane {		// 부모 클래스에 기본생성자가 없으면 자식 클래스 이름에 빨간줄이 생긴다.
	

	/*
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화한다.
	 * 2. flyMode는 int형 변수로 선언합니다.
	 * 3. fly() 메서드를 오버라이딩 합니다.
	 * 		fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다"를 출력
	 * 		flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */
//	String name;
//	int flyMode;
//
//	public String SuperSonicAp(String name) {
//		this.name = name;
//		return name;
//	}
//	
//	@Override
//	void fly(int flyMode) {
//		if(this.flyMode == 1) {
//			System.out.println("고속 모드로 비행합니다.");
//		}
//		if(this.flyMode == 0) {
//			super.fly();
//		}
//	}
//	
	
	
	//선생님 ver
	int flyMode;
	
	//부모가 기본생성자가 없으면 자식도 기본 생성자를 만들어낼 수 없다.
	
	public SuperSonicAp(String name) {	//생성자는 반환 타입이 없음 	이건 기본 생성자가 아니고 초기화 생성자
		super(name);		//부모에 기본 생성자가 없고 초기화 생성자만 있을 때 super사용
//		this.name = name;	//위랑 같다. 생성자는 this나 super가 꼭 있어야 한다.
	}
	
	@Override
	void fly() {
		if(flyMode == 0) {		//flyMode 다른데 쓰지 않으니 중복되지 않아서 this를 안써도 알아서 멤버변수 flyMode가 적용 된다.
			super.fly();
		}else if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		}
	}
	
}
