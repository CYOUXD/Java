package day15.compare;//6

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("홍길동", 20000);
		Employee e2 = new Employee("김찬중", 30000);
		Employee e3 = new Employee("허길자", 70000);
		Employee e4 = new Employee("이순신", 40000);
		
		//자동 정렬하는 TreeSet, TreeMap에서 정렬할 수 있는 기준이 필요함.
		// -> comparator를 이용한 정렬 -> Comparator 클래스를 생성 -> 생성자에 추가해서 적용
//		TreeSet<Employee> list = new TreeSet();
		TreeSet<Employee> list = new TreeSet(new EmployeeComparator());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		//Comparator인터페이스를 구현한 클래스를 생성자에 추가하지 않으면 cast되지 않아서 비교할 수 있는 내용이 없다는 에러가 뜸
		for(Employee s : list) {
			System.out.println(s);
		}
		
		
	}

}
