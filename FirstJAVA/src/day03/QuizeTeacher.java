package day03;

import java.util.Scanner;

public class QuizeTeacher {

	public static void main(String[] args) {
		//quiz 01
		int num = (int)(Math.random()*100+1);	//0~100미만의 int +1 = 1~ 100까지 표시
		System.out.println("랜덤수는 : "+num);
		// if
		System.out.println("3항 연산의 결과 : "+ (num%2 == 0 ? "짝수":"홀수"));
		
		//quiz 02
		int num2 = 5 - (int)(Math.random()*11);
		System.out.println("랜덤수는 : "+num2);
		int abs = (num2 >= 0)? num2 : -num2;
		System.out.println(num2+"의 절대값은 : "+abs);
		
		//quiz 03
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >");
		int num3 = scan.nextInt();
		System.out.println("입력 받은 수는 : "+(num3%2 == 0?"짝수입니다.":"홀수입니다."));
		
		//quiz 04
		// 키(double), 나이(int) 
		//Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키 : "); //입력 받아야 하니 줄바꿈되지 않는 print로 한다
		double height = scan.nextDouble();
		System.out.println("나이 : ");
		int age = scan.nextInt();
		System.out.println("==================");
		if(height >= 140) {
			if(age >= 8) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			} else {
				System.out.println("놀이기구 탑승 불가");
			}
		} else {
			System.out.println("놀이기구 탑승 불가");
		}
		
		//quiz 05
		//정수 2개 입력 받아서 큰 수를 출력, 같으면 같다고 출력
		System.out.println("정수 두개를 입력하세요");
		System.out.println(">");
		int num10 = scan.nextInt();
		System.out.println(">");
		int num20 = scan.nextInt();
		
		if (num10 == num20) {
			System.out.println("같은 수 입니다.");
		} else if(num10 > num20) {
			System.out.println(num10 +"이 큰 수 입니다.");
		} else {
			System.out.println(num20 +"이 큰 수입니다.");
		}
		
		//quiz 06
		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		int num30 = scan.nextInt();
		if(num30>0) {
			if(num30%2 == 0) {
				System.out.println(num30 + "는 짝수입니다.");
			}else {
				System.out.println(num30+"는 홀수입니다.");
			}
		} else if(num30 == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}else {
			System.out.println(num30 + "는 음수입니다.");
		}
		
		//quiz 07
		System.out.println("구매할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print("> ");
		String fruit = scan.next();  //new Scanner(System.in)을 안써주고 이렇게만 쓰는 이유는 제일 상단에서 이미 선언했기 때문이다.
		
		switch (fruit) {
		case "수박":
			System.out.println("수박은 3만원 입니다.");
			break;
		case "사과":
			System.out.println("사과는 5천원 입니다.");
			break;
		case "멜론":
			System.out.println("메론은 2만원 입니다.");
			break;
		case "포도":
			System.out.println("포도는 1만5천원 입니다.");
			break;
		case "귤":
			System.out.println("귤은 3천원 입니다.");
			break;

		default:
			System.out.println("없는 메뉴입니다.");
			break;
		}
			
		
		
		scan.close();
		
	}

}
