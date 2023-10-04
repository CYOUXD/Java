package day09.final_;

public class FinalInitExample {
	
	/*
	 * final 멤버변수는 선언시(a), 초기화시(b), 또는 기본 생선자(c)중에 하나에서 반드시 초기화 해야 함
	 * 기본 생성자가 아닌 생성자에서는 파라미터를 통한 초기화 안됨!
	 * 
	 * final은 초기 값이 들어와야 고정 할 수 있기 때문에 초기값을 넣는 초기화를 꼭 해줘야 한다.
	 * 
	 * final만 쓰면 비어 있는 값일 수 있지만 static과 함께 쓰면  static은 사용 시작과 동시에 자리를 만들어 놓기 때문에 final과 함께 쓰면 상수가 된다.
	 */
	
	public static void main(String[] args) {
		FinalInit f = new FinalInit(30);	//이 30은 기본 생성자로 초기화가 끝난 후에 나오는 FinalInit(int a)에 넣는 값이다.
		System.out.println(f.a);
		

	}

}

class FinalInit{
	// final 멤버변수 초기화 방법 3가지
	
	//a
//	final int a = 10;
	
	//b
//	final int a;		
//	{	//인스턴스 초기화방법
//		a=10;	
//	}
	
	//c
	final int a;		
	FinalInit() {
		a = 10;
	}
	
	//X
	FinalInit(int a){
		this.a = a;		//이것만 쓰면 이것은 final필드의 초기화가 아니기 때문에 오류가 남. final은 꼭 초기화를 해줘야 한다.
	}
}


/*
 * Final
 * - 클래스, 변수, 메서드에서 사용
 * - 클래스
 * 	> 상속 불가능, 인스턴스를 생성 사용
 * 	> String(대표적인 Final 클래스, 상속X)
 * - 변수
 * 	> 상수 정의
 * 	> 상수 정의 시에 static이 따라온다.누구나 볼 수 있고 변하지 않는 수 = 상수
 * 	> 로컬 클래스의 메서드에서 지역변수를 참조해야 하는 경우, 지역 변수에 final을 붙여야 함(로컬 클래스에서 사용할 지역변수에는 final 붙여주기)  (로컬클래스 = 메서드 안에 선언된 클래스)
 * - 메서드
 * 	> 재정의 불가능하게 함(overriding 불가!)
 * 
 */
