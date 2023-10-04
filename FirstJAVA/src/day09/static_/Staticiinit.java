package day09.static_;

public class Staticiinit {
	
	//생성자가 실행되기 전, static 변수 초기화
	//객체를 여러번 생성해도 한번만 실행(생성자와 다름)
	//static은 어디서나 사용가능하기 때문에 이전 값이 있을 수도 있으니 정리하고 실행하는 것
	static {
		System.out.println("static initializer가 수행됨");
	}
	
	public Staticiinit() {
		System.out.println("Constructor 호출됨");
	}
}
