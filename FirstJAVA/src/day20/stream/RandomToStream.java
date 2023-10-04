package day20.stream;//8

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStream {

	public static void main(String[] args) {
		//Random.ints()
		System.out.println("int 형 난수 스트림 : ");
		//ints(3) 3개;
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		//ints(갯수, 시작 값, 끝 값 전(포함X))
		isr = new Random().ints(10, 0, 3);		//0 1 2 사이의 랜덤 값이 10번 나옴
		isr.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		//longs(갯수, 시작 값, 끝 값 전(포함X))
		System.out.println("long 형 난수 스트림 : ");
		LongStream lsr = new Random().longs(3, 0, 10);
		lsr.forEach(s -> System.out.print(s+ " "));
		System.out.println();
		
		//doubles()
		System.out.println("double 형 난수 스트림 : ");
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s -> System.out.print(s+" "));
		
		
	}

}
