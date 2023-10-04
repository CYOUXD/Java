package day02.Cal;

public class BitExample {

	public static void main(String[] args) {
		// 비트 연산자 : &, |, ^
		// & => and 연산 : 두 비트가 1일 때 1, 이외는 0
		// | => or 연산 : 두 비트 중 하나 이상이 1일 때 1, 모두 0인 경우 0
		// ^ => xor 연산 : 두 비트가 다를 때 1, 같을 때 0
		byte a = 5; // 0b0000_0101
		byte b = 3; // 0b0000_0011
		System.out.println(a & b); 	//0b0000_0001
		System.out.println(a | b);	//0b0000_0111
		System.out.println(a ^ b);	//0b0000_0110
		
		byte c = (byte)170; //0b1010_1010;
		byte d = 100;
		System.out.println("원래 d : " + d);
		
		d = (byte)(d ^ c);
		//1100_1110 (-50) => 128, 64, 0, 0 _ 8, 4, 2, 0 => 206 - 128 = 78 => -128 + 79 = -50 
		//byte가 표시 할 수 있는 가장 큰 수는 127까지 이고 그를 넘어 가는 것은 음수가 되어 표시 되기 때문에(2진법의 맨 앞이 1이 되어 음수가 되므로) 128부터는 음수로 표현 된다.
		System.out.println("c를 연산한 d : "+ d);
		
		d= (byte)(d ^ c);
		//0110_0100
		System.out.println("c를 다시 연산한 d : "+ d);

	}

}
