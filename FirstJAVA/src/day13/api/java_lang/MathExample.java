package day13.api.java_lang;//5

public class MathExample {

	public static void main(String[] args) {
		// Math 클래스 예제
		
		System.out.println(Math.abs(-100));
		System.out.println(Math.ceil(10.0001));
		System.out.println(Math.floor(9.9999));
		System.out.println(Math.max(10.001, 10.010));
		System.out.println(Math.min(10.001, 10.010));
		System.out.println(Math.random());
		System.out.println(Math.rint(Math.random()*10));
		System.out.println(Math.round(9.9999));
		System.out.println(Math.round(10.0001));

		System.out.println(Math.round(1.5));
		System.out.println(Math.round(-1.5));	//올림으로 변경
		System.out.println(Math.rint(1.5));		//가까운 쪽의 숫자로 변경
		System.out.println(Math.rint(-1.5));
		
	}

}
