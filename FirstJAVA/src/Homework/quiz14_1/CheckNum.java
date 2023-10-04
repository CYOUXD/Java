package Homework.quiz14_1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 13자리를 입력하세요.");
		String uNum = scan.next();
		String[] chkNum = uNum.split("-");
		
		if(uNum.indexOf("-") > -1) {	// "-"가 있을 때
			if(chkNum[1].charAt(0) == '1') {			//특정 인덱스의 값을 가져올 때는 charAt()
				System.out.println("남성");
			}else if(chkNum[1].charAt(0) == '2') {
				System.out.println("여성");
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}else {	// 숫자만 입력했을 때
			if(uNum.charAt(6) == '1') {
				System.out.println("남성");		
			}else if(uNum.charAt(6) == '2') {
				System.out.println("여성");
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}

}
