package day02.Cal;

public class LogicalExample {

	public static void main(String[] args) {
		// 논리 연산자 ^, &, |, &&, ||
		int x=10, y=20;
		System.out.println("(x != 10)&(++y == 21)의 결과 : "+ ((x != 10)&(++y == 21)));
		System.out.println("x : "+x+", y : "+y);
		
		System.out.println("(x == 10)|(++y == 21)의 결과 : "+ ((x == 10)|(++y == 21)));
		System.out.println("x : "+x+", y : "+y);
		
		//short circuit
		int a=10, b=20;
		System.out.println("(a != 10)&&(++b == 21)의 결과 : "+ ((a != 10)&&(++b == 21))); 
		//앞의 조건이 거짓이 되므로 && 뒤의 조건 값은 실행하지 않는다. 그러므로 b는 20
		//&를 하나만 쓰면 조건이 거짓이든 아니든 두 조건 다 확인 하는데 &&로 쓰면 앞이 거짓일 때 뒤는 실행되지 않는다.
		System.out.println("a : "+a+", b : "+b);
		
		System.out.println("(a == 10)||(++b == 21)의 결과 : "+ ((a == 10)||(++b == 21))); 
		System.out.println("a : "+a+", b : "+b);
		//||를 사용하면 앞의 조건이 참이면 무조건 참이 되므로 뒤의 조건은 실행되지 않아서 b는 20이 된다.
		//&, | 보다 &&, ||가 속도가 빠르다. 참, 거짓이 판별 되는 순간 그 뒤의 것은 실행되지 않으므로.
		

	}

}
