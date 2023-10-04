package Homework.quiz07;

public class Calculator {
	int num1;
	int num2;
	int num3;
	int num4;
	int result;
		
	public int add(int num1) {
		result += num1;
		return result;
	}
	public int add(int num1, int num2) {
		result += num1+num2;
		return result;
	}
	public int add(int num1, int num2, int num3) {
		result += num1+num2+num3;
		return result;
	}
	public int add(int num1, int num2, int num3, int num4) {
		result += num1+num2+num3+num4;
		return result;
	}	
	
}
