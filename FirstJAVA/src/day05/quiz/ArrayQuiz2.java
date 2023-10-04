package day05.quiz;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		
		// numArr의 값들의 총합과 평균을 구해서 출력하세요.
		int[][] numArr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20},
				{30, 30, 30}
		};
		
//		int sum = 0;
//		int len = 0;
//		for(int i=0; i<numArr.length; i++) {
//			for(int j=0; j<numArr[i].length; j++) {
//				sum += numArr[i][j];
//				len++;
//			}
//		}
//		System.out.println("총합 : "+sum+" 평균 : "+(sum/(double)len));		// 평균이 소수점이 나올 수도 있기 때문에 두 값 중 하나를 double 값으로 캐스팅 해준다.
		
		// 선생님 ver
		int sum = 0;
		int items = 0;
		for(int i=0; i<numArr.length; i++) {
			items += numArr[i].length;
			for(int j=0; j<numArr[i].length; j++) {
				sum += numArr[i][j];
			}
		}
		System.out.println("총 합 : "+sum);
		System.out.println("평균 : "+sum/(double)items);

	}

}
