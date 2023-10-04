package day12.exception;//6

public class MultiCatchExample {
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static void doSomething(int a) throws Exception{
		if(a>50) {
			throw new Exception("a 값이 50보다 큽니다.");	//throw : 예외 발생 키워드 !=throws
			//throw new 예외클래스이름 으로 내가 예외라고 임의로 만든거기 때문에 실제로 거기에 맞는 예외가 발생하지 않아도 예외가 발생된다고 뜬다. 
			//ex. throw new ArrayIndexOutOfBoundsException("a 값이 50보다 큽니다."); 
					//- 배열 관련 예외지만 throw로 만들면 내가 임의로 만들어낸거기 때문에 실제 에러가 발생하지 않아도 예외로 실행된다.
		}else {
			System.out.println("50% 확률로 실행됩니다.");
		}
	}
	
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*4);
		
		try {
			System.out.printf("a = %d, b = %d, result = %d\n", a, b, divide(a,b));
			doSomething(a);
			
		} catch (ArithmeticException ae) {	//ArithmeticException - 0으로 나눌수 없는 경우가 생김
			System.out.println("0으로 나누려고 하고 있습니다.");
			System.out.println(ae.getMessage());
			
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			System.out.println("예외 발생 원인 : "+e.getMessage());	
			//** e.getMessage 예외가 발생한 코드를 알려주기 때문에 throw로 강제로 예외를 발생시킨 throw new Exception("a 값이 50보다 큽니다."); 부분을 출력해준다.
			//e.getMessage가 throw new Exception(); 을 출력해 준다.
			
		}
	}

}
