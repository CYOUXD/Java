package day15.compare;//5

public class Employee {
	
	String name;
	int salary;
	
	public Employee() {}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name+":"+salary;
	}
}
