package day09.static_;

public class StaticVarExample {//스태틱 변수 예제

	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;		//폰트가 기울어지면 static임
		System.out.println("Non-static a :"+c1.a);
		System.out.println("static b :"+c1.b);
		
		Count c2 = new Count();
		c2.a++;		//새로 만들어졌기 때문에 1
		c2.b++;		//공통으로 사용하는 클래스 변수 static이므로 2가 됨
		System.out.println("Non-static a :"+c1.a);
		System.out.println("static b :"+c1.b);
		
		Count.b++;
		System.out.println("c1.b : "+c1.b);
		System.out.println("c2.b : "+c2.b);
		System.out.println("Count.b : "+Count.b);
	}

}
