package day15.generic;//3

public class PersonExample {

	public static void main(String[] args) {
		
		Person<Character> p1 = new Person<>('딸', 8);
		System.out.println(p1.getName());
		
		Person<String> p2 = new Person<>("아빠", 46);
		System.out.println(p2.getName());
		
		//메서드 자체(test())의 반환타입과 입력 값에 대한 반환 타입을 지정하는 방법
		//오브젝트라서 어떤 것이든 들어갈 수 있었지만 메서드의 매개변수를 통해 반환타입을 지정해서 메서드 자체의 반환타입을 지정해서 값을 넣어준다.
		System.out.println(p1.test(4.8));	//4.8 double Person의 test()를 사용
		System.out.println(p1.test("4.8"));	//String
		System.out.println(p1.test(5));		//int
		System.out.println(p1.test('5'));	//char
		
		
	}

}
