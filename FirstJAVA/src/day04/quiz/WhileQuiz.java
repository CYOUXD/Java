package day04.quiz;

public class WhileQuiz {

	public static void main(String[] args) {
		// while 문을 이용하여
		// 구구단을 다음과 같이 세로로 출력합니다.
		// 2단  3단  4단...
		int i = 0;
		while(i <= 9) {
			int j = 2;
			
			while (j<=9) {
				if(i == 0) {
					System.out.print(j + "단\t");;
				} else {
//					System.out.print(j+"x"+i+"="+(j*i)+" ");
					System.out.printf("%dx%d=%d\t", j, i, j*i);		// \t로 간격을 주면 일정하게 떨어트릴 수 있다.			
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		//선생님 ver
		int gop = 0;
		while(gop<=9) {
			int dan = 2;	// 다음 반복시 2로 초기화 되어야 한다.
			
			while(dan <= 9) {
				if(gop ==0) {
					System.out.print(dan + "단\t");
				} else {
					System.out.printf("%dx%d=%d\t",dan, gop, dan*gop);
				}
				dan++;
			}
			System.out.println();
			gop++;
		}

	}

}
