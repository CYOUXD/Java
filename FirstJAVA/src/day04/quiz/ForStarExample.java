package day04.quiz;

public class ForStarExample {

	public static void main(String[] args) {
		// 별 찍기 1
		int dan = 5;
		for(int i=0; i<dan; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈용
		}
		
		// 별 찍기2		
		for(int k = dan; k>=0; k--) {
			for(int a=0; a<k; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별 찍기3
		for(int b = 0; b <dan; b++) {
			// 공백찍기
			for(int c = 1;c<dan-b;c++) {
				System.out.print(" ");
			}
			for(int d=0;d<=b;d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별 찍기4
		for(int e=0; e<dan; e++) {
			for(int f=0;f<e; f++) {
				System.out.print(" ");
			}
			for(int g=dan;g>e;g--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
