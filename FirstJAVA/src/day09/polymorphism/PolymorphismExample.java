package day09.polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		//다형성 테스트
		Person p = new Student("홍학생", 17, "202300001", "도술");
		p.wark();	//부모 클래스인 Person에 있는 메서드	
//		p.study();	//p는 다형적 객체이므로 부모 클래스에 있는 메서드만 사용할 수 있다  .study()는 자식인 Student 클래스에 있다
		Student casting = (Student)p;	//study()는 Student만 가진 메서드로 캐스팅을 통해서 변환 후 study()의 메서드 사용 가능
		casting.study();
	}

}
