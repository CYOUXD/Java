package Homework.quiz14;

import java.util.Scanner;

public class MakeId {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("아이디 등록 : ");
			String uId = scan.next();
			if(uId.length() < 5) {
				System.out.println("아이디는 5글자 이상 입력하세요");
			}else {
				System.out.println("아이디 : "+uId+"가 등록되었습니다");
				break;
			}
		}
		
	}

}
