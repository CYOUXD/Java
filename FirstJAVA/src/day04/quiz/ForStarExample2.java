package day04.quiz;

public class ForStarExample2 {

	public static void main(String[] args) {
		// 피라미드 찍기
		int dan = 5;
		for(int a = 0; a < dan; a++) {
			for(int b = 0; b < dan-a-1; b++) {
				System.out.print(" ");
			}
			for(int c = 0; c<a*2+1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 역피라미드 찍기
		for(int d = 0; d < dan; d++) {
			for(int e=0; e<d; e++) {
				System.out.print(" ");
			}
			for(int f=0; f<2*dan-(2*d)-1; f++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
