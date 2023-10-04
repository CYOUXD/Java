package day02.Cal;

public class RemainderExample {

	public static void main(String[] args) {
		// +, -, *, /, %
		
		// 산술 연산
		byte a = 127;
		byte b = 20;	
		byte c = (byte)(a+b);	//128 - 19 = -109
		// 127+20=147은 127을 넘어가기 때문에 byte로 형변환을 하면 127을 넘는 19를 -128에 더해 주면 -109가 된다.
		System.out.println("계산 결과 : "+c);
		
		int a1 = 100000;
		int b1 = 100000;
		long c1 = (long)a1*b1; //큰 수가 되니까 미리 long로 해준다
		System.out.println("계산 결과 : "+c1);
		
		int a2 = 3;
		int b2 = 2;
		double data = a2/b2; //계산할 때는 무조건 int값으로 계산되기 때문에 1.5가 아니라 1이 된다. 1.5가 나오려면 a2, b2 둘 중 하나를 형 변환을 하면 된다.
		System.out.println("계산 결과 : "+data);
		
		// 값을 소수점 2자리까지 출력
		float pi = 3.141592f;
		float shortPi = (int)(pi*100)/100f; //int형으로 변경하면 314가 되고 float형인 100으로 나누면 소수점을 출력할 수 있게 되므로 3.14가 된다
		System.out.println("파이 2자리까지 출력 : "+shortPi);
		
		// 나머지 연산 : 1) 배수 관계  2) 특정 범위 값을 출력
		for(int i=1; i<=10; i++) {
			if(i%3 == 0) {	// 3의 배수 관계
				System.out.println(i);
			}
		}
		System.out.println(3.5 % 0.3); // 권장 안함 이런 형태의 계산 식은 문제가 생길 수 있음
	}

}
