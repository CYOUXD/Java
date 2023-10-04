package day10.interface_;

public class InterfactMemberExample implements ISomething {

	@Override
	public void run() {	//반드시 재정의 해야 함
//		My_INT = 33;	//ISomething 인터페이스의 final 변수임
		System.out.println("run() : "+ISomething.A);

	}
	
	public static void main(String[] args) {
		System.out.println(ISomething.My_INT);
		System.out.println(InterfactMemberExample.My_INT);	//상속 받았기 때문에 똑같은 My_INT 값을 가지고 있다.
		ISomething is = new InterfactMemberExample();
		is.run();	//자식 클래스의 오버라이드 된 run()이 실행된다.
		InterfactMemberExample im = new InterfactMemberExample();
		im.run();
	}

}
