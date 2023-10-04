package day04;

public class LabeledLoopExample {

	public static void main(String[] args) {
		// labeled Loop
		// 상위 for문에 outer라고 지정한다. 이를 이용해 label로 break를 outer에 적용 할 수 있다
		outer : for(int i=0; i<3; i++) { //0 1 2
			for(int j=0;j<3;j++) { //0 1 2
				if(j==2) {
					break outer;  // 레이블이 outer인 반복문 종료
//					continue outer;  // 레이블이 outer인 반복문의 다음 회차로 진행
					// 종료가 아닌 건너 뛰기 이므로 break만 한 것과 같은 결과가 나온다.
				}
				System.out.println(i+"\t"+j);
			}
		}

	}

}
