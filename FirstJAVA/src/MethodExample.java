
public class MethodExample {

	public static void main(String[] args) {
		int result = add(100, 200);
		System.out.println(result);

	}
	
	//add 메서드 정의
	static int add(int num1, int num2) { //return 값이 없으면 에러가 남. void가 아니기 때문에 값이 int 인 return 값이 있어야 한다.
		return num1 + num2;
	}

}
