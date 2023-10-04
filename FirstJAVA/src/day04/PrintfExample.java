package day04;

public class PrintfExample {

	public static void main(String[] args) {
		// print(), printf(), println()
		
		// System.out.print() : 전달 받은 데이터를 콘솔에 출력한다.
		// System.out.println() : 전달 받은 데이터를 콘솔에 출력하고 마지막에 \n(줄바꿈)이 추가됨.
		// System.out.printf() : 출력 형식(format)을 먼저 지정한 뒤 형식에 포함된 서식 문자에 값을 대입하여 원하는 문자열을 편리하게 출력할 수 있게 함
		
		/*
		 * 	서식문자 종류
		 * 	%d : 10진수 정수
		 * 	%o : 8진수 정수
		 * 	%x : 16진수 정수
		 * 	%s : 문자열
		 * 	%f : 실수
		 * 	%c : 문자
		 * 
		 */
		
		// 정수 출력
		int a = 5, b = 7;
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		
		System.out.printf("%10d\n", a); // %와 d사이의 숫자는 출력공간 확보
		System.out.printf("%20d\n", a);
		System.out.printf("%020d\n", a); // %와 d사이의 숫자는 출력공간 확보, 숫자 앞 0은 빈 곳을 0으로 채운다.
		System.out.printf("%-10d??\n", a);  // 10칸 확보 후 출력, 왼쪽 정렬 / 물음표는 그냥 빈칸인지 자리를 만든건지 확인하기 위해 넣은 것.
		System.out.printf("%+10d\n", -7);	// 숫자 앞 "+"는 부호 출력을 의미 함 (부호의 유무를 나타냄)
		System.out.printf("%+-10d\n", -7);	// +- : 왼쪽 정렬, 부호 출력을 의미 함
		
		// 실수 출력
		double d = 1234.56789;
		
		System.out.printf("%f\n",d);
		System.out.printf("%.3f\n",d);	// .3 : 소수점 3자리 만큼 출력
		System.out.printf("%20.3f\n",d);	// 출력공간 20칸 확보, 소수점 3자리만큼 출력
		System.out.printf("%020.3f\n",d);	// 알 여백 0으로 채움, 출력공간 20칸 확보, 소수점 3자리만큼 출력
		System.out.printf("%-20.3f\n",d);	// 왼쪽 정렬, 출력공간 20칸 확보, 소수점 3자리만큼 출력
		
		//문자열 출력
		String str = "hello world!";
		
		System.out.printf("%s\n", str);
		System.out.printf("%30s\n", str);	// 출력공간 30 확보
		System.out.printf("%-30s%s\n", str, str);	// 왼쪽 정렬, 출력공간 30 확보

	}

}
