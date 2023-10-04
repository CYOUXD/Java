package day03;

public class InnerForExample {

	public static void main(String[] args) {
		// 이중(다중) For 구문
//		for (int i = 0; i<=10; i++) {
//			System.out.println("===========바깥쪽 반복문 "+i);
//			
//			for (int j = 0; j <10; j++) {
//				System.out.println("-----------안쪽 반복문 "+i+"-"+j);
//				
//				for (int k = 0; k < 2; k++) {
//					System.out.println("+++ 제일 안쪽 반복문 "+i+"-"+j+"-"+k);
//				}
//			}
//		}
		
		// 예제1) 구구단 만들기
		// 2단 - 9단까지, 각 단마다 x1 - x9까지
//		for (int a = 2; a<10; a++) {
//			System.out.println(a+"단 출력");
//			for (int b = 1; b<10; b++) {
//				System.out.println(a+"x"+b+"="+(a*b));
//			}
//		}
		
		// 구구단 가로로 정렬해서 출력하기
//		for (int c = 2; c<10; c++) {
//			
//			for (int d = 2; d<10; d++) {
//				System.out.printf(d+"x"+c+"="+(c*d)+"\t");
//				
//			}
//			System.out.println("\n");
//		}
		
		// For 문제
		// 100부터 1까지 순서대로 출력하기
//		for (int e = 100; e > 0; e--) {
//			System.out.print(e+" ");
//		}
//		
//		// 1 ~ 200 사이의 수 중에서 (2 또는 3의 배수)가 아닌 수들의 총 합을 구하기
		int sum = 0;
//		for (int f = 1; f<=200; f++) {
//			if(!(f%2==0 || f%3==0)) {
//				sum += f;
//			}
//		}
//		System.out.println("1 ~ 200 사이의 수 중에서 (2 또는 3의 배수)가 아닌 수들의 총 합 : "+sum);
		
		// 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (...+8+9+10) 의 결과를 구하기
		sum = 0;
		for(int g = 1; g <=10; g++) {
			for(int h = 1; h <= g; h++) {
				sum += h;
			}
		}
		System.out.println("1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (...+8+9+10) 의 결과 : "+sum);
		
		// 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (...+8+9+10) 를 콘솔에 출력하기
		String txt ="";
		for(int i =1; i <=10; i++) {
			
			if(i==1) {
				txt += "1";
				
			} else {
				txt += " + ";
				
				for(int j=1; j<=i; j++) {
					if(j==1) {
						txt +="(1";
						
					} else if(j==i) {
						txt += "+";
						txt += j;
						txt += ")";
						
					} else {
						txt += "+";
						txt += j;
					}
				}
			}
		}
		System.out.println(txt);

	}

}
