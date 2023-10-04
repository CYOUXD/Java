package day08.Inheritance.overriding;

public class Student extends Person {
	protected String studentId;
	protected String major;
	
	@Override	//=재정의  부모로 부터 상속 받은 것을 재정의하여 사용하는 것
	public String getDetails() {
		
//		return super.getDetails();	//이렇게 쓰면 상속받은 그대로 쓴다는 뜻
		return "이름: "+name+"\t나이: "+age+"\t학번: "+studentId+"\t학과: "+major;
	}
	
	/*
	 * Overriding이란?
	 * 부모 클래스로부터 상속받은 메서드를 자식 클래스에서 행위(Method)를 바꾸거나 보완하기 위해서 다시 정의해서 사용
	 * 재정의 규칙
	 *  - 상속을 전제로 함
	 *  - 리턴타입, 메서드 이름, 파라미터 변수 선언이 반드시 일치해야 함
	 *  - 접근 제한자는 같거나 more public해야 함 = 제한이 더 적은 접근 제한자를 가져야 한다.
	 *  
	 */
}
