package day09.static_;

public class Count {
	public int a = 0;		//= 인스턴스 변수
	public static int b = 0;	//공유자원 클래스들이 공통 사용
	
	public static int doIt() {
//		return ++a;		//Error : Cannot make a static reference to the non-static field a
		//static 메서드는 인스턴스 변수(a)를 객체 생성 없이 참조 불가능
		++new Count().a;	// = ++((new Count()).a);		객체를 생성 해 준 다음에 사용 가능
		return ++b;
	}
	
}
