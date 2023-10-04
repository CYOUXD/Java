package day09.static_;

public class StaticMethodExample {
//멤버변수 선언 없이 그냥 메서드를 가져와서 쓰고 싶을때 static class를 쓴다
	public static void main(String[] args) {
		System.out.println("Count.doIt() : "+Count.doIt());
		System.out.println("Count.doIt() : "+Count.doIt());
		System.out.println("Count.doIt() : "+Count.doIt());
	}

}
