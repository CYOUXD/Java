package day08.Inheritance.overriding;

public class OverrideMain {

	public static void main(String[] args) {//여기는 그냥 실행하는 곳. 상속은 객체를 만들어서 가져온 Person과 Student에서 일어남
		
		Person p1 = new Person();	//Person을 쓰고 ctrl+space 눌러서 원하는 위치의 Person을 선택해준다
		p1.name = "홍길동";	//Person에서 생성자를 만들지 않았기 때문에 기본값을 여기서 넣어준다.
		p1.age = 18;
		System.out.println(p1);	//주소값이 보인다. new로 만들었으니까.
		System.out.println(p1.getDetails());		//Person의 getDetails();
		
		Student st1 = new Student();
		st1.name = "홍제자";
		st1.age = 14;
		st1.studentId = "first";
		st1.major = "도술";
		System.out.println(st1);
		System.out.println(st1.getDetails());		//Student의 getDetails();	
		//Student의 override된 getDetails()메서드를 지우면 Student의 부모인 Person의 getDetails()메서드를 가져와서 사용한다.

	}

}
