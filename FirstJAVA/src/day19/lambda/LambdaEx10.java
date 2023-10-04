package day19.lambda;

import java.util.function.Predicate;

//11

public class LambdaEx10 {
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "컴공")
	};

	public static void main(String[] args) {
		//Predicate 매개변수O, 반환타입 boolean
		
		//과가 컴공인 학생의 영어 점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 영어 평균 점수 : "+avg);
		
		double avg2 = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 수학 평균 점수 : "+avg2);
	}
	
	private static double avgEng(Predicate<Student> predicate) {//Predicate<Student> 과목 확인용
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			//equals 비교. 이 때 Predicate 사용
			if(predicate.test(student)) { //t.getMajor().equals("컴공")과 student가 같을 때 true
				count++;
				sum += student.getEng();
			}
		}
		return (double)sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getMath();
			}
		}
		return (double)sum/count;
	}
}
