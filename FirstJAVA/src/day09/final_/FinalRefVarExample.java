package day09.final_;

public class FinalRefVarExample {
	
	static final MyDate date = new MyDate();	//date : 레퍼런스 변수는 주소값을 가지고 있음
	//= 데이터가 들어있는 heap의 주소 값이 들어있는 stack을 고정한다는 의미. 그러므로 stack 값은 바꿀 수 없고 heap 내부의 값은 바꿀 수 있게 됨
	//레퍼런스 변수가 아닌 기본 변수들은 stack에 heap의 주소 값이 아니고 값 자체가 담겨있기 때문에 값을 바꿀 수 없다.

	public static void main(String[] args) {
//		date = new MyDate();	//Error : 새로운 객체로 변경 X, = 레퍼런스 객체는 주소값이 변수에 담겨 있기 때문에 주소값을 바꾸는건 X
		// = 레퍼런스 객체를 다시 선언한다는 것은 주소값을 바꾼다는 뜻. final은 변수 값을 바꿀 수 없다는 뜻 = 레퍼런스 객체의 변수 값은 주소값이기 때문에 주소값 재설정 = 객체 선언 이 불가능하다는 뜻
		date.year = 2024;		//date 안의 변수 값을 바꾸는건 final이 선언된 date 자체를 바꾸는게 아니고 date 내부의 변수 값을 바꾸는 것이기 때문에 바꿀 수 있다.
		System.out.println(date.toString());

	}

}

class MyDate {
	int year = 2023;
	int month = 1;
	int day = 1;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	
	public void doIt(final int a) {
//		a++;	//Error : final 변수라서 수정할 수 없음
	}
}