package day08.Inheritance.goodcase;

import day08.Inheritance.Person;

public class Employee extends Person {
	//중복 된 이름과 나이는 부모 클래스에서 가져와서 쓰면 되므로 생략 가능 : good case
	public String companyId;
	public String department;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t사번: "+companyId+"\t부서: "+department;
	}
}
