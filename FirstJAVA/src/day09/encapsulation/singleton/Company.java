package day09.encapsulation.singleton;

public class Company {
	
	private String str;
	private static Company c = new Company();	// 1. Company 객체 멤버 생성 
	//자기 자신을 객체로 생성 Company 객체 멤버 변수 = 인스턴스 객체 변수	
	
	private Company() {							// 2. 생성자를 private으로 설정
		str = "company";
		System.out.println(str);
	}
	
	public static Company getCompany() {		// 3. public static을 통해서 객체 전달
		return c;	//전달해줘야 하는 c가 static이므로 메서드도 static이어야 한다. 
		//생성자가 private이므로 객체 생성을 할수 없음. 그래서 static메서드를 사용한다.
	}
	
}
