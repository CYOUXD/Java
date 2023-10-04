package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Hw0816 {

	public static void main(String[] args) {
//		//1		
//		int a = (int)(Math.random() * 100 + 1);
//		String b = (a%2 == 0) ? "짝수" : "홀수";
//		System.out.println("랜덤 값은 "+a+"이고 "+b+"입니다.");
//			
//		//=================================================================================
//			
//		//2	
//		int ran = 5 - (int)(Math.random() * 11);
//		int dom = (ran > 0) ? ran : -ran;
//		System.out.println("랜덤 값은 "+ ran +"이고 절대 값은 "+dom+"입니다.");
//		
//		//=================================================================================
//				
//		//3
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수를 입력하세요>");
//		String c = (scan.nextInt()%2 == 0)? "짝수" : "홀수";
//		System.out.println("입력받은 수는 : "+c);
//		
//		scan.close();
//		
//		//=================================================================================
//		
//		//4
//		Scanner body = new Scanner(System.in); //입력 받을 곳. 하나만 있어도 됨. 
//		System.out.println("키와 나이를 입력하세요");
//		System.out.print("키 :"); // 옆에 키를 입력해야 하니까 줄바꿈 되지 않는 print로 작성
//		double tall = body.nextInt();
//		System.out.print("나이 :");
//		int age = body.nextInt();
//		
//		if(tall>=140 && age>=8) {
//			System.out.println("놀이기구 탑승 가능");
//		} else {
//			System.out.println("놀이기구 탑승 불가");
//		}
//			
//		body.close();
//		
//		//=================================================================================
//		
//		//5		
//		Scanner int1 = new Scanner(System.in);
//		System.out.println("정수 2개를 입력하세요");
//		int f = int1.nextInt();
//		int g = int1.nextInt();
//		
//		if(f > g) {
//			System.out.println(f+"가 더 큰 수 입니다.");
//		} else if(g > f) {
//			System.out.println(g+"가 더 큰 수 입니다.");
//		} else {
//			System.out.println("같은 수 입니다.");
//		}
//		 int1.close();
//		
//		//=================================================================================
//		
//		//6
//		Scanner int3 = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int h = int3.nextInt();
		
//		if(h > 0) {
//			if(h%2 == 0) {
//				System.out.println(h+"는 짝수 입니다.");
//			} else {
//				System.out.println(h+"는 홀수 입니다.");
//			}
//		} else if(h == 0) {
//			System.out.println(h+"는 0입니다.");
//		} else {
//			System.out.println(h+"는 음수 입니다.");
//		}
//		
//		int3.close();
//		
//		//=================================================================================
//		
//		//7
//		Scanner fruit = new Scanner(System.in);
//		System.out.println("구입할 메뉴는?");
//		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
//		String j = fruit.next();
//		switch (j) {
//		case "수박":
//			System.out.println("수박은 3만원 입니다.");
//			break;
//		case "사과":
//			System.out.println("사과는 5천원 입니다.");
//			break;
//		case "멜론":
//			System.out.println("메론은 2만원 입니다.");
//			break;
//		case "포도":
//			System.out.println("포도는 1만5천원 입니다.");
//			break;
//		case "귤":
//			System.out.println("귤은 3천원 입니다.");
//			break;
//
//		default:
//			System.out.println("없는 메뉴입니다.");
//			break;
//		}
//		
//		fruit.close();		
//		
//		//=================================================================================
//		
//		// 8
//		int i =0;
//		while(i<10) {
//			i++;
//			System.out.println(i+"번 학생의 출석을 체크합니다.");
//		}
//		
//		//=================================================================================
//		
//		// 9-1
//		int j=0;
//		int sum=0;
//		while(j<=100) {
//			j++;
//			if(j%3==0) {
//				sum += j;
//			}
//		}
//		System.out.println("1~100까지 3배수의 합 : "+sum);
//		
//		//=================================================================================
//		
//		// 9-2
//		int k=0;
//		int hap = 0;
//		boolean chk = true;
//		
//		while(k<=100) {
//			k++;
//			
//			chk = (k%3== 0) ? true : false;
//			
//			if(chk) {
//				hap += k;
//			}
//			
//		}
//		
//		//=================================================================================
//		
//		// 10
//		Scanner scan = new Scanner(System.in);
//		System.out.println("수를 입력하세요 >");
//		int inNum = scan.nextInt();
//		int iarr[] = new int[inNum];
//		for(int m=0; m<inNum; m++) {
//			iarr[m] = m+1;
//		}
//		System.out.println(Arrays.toString(iarr));
//		
//		//=================================================================================
//		
//		//11
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("구구단 단수를 입력하세요 > ");
//		int guDan = scan2.nextInt();
//		
//		System.out.println("랜덤 구구단 "+guDan+"단");
//		for(int n=1; n<=9; n++) {
//			System.out.println(guDan+"x"+n+"="+(guDan*n));
//		}
//		
//		//=================================================================================
//		
//		//12
//		Scanner scan3 = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 >");
//		int jung = scan3.nextInt();
//		int soCount = 0;
//		for(int o=1; o<=jung; o++) {
//			if(jung%o==0) {
//				soCount++;
//			}
//		}
//		if(soCount>2 || jung == 1) {
//			System.out.println(jung+"은 소수가 아닙니다.");
//		}else {
//			System.out.println(jung+"은 소수입니다.");
//		}
//		
//		//=================================================================================
//		
//		//13
//		for(int p=1; p<=9; p++) {
//			for(int q=1; q<=9; q++) {
//				System.out.println(p+"x"+q+"="+(p*q));
//				if(q==9) {
//					System.out.println();
//				}
//			}
//		}
//		
//		//=================================================================================
//		
//		//13-1
//		for(int r=0; r<3; r++) {
//			for(int s=0; s<27; s++) {
//				//123123123...
//				int inNum = s-(3*(s/3))+1;
//				//x1, x2, x3,...
//				int multyNum = (s/3)+1;
//				//123123123 + danNum = 456456456...
//				int danNum = inNum+r*3;
//				System.out.print(danNum+"x"+multyNum+"="+(danNum*multyNum)+"\t");
//				if(s%3==2) {
//					System.out.println();
//				}
//			}
//			System.out.println();
//		}
//		
//		//=================================================================================
//		
//		//14
//		Scanner scan4 = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 : ");
//		int sosu = scan4.nextInt();
//		int sosuSum = 0; 
//		for (int t = 1; t <= sosu; t++) {
//			int sosuChk = 0;
//			for(int u=1; u<=t; u++) {
//				if(t%u==0) {
//					sosuChk++;
//				}
//			};
//			if(sosuChk==2) {
//				sosuSum += t;
//			}
//		}
//		System.out.println(sosu+"까지 소수의 합은 : "+sosuSum);
//		
//		//15		
//		int goodCnt = 0;
//		int badCnt = 0;
//		boolean stopQ = true;
//		
//		while(stopQ) {			
//			int num1 = (int)(Math.random()*100)+1;
//			int num2 = (int)(Math.random()*100)+1;
//			System.out.println(num1+" + "+num2+" = ?");
//			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
//			
//			Scanner scan5 = new Scanner(System.in);
//			int userAswr = scan5.nextInt();
//			
//			int ranSum = num1+num2;
//			//정오답 체크
//			int ranChk = 0;			
//			if(userAswr!=0&&ranSum-userAswr==0) {
//				ranChk = 0;
//			}else if(userAswr!=0&&ranSum-userAswr!=0) {
//				ranChk = 1;
//			}else {
//				ranChk = 2;
//			}
//			
//			switch (ranChk) {
//			case 0:
//				System.out.println("정답입니다!!");
//				goodCnt++;	
//				break;
//			case 1:
//				System.out.println("오답입니다!!");
//				badCnt++;
//				break;
//			default:
//				System.out.println("프로그램을 종료합니다.");
//				System.out.println("정답 횟수 : "+goodCnt);
//				System.out.println("오답 횟수 : "+badCnt);	
//				stopQ = false;
//				break;
//			}
//		}
//		
//		//=================================================================================
//		
//		//15-1
//		int goodCnt = 0;
//		int badCnt = 0;
//		boolean stopQ = true;
//		
//		while(stopQ) {			
//			int num1 = (int)(Math.random()*100)+1;
//			int num2 = (int)(Math.random()*100)+1;
//			int ranMark = (int)(Math.random()*2);
//			
//			//+- 랜덤
//			String mark;
//			if(ranMark==0) {
//				mark = "+"; 	//\u002B
//			}else {
//				mark = "-";
//			}
//						
//			System.out.println(num1+mark+num2+" = ?");
//			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
//			
//			//+- 랜덤식
//			int ranSum = 0;
//			switch (mark) {
//			case "+":
//				ranSum = num1+num2;
//				break;
//			default:
//				ranSum = num1-num2;
//				break;
//			}
//			
//			Scanner scan5 = new Scanner(System.in);
//			int userAswr = scan5.nextInt();
//			
//			//정오답 체크
//			int ranChk = 0;			
//			if(userAswr!=0&&ranSum-userAswr==0) {
//				ranChk = 0;
//			}else if(userAswr!=0&&ranSum-userAswr!=0) {
//				ranChk = 1;
//			}else {
//				ranChk = 2;
//			}
//			
//			switch (ranChk) {
//			case 0:
//				System.out.println("정답입니다!!");
//				goodCnt++;	
//				break;
//			case 1:
//				System.out.println("오답입니다!!");
//				badCnt++;
//				break;
//			default:
//				System.out.println("프로그램을 종료합니다.");
//				System.out.println("정답 횟수 : "+goodCnt);
//				System.out.println("오답 횟수 : "+badCnt);	
//				stopQ = false;
//				break;
//			}
//		}
//		
//		//=================================================================================
//		
//		//16
//		Scanner scan6 = new Scanner(System.in);
//		System.out.println("금액을 투입해 주세요");
//		int money = scan6.nextInt();
//		
//		int demi = 400;
//		int mil = 500;
//		int coka = 600;
//		boolean sotopCan = true;
//		
//		int restMoney = money;
//		System.out.println("남은 금액 : "+money);
//
//		
//		while(sotopCan) {
//			System.out.println("[1]뎀이소다: "+demi+"원 [2]밀킥스"+mil+"원 [3]코가골라: "+coka+"원 [4]잔돈받기");
//			System.out.println("음료수 선택 >");		
//			int canBtn = scan6.nextInt();
//
//			switch (canBtn) {
//			case 1:
//				if(restMoney>=demi) {
//					restMoney = money - demi;					
//					System.out.println("뎀이소다를 받았습니다. \n");
//				}else {
//					System.out.println("금액이 부족합니다. 돈을 넣어주세요.");
//				}
//				break;	
//			case 2:
//				if(restMoney>=mil) {
//					restMoney = restMoney - mil;
//					System.out.println("밀킥스를 받았습니다. \n");
//				}else {
//					System.out.println("금액이 부족합니다. 돈을 넣어주세요.");
//				}
//				break;
//			case 3:
//				if(restMoney>=coka) {
//					restMoney = restMoney - coka;
//					System.out.println("코가골라를 받았습니다. \n");
//				}else {
//					System.out.println("금액이 부족합니다. 돈을 넣어주세요.");
//				}
//				break;
//			case 4:
//				System.out.println("남은 금액 "+restMoney+"원을 반환합니다.");
//				sotopCan = false;
//				break;
//	
//			default:
//				break;
//			}			
//			money = restMoney;
//			System.out.println("남은 금액 : "+restMoney);
//		}
//		
//		//=================================================================================
//		
//		//16-1
//		Scanner scan7 = new Scanner(System.in);
//		System.out.println("#먹고 싶은 음식으르 입력하세요!!");
//		System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요.");
//
//		String foodList[] = new String[100];
//		//입력한 음식 이름 저장할 배열 번호
//		int arrNum = 0;
//
//		while(true) {
//			String food = scan7.nextLine();	//띄어쓰기도 넣어야 함
//			if(food.equals("그만")) {
//				System.out.println("입력 종료!!");
////				System.out.println("내가 먹고 싶은 음식들 : "+Arrays.toString(foodList));
//				System.out.print("내가 먹고 싶은 음식들 : [");
//				for(int v=0; v<arrNum; v++) {
//					System.out.print(foodList[v]+" ");
//				}
//				System.out.println("]");
//				break;
//			}else {
//				foodList[arrNum] = food;
//			}
//			arrNum++;			
//			
//		}
//		
//		//=================================================================================
//		
////		//16-2
//		Scanner scan8 = new Scanner(System.in);
//		System.out.println("입력할 카카오친구 > ");
//		
//		int kakaoNum = 0;
//		while(true) {
//			String kakao = scan8.nextLine();
//			if(kakao.equals("그만")) {
//				System.out.println(kakaoNum+"명의 카카오 친구가 입력 되었습니다.");
//				break;
//			}else {
//				System.out.println(kakao+"입력 성공!");				
//			}
//			kakaoNum++;
//		}
//		
//		//=================================================================================
//		
//		//16-3
//		Scanner scan8 = new Scanner(System.in);
//		System.out.println("입력할 카카오친구 > ");
//		
//		int kakaoNum = 0;
//		String kakaoF[] = new String[100];
//		while(true) {
//			boolean kakaoChk = false;
//			String kakao = scan8.nextLine();
//			
//			if(kakao.equals("그만")) {
//				System.out.println(kakaoNum+"명의 카카오 친구가 입력 되었습니다.");
//				break;
//			}else {				
//				for(int w=0; w<kakaoNum; w++) {
//					if(kakao.equals(kakaoF[w])) {
//						kakaoChk = true;
//						System.out.println("중복");
//					}
//				}
//				if(kakaoChk == false) {						
//					kakaoF[kakaoNum] = kakao;
//					System.out.println(kakao+"입력 성공!");				
//					kakaoNum++;
//				}else {
//					System.out.println("이미 입력된 친구입니다.");
//				}
//			}
//		}
//		
//		//=================================================================================
//				
//		//16-4
//		String kakaoF[] = {"무지", "네오", "어피치", "라이언", "단무지"};
//		System.out.println("현재 저장된 친구들 : "+Arrays.toString(kakaoF));
//		
//		Scanner scan9 = new Scanner(System.in);
//		System.out.println("검색할 카카오친구 >");
//		String searchF = scan9.nextLine();
//		
//		int srcChk = 0;
//		
//		for(int x=0; x<kakaoF.length; x++) {
//			if(searchF.equals(kakaoF[x])) {
//				srcChk = x+1;
//			}
//		}
//		if(srcChk>0) {
//			System.out.println(searchF+"친구는 "+srcChk+"번째에 있습니다.");
//		}else {
//			System.out.println(searchF+"친구는 없습니다.");
//			
//		}
//		
//		//=================================================================================
//		
//		//17
//		method1();
//		method2("사과");
//		method3(1, 2, 3.4D);
//		method4(5);
//		method5("뿅뿅", 6);
//		abs(490, 538);
//		method6(8);
//		int arr[] = {1, 2, 3, 4, 5};
//		method7(arr);
//		method8("수박", "망고");
//		
//		//=================================================================================
//		
//		//18
//		String str = java(5);
//		System.out.println(str);
//
//		//=================================================================================
//		
//		//19
//		System.out.println(sum(6));
//		
//		//=================================================================================
//		
//		//20
//		System.out.println("3의 약수의 개수 : "+primeNum(5));
//
//		//=================================================================================
//		
		//21
		System.out.println("7~9의 사이의 수의 합: "+sumNum(7,9));
		System.out.println("9~7의 사이의 수의 합: "+sumNum(9,7));
		System.out.println("5~5의 사이의 수의 합: "+sumNum(5,5));
		
	}

//	//=================================================================================
//	
//	//17
//	static void method1() {
//		System.out.println("안녕");
//	}
//	static String method2(String re1) {
//		String reTxt = "맛있는 "+re1;
//		System.out.println(reTxt);
//		return reTxt;
//	}
//	static double method3(int re2, int re3, double re4) {
//		double reHap = (double)re2+(double)re3+re4;
//		System.out.println(reHap);
//		return reHap;
//	}
//	static String method4(int re5) {
//		String re6;
//		if(re5%2==0) {
//			re6 = "짝수";
//		}else {
//			re6 = "홀수";
//			
//		}
//		System.out.println(re5+"는 "+re6+"입니다.");
//		return re6;
//	}
//	static void method5(String re7, int re8) {
//		for(int y=0; y<re8; y++) {
//			System.out.print(re7+" ");
//		}
//		System.out.println();
//	}
//	static int abs(int re9, int re10) {
//		int re11 = re9>re10? re9:re10;
//		System.out.println(re9+"와 "+re10+"중에 "+re11+"이 더 크다.");
//		return re11;
//	}
//	static int method6(int re12) {
//		int re13 = 0;
//		for(int z=0; z<=re12; z++) {
//			re13 +=z;
//		}
//		System.out.println("0~에서 "+re12+"까지의 합은 = "+re13);
//		return re13;
//	}
//	static int method7(int re14[]) {
//		int re15 = re14.length;
//		System.out.println("배열의 길이는 "+re15);
//		return re15;
//	}
//	static String[] method8(String re16, String re17) {
//		String re18[] = {re16, re17};
//		System.out.println(Arrays.toString(re18));
//		return re18;
//	}
//	
//	//=================================================================================
//	
//	//18
//	static String java(int re19) {
//		String str="";
//		for(int aa=0; aa<re19; aa++) {
//			if(aa%2==0) {
//				str += "자";
//			}else {
//				str += "바";
//			}
//		}
//		return str;
//	}
//	
//	//=================================================================================
//	
//	//19
//	static int sum(int re20) {
//		int yak = 0;
//		for(int ab=1; ab<=re20; ab++) {
//			if(re20%ab==0) {
//				yak +=ab;
//			}
//		}
//		return yak;
//	}
//	
//	//=================================================================================
//	
//	//20
//	static int primeNum(int re21) {
//		int sosuHap = 0;
//		for(int ac=1; ac<=21; ac++) {
//			if(re21%ac == 0) {
//				sosuHap++;
//			}
//		}
//		return sosuHap;
//	}
//	
//	//=================================================================================
//	
	//21
	static int sumNum(int re22, int re23) {
		int sum = 0;
		int preNum = 0;
		int nextNum = 0;
		
		if(re22<re23) {
			preNum = re22;
			nextNum = re23;
		}else {
			preNum = re23;
			nextNum = re22;
		}
		for(int ad=preNum; ad<=nextNum; ad++) {
			sum+=ad;
		}
		return sum;
	}
	
}
