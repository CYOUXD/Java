package day02.Cal;

public class BitShiftExample {

	public static void main(String[] args) {
		// 비트 이동 연산자 : <<, >>, >>>
		int a = 192; //0b ... 1100_0000
		System.out.println("a(192)\t" + toBinaryString(a)+"\t"+a);
		
		//쉬프트 연산
		int a1 = a << 3; //왼쪽으로 3비트 이동 2의 3승을 곱한 것과 같다.
		System.out.println("\na<<3\t" + toBinaryString(a1) + "\t" + a1);
		
		int a2 = a >> 3; //오른쪽으로 3비트 이동 2의 3승을 나눈 것과 같다.
		System.out.println("\na>>3\t" + toBinaryString(a2) + "\t" + a2);
		
		a = -192; //비트 이동 할 때 부호가 음수면 1로 채워지고 양수면 0으로 채워진다
		System.out.println("a(-192)\t" + toBinaryString(a) + "\t" + a);
		
		int a3 = a << 3; 
		System.out.println("\na<<3\t" + toBinaryString(a3) + "\t" + a3);
		
		int a4 = a >> 3; 
		System.out.println("\na>>3\t" + toBinaryString(a4) + "\t" + a4);
		
		int a5 = a >>> 3;
		int a6 = a >>> 35; //오른쪽으로 밀리고 생긴 자리는 무조건 0으로 채운다
		System.out.println("\na>>>3\t" + toBinaryString(a5) + "\t" + a5);
		System.out.println("\na>>>35\t" + toBinaryString(a6) + "\t" + a6);
		//35를 밀면 총 32비트기 때문에 한 번 다 밀린 다음 3비트 더 밀리기 때문에 >>>3과 한 것과 결과는 같다.
		//길이 값을 넘어가게 밀면 전체 값을 뺀 값을 미는 것과 같다. 32비트를 다 밀어낸다고해서 0이 된다는 뜻이 아니고 원래와 같다는 뜻이다.
	}
	
	private static String toBinaryString(int num) {
		String a = Long.toBinaryString(num | 0xFFFFFFFF00000000L); // < 필터링 일정 값을 배제하기 위해 임의로 입력한 16진수 값. and 연산자면 앞이 0 뒤가 F일 것이다
		//그래야 두개의 값을 비교 했을 때 원래의 값(....1100_0000)이 그대로 나올 수 있기 때문이다. 
		//필터링에 있는 0의 위치는 보여주고 싶은 위치에 써주고 F(or 연산에서 1과 같은 의미)는 가리고 싶은 위치에 써준다.
		//16진수의 F(15)는 2진수 1111(15)과 같다. 즉 F하나당 4비트기 때문에 결과에 0이 많이 표시되는 이유
		return a.substring(32);//32번부터 나머지를 다 출력하라는 뜻
	}

}
