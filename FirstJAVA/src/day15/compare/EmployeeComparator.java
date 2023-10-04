package day15.compare;//7

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		//이름을 비교!
		return o1.name.compareTo(o2.name);	//compareTo는 Comparable에서 상속받음
		//compareTo : 값의 자리 하나하나 비교한다
	}
}
