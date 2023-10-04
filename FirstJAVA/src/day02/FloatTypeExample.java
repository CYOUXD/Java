package day02;

public class FloatTypeExample {

	public static void main(String[] args) {
		float f = 1.1F; //혹은 캐스팅 방법으로 수정 float f = (float)1.1; 캐스팅보다는 끝에 f를 붙여주는게 더 정확하다. 강제 캐스팅은 값이 변할 수도 있다.
		double d = 1.1;
		System.out.printf("%f, %f", f, d); //%f = 실수형 표현
	}

}
