package Homework.quiz11;

public class Calculator {
	int result;
	static double pi = 3.14;
	
	int add(int a) {
		result +=a;
		return result;
	}
	
	int add(int a, int b) {
		result += a+b;
		return result;
	}
	
	int add(int a, int b, int c) {
		result += a+b+c;
		return result;
	}
	
	int add(int a, int b, int c, int d) {
		result += a+b+c+d;
		return result;
	}
	
	static double circle(int r) {
		return ((2*pi*r)*100)/100; //???이래도 되나..?
	}
}
