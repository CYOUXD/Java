package day19.lambda;//9

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class LambdaEx8 {
//Function : 받아서 다른 타입으로 변환해준다
	static Student[] list = {
		new Student("홍길동", 90, 80, "컴공"),
		new Student("이순신", 95, 70, "통계")
	};
	
	public static void main(String[] args) {
		//Function<T, R>
		System.out.println("학생명 : ");
		printString(t -> t.getName());
		
		System.out.println("전공 :");
		printString(t -> t.getMajor());
		
		System.out.println("영어 점수 :");
		printInt(t -> t.getEng());
		
		System.out.println("수학 점수 :");
		printInt(t -> t.getMath());
		
		System.out.println("영어 점수 합계 :");
		printTot(t -> t.getEng());
		
		System.out.println("수학 점수 합계 :");
		printTot(t -> t.getMath());
		
		System.out.println("영어 점수 평균 :");
		printAvg(t -> t.getEng());
		
		System.out.println("수학 점수 평균 :");
		printAvg(t -> t.getMath());
	}
	
	static void printAvg(ToDoubleFunction<Student> f) { //double로 매핑
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / list.length);
	}
	
	static void printTot(ToIntFunction<Student> f) { //int로 매핑
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
	static void printInt(Function<Student, Integer> f) { //int로 매핑
		for(Student s : list) {
			System.out.print(f.apply(s)+" ");
		}
	}
	static void printString(Function<Student, String> f) { //Function의 Student가 printString() 메서드 매개변수 내의 t이므로 t에 담긴 t.getName을 apply로 실행. String으로 매핑
		for(Student s : list) {
			System.out.print(f.apply(s)+" ");
			//apply : 매개변수로 받은 s 값을 f로 매핑해 줌
			//여기서는 String이므로 Student객체인 t가 반환한 t.getName이 String이므로 제대로 매핑됨. 타입이 다르면 오류
		}
		System.out.println();
	}

}
class Student{
	private String name;
	private int eng;
	private int math;
	private String major;
	
	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getMajor() {
		return major;
	}
	
	
	
}