package day12.exception;//1

public class RuntimeExceptionExample {
	
	public static int makeException1(int input) { //ArithmeticException 수학적 오류
		int divide = 0;
		int result = input/divide;
		return result;
	}
	
	public static void makeException2() {	//StringIndexOutOfBoundsException 인덱스 이상 참조 오류
		String s = "가";
		System.out.println(s.charAt(1));
	}

	public static void makeException3() throws Exception{	//ArrayIndexOutOfBoundsException 배열 인덱스 이상 참조 오류
		//throws Exception를 빼면 이 메서드에서 발생하고 throws Exception로 넘기면 이 메서드를 호출한 main 메서드에서 발생한다.
		int[] a = {1, 2, 3};
		System.out.println(a[3]);
	}
	
	public static void makeException4() {	//NullPointerException 값이 존재하지 않아 발생하는 오류
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {	//NumberFormatException 숫자형이어야 parseInt를 할수 있는데 형식이 달라 생기는 오류
		String notInt = "가나다";	//char는 정수 취급
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6() {	//StackOverflowError 스택 저장 공간을 넘어가서 침범하는 오류
		for(int i=0; i<Integer.MAX_VALUE; i++) {	//무한대로 실행됨
			makeException6();
		}
	}
	
	public static void makeException7() {	//ArrayStoreException 배열의 저장 오류
		Object[] objArr = new String[3];
		objArr[0] = 0;	//선언 자체가 Object로 되어 있기 때문에 컴파일 오류를 발생하지 않는다.
		//여기서 오류가 안나는 이유는 오브젝트 형태의 배열을 만들었기 때문에 정수를 넣는건 오류가 안나지만 String 타입을 넣기로 했기 때문에 실행하면 오류가 난다. 다형성 때문에 생기는 문제
	}
	
	public static void makeException8() {	//ClassCastException 스트링을 인티저로 캐스팅을해서 오류가 난다. 문자와 숫자는 관계가 없어서 바꿀 수 없음.
		Object[] objArr = new String[3];	//String 대신 int를 못넣는 이유는 Object가 클래스이기 때문에 클래스 대신 자료형인 인트를 넣을 수 없다. 만약 Object가 아니라 자료형으로 바뀌면 그땐 자료형을 넣을 수 있다.
		objArr[0] = "0";
		Integer a = (Integer) objArr[0];
	}
	
	public static void main(String[] args) throws Exception {	//여기도 throws Exception가 있어서 예외처리를 시스템에 넘긴다. = 시스템에 예외처리를 넘기면 종료시킨다.
		//main에서 throws를 하면 시스템에 예외처리를 넘겨서 종료시키게 되는데 main 내부에 try catch를 넣어주면 그 부분은 실행하고 그 외의 것들은 실행하지 않는다.
		//Runtime Exception	-	Unchecked Exception 
		try {
//			makeException1(5);
//			makeException2();
//			makeException3();
//			makeException4();
//			makeException5();
//			makeException6();
//			makeException7();
			makeException8();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
