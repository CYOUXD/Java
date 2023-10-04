package day03;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// switch case 문을 사용하여 특정 문자를 입력 받는 경우에 내용 출력
		
		Scanner scan = new Scanner(System.in); // 입력 받을 때 쓰는 것
		String str = scan.next();
		System.out.println(str.charAt(0));	// charAt() : String 은 각 문자가 모인 배열이므로 charAt()로 원하는 인덱스에 있는 문자를 가져올 수 있다.
		switch (str.charAt(0)) {
		case 'i':
		case 'I' :
		case 'ㅑ':
			System.out.println("데이터를 입력합니다.");
			break;
		case 'u':
		case 'U':
		case 'ㅕ':
			System.out.println("데이터를 수정합니다.");
			break;
		default:
			System.out.println("명령어가 올바르지 않습니다.");
			break;
		}
		
		scan.close();
	}

}
