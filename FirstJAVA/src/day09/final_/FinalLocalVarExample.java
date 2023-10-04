package day09.final_;

public class FinalLocalVarExample {
	
	public int data = 100;

	public static void main(String[] args) {
		new FinalLocalVarExample().doIt("홍길동"); //=객체 생성 = new 객체생성().메서드()
		//객체 생성하는 법 = new 클래스명()

	}
	
	public void doIt(final String name) {
		final int age = 38;
		class InnerLocal {
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data : "+data);
				System.out.println("외부 클래스의 파라미터 변수 name : "+name);
				System.out.println("외부 클래스의 지역 변수 age : "+age);
			}
		}
		//static class가 아니므로 생성자로 객체 생성 후 사용할 수 있다.
		new InnerLocal().innerDoIt();	//=객체 생성
	}

}
