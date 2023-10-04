package day19.lambda;//10

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;


public class LambdaEx9 {
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "빅데이터")
	};
	public static void main(String[] args) {
		//Operator 인터페이스는 Function의 하위 인터페이스
		System.out.print("최대 수학 점수 : ");
		int max = maxOrMinMath((a, b) -> {//3. 2에서 받아온 두개의 매개변수를 여기 담아서
			if (a>=b) return a;	//4. 두 매개변수 비교 후 둘 중 하나를 반환
			else return b;
		});
		System.out.println(max);
		System.out.print("최소 수학 점수 : ");
		int min = maxOrMinMath((a, b) -> (a<=b? a : b));//삼항연산식 사용
		System.out.println(min);
		
		System.out.println("최대 평균 점수 : ");
		System.out.println(maxOrMinAvg((a, b) -> (a>=b?a:b)));		
		
		System.out.println("최소 평균 점수 : ");
		System.out.println(maxOrMinAvg((a, b) -> (a<=b?a:b)));
		
		
	}
	static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng())/2.0;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
		}
		return result;
	}
	
	static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();//1. 첫번재 math값을 넣고
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());//2. 첫번째 math값, list 순회하면서 math값을 넣어서
			//5. 다시 result에 반환된 값을 넣고 list 내부의 값을 모두 순회하면서 비교 할 때까지 반복한다.
		}
		return result;	//6. 반복이 끝난 후 최종 result 값을 반환 
	}
}