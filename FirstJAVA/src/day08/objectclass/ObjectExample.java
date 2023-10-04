package day08.objectclass;

import day08.Inheritance.Person;

public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object();	//최상위 객체
		obj.hashCode();	//객체 동등 비교를 위해서 사용. 문자를 숫자값으로 바꿔준다.	heap에 저장된 주소값을 반환한다. 값 부터 ~ 주소값까지 완전히 같아야 같다고 반환한다.
		obj.equals(obj); //객체 동등 비교를 위해서 재정의
		obj.toString();	//기본적으로 클래스명@hashcode 값으로 출력
						//재정의해서 객체 내의 정보를 확인을 위한 용도로 사용!
		
		Person p1 = new Person(20, "홍길동");//age를 담아 계산한 result값을 name를 계산할 때 그대로 넣었으니까 age의 값과 name의 값이 둘 다 같아야 결과 값이 같아진다. 
		Person p2 = new Person("홍길동", 20, 185.0f);
		//매개변수의 개수가 다르지만 특정 범위의 값이 같다면 같다고 할 수 있도록 age와 name만을 비교하기 위해 hashcode를 사용해서 비교한 것이다.
		System.out.println("p1의 hashCode 값 : "+p1.hashCode());
		System.out.println("p2의 hashCode 값 : "+p2.hashCode());
		System.out.println("p1의 p2의 비교 결과 : "+(p1.hashCode()==p2.hashCode()));
		
		day08.Inheritance.overriding.Person o1 = new day08.Inheritance.overriding.Person();	
		day08.Inheritance.overriding.Person o2 = new day08.Inheritance.overriding.Person();
		System.out.println("o1의 hashCode 값 : "+o1.hashCode());
		System.out.println("o2의 hashCode 값 : "+o2.hashCode());

		
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());	//오브젝트의 toString()을 오버라이드(메서드를 수정해서 사용)해서 출력을 할 수 있도록 바꿔준 메서드가 실행. 이해 안되면 외우기
		System.out.println(p1);	//System.out.println(p1);을 하면 toString()이 실행되는데 이걸 오버라이드해서 수정했으니 기존의 System.out.println(p1);도 수정된 형태로 나온다.
	}


}
