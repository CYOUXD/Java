package day19.lambda;//6

import java.util.function.Consumer;

public class LambdaEx5 {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
		
	}

}
@FunctionalInterface
interface LambdaInterface5{
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		final int iv = 40;
		//내부 클래스의 익명 클래스(익명 클래스는 내부, 지역 클래스도 될 수 있다) = 지역 클래스. 지역 클래스 안에 전달될 변수는 상수여야 한다.
		LambdaInterface5 f5 = () -> {
			System.out.println("Outer.this.iv : "+Outer.this.iv);//Outer의 this iv 10
			System.out.println("this.iv : "+this.iv);//10
			System.out.println("iv : "+iv);//40
		};
		f5.method();//Outer의 method
	}
}