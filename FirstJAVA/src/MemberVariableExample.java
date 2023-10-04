
public class MemberVariableExample {
	
	//멤버 변수란? 클래스 내에서 사용하는 변수를 의미함(인스턴스(=객체화) 변수) = 객체 변수
	int a; //멤버 변수(인스턴스 변수, 속성, 필드) 멤버 변수기 대문에 main이 아니라 class에서 작성
	static int b; //멤버 변수(클래스 변수) static이 붙으면 클래스 변수라고 한다.

	public static void main(String[] args) {
		// 멤버 변수는 사용하기 전에 초기화 하지 않아도 기본값으로 초기화 됨
		System.out.println("b의 초기값 : "+b); //b는 static이 붙어 있어서 static 메서드에서 부를 수 있다.
		new MemberVariableExample().test();
	}
	
	public void test() {
		System.out.println("a의 초기값 : "+a);
	}

}
