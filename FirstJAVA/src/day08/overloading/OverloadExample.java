package day08.overloading;

public class OverloadExample {

	public static void main(String[] args) {
		//오버로드 테스트
		OverloadClass object = new OverloadClass();
		object.abc(100, "자바");
		double d = object.abc(10.0, 11.0);
		System.out.println(d);	//0.0	double로 형 변환이 일어나서 double 2개가 들어가는 메서드에 적용되어 0.0이 반환됨
		object.abc("자바");
		object.abc(100, 200);

	}

}
