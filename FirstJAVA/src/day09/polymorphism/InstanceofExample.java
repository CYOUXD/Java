package day09.polymorphism;

public class InstanceofExample {

	public static void main(String[] args) {
		
		Student s = new Student("홍학생", 17, "20230001", "JAVA");
		printPersonInfo(s);		
		Teacher t = new Teacher("홍선생", 22, "JAVA Programming");
		printPersonInfo(t);
		Employee e = new Employee("홍직원", 23, "교무처");
		printPersonInfo(e);
	}
	
	//다형적 인자 별로 출력하는 메서드
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {		//p가 Student 객체와 같은가? 객체 비교
			System.out.println("******** Student Info *********");
		}else if(p instanceof Teacher) {
			System.out.println("******** Teacher Info *********");
		}else if(p instanceof Employee) {
			System.out.println("******** Employee Info *********");
		}else {
			System.out.println("******** Person Info *********");			
		}
		System.out.println(p);	//p가 student의 객체 일 때 = Student의 toString(); 실행(부모의 toString을 오버라이딩한 Student의 toString()실행)
		// p가 Teacher의 객체 일 때 = Person의 toString()실행
		System.out.println(p.getDetails());
		System.out.println("******************************");
	}

}
