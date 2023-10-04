package Homework.quiz15;

public class Palindrome {

	public static void main(String[] args) {
		palindromeCheck("apple");
		palindromeCheck("다시 합창 합시다");
		palindromeCheck("가나다 다나 가");
	}
	public static void palindromeCheck(String str) {
		String removeSpace = str.replace(" ", "");
//		double half = removeSpace.length()/2;
//		int fNum = (int)Math.floor(half);
//		int bNum = (int)Math.ceil(half);
//		System.out.println(fNum+", "+bNum);
		int cutNum = removeSpace.length()/2;
		String front;
		String back;
		
		if(removeSpace.length()%2 > 0) {
			front = removeSpace.substring(0, cutNum);
			back = removeSpace.substring(cutNum+1, removeSpace.length());
			
		}else {
			front = removeSpace.substring(0, cutNum);
			back = removeSpace.substring(cutNum, removeSpace.length());
		}
		
		StringBuilder text = new StringBuilder(front);
		text = text.reverse();
		StringBuilder backText = new StringBuilder(back);
//		System.out.println(text.getClass());
//		System.out.println(backText.getClass());
		
//		System.out.println(text.hashCode());
//		System.out.println(backText.hashCode());
//		System.out.println(text.equals(backText));
		
		if(text.toString().equals(backText.toString())) {	//StringBuilder의 문자열은 .equals로 비교 할 수 없다. toString으로 바꿔 준 후 비교한다.
			//equals로 바로 비교 안되는 이유 : String은 Object로 부터 받은 equal메서드를 주소값이 아닌 문자열 값 자체를 비교하도록 재정의해서 사용하고 있지만  StringBuilder는 equal 메서드를 재정의하지 않아서 주소값을 비교하게 된다.
			System.out.println("회문입니다.");
		}else {
			System.out.println("회문이 아닙니다.");
		}
		
//		System.out.println(front+", "+back);
//		System.out.println("앞 : "+front);
//		System.out.println("뒤 : "+back);
	};

}
