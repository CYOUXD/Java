package day08.Inheritance;

import day08.Inheritance.goodcase.Employee;
import day08.Inheritance.goodcase.Student;
import day08.Inheritance.goodcase.Teacher;

public class InheritanceExample {

	public static void main(String[] args) {	//객체 생성 - 기본값 입력 - 메서드사용
		//이름, 나이는 공통 데이터이므로 일반화하여 사용
		//공통 특성을 뺀 나머지를 재정의해서 사용
//		Person p = new Person();
//		p.name = "홍길동";
//		p.age = 25;
//		p.height = 179.8f;	//Person파일의 height의 접근 제한자는 protected		
//		p.weight = 60;		//Person파일의 weight의 접근 제한자는 default		만약 private이면 접근이 안되서 public 메서드로 접근해야한다.
		Person p = new Person("홍길동", 25, 179.8f);		//Person에서 만들어 놓은 매개변수(String, int, float)를 가진 생성자를 가져와서 적용한 것
		System.out.println(p.getDetails());
		
//		Student s = new Student();
//		s.name = "이순신";
//		s.age = 30;
//		Student s = new Student();		//new Student()라고 쓰면 jvm이 만든 기본 생성자를 적용함. 생성자는 상속이 안되기 때문에 ctrl+spacebar를 해도 기본생성자만 보임
		Student s = new Student("이순신", 30, "20230828", "해양학과");	//Student에서 매개변수(String, int, String, String)으로 선언한 생성자를 적용함
		s.studentId = "20230828";
		s.major = "해양학과";
		s.height = 185.6f;	//Person파일의 height의 접근 제한자는 protected이기 때문에 접근이 가능하다. 만약 default였으면 다른 패키지여서 접근이 안된다.
//		s.weight = 80f;		//접근 제한자가 default이기 때문에 자식이 상속 받지 못함!
		System.out.println(s.getDetails());
		
		Student s2 = new Student();
		System.out.println(s2.getDetails());
		
		Teacher t = new Teacher();
		t.name = "강감찬";
		t.age = 40;
		t.subject = "자바 프로그래밍";
		t.teacherId = "202311011";
		System.out.println(t.getDetails());
		
		Employee e = new Employee();
		e.name = "김덕우";
		e.age = 45;
		e.companyId = "20210112000";
		e.department = "강사부";

	}

}
