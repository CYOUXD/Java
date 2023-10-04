package day09.modifier;

import day09.modifier.pac.Super;

/*
 * 	Modifier			Same Class		Same Package		Other package &			Other package
 * 															Sub Class				(전체)
 * -------------------------------------------------------------------------------------------------
 * public					o				o					o					o
 * protected				o				o					o					x
 * default					o				o					x					x
 * private					o				x					x					x
 * 
 * 접근 제한자는 클래스와 클래스 변수, 메서드, 생성자 등의 접근을 제어할 수 있는 제한자
 * (클래스의 경우에는 public과 default(공백)만 가능함. 단, 클래스 내부의 클래스는 4가지 접근제한자 다 가능함)
 * 
 */

public class ModifierExample {

	public static void main(String[] args) {
		System.out.println("*********Super 참조*********");
		Super sup = new Super();
		System.out.println("num1 = "+ sup.num1+				//public
//							"\tnum2 = "+sup.num2+			//Error : protected 같은 패키지거나 패키지가 다를 경우엔 상속 받은 경우에만 접근 가능
//							"\tnum3 = "+sup.num3+			//Error : default	같은 패키지여야 가능
							"\tnum4 = "+sup.getNum4());		//getter의 메서드가 public이므로 사용 가능
		
		System.out.println("*********Sub 참조*********");
		Sub sub = new Sub();
		sub.print();	//자기 자신의 private이기 때문에 불러오기 가능
	}

}
