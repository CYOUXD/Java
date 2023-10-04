package day19.lambda;//2

public class LambdaEx {

	public static void main(String[] args) {
		LambdaInterface li = () -> {
			String str = "메서드 출력";	//재정의 하는 부분
			System.out.println(str);
		};
		li.print();
	}

}

interface LambdaInterface{
	void print();
//	void print2();  //추상 메서드가 두개면 함수적 인터페이스가 아니라서 람다식을 사용할 수 없다.
}

