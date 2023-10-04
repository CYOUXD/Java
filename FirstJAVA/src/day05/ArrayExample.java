package day05;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// 배열
		/*
		 * 같은 타입의 변수를 한번에 여러개 선언하는 방법
		 * 
		 * 배열의 선언 방법
		 * 1. 타입[] 변수명 = new 타입명[배열의길이];
		 * 2. 타입[] 변수명 = {데이터, 데이터, ...};
		 * 3. 타입[] 변수명 = new 타입명[] {데이터,...}; 
		 *
		 */
		
		// String은 객체 타입이지만 기본변수처럼 사용할 수 있다.
		
		int[] number = new int[10];
		boolean[] win = {true, false, false, false, true};
		String[] welcome = new String[] {
				"오늘 날씨는 흐리고 비 입니다.", "배고프다, 맛있는거 먹고싶다.", "겨울 오면 좋겠다."
		};
		
//		System.out.println(welcome[0]);
//		System.out.println(welcome[1]);
//		System.out.println(welcome[2]);
//		System.out.println("welcome 배열의 길이 : "+welcome.length);
//		
//		for(int i=0; i<welcome.length;i++) {
//			System.out.println(welcome[i]);
//		}
//		
//		// 강화된 For문
		System.out.println("\n강화된 For문을 이용한 반복");
		for(String str : welcome) {		// welcome에 들어있는 배열이 순서대로 하나씩 str에 들어가서 for 아래 식을 실행한다. 
			System.out.println(str);
		}
//		
//		for(int i=0;i<win.length;i++) {
//			if(win[i]) {
//				System.out.println(i+1 + "번째 전적 : 승리");
//			} else { 
//				System.out.println(i+1 + "번째 전적 : 패배");
//			}
//		}
		
		// 배열의 내용 출력(Arrays.toString() 메서드를 사용) 자료형은 알아서 맞춰준다.
//		System.out.println(win); // 주소값만 출력된다.
		System.out.println(Arrays.toString(win));
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(welcome));
		
		// 배열은 자동적으로 기본 값으로 초기화 한다.
		// 정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));
		
		// 배열의 복사
		// 배열의 얕은 복사(swallow copy : 배열주소 복사)와 깊은 복사(deep copy : 배열 주소 값의 값 복사)
		String[] byeMessage2 = new String[] {"good bye", "bye bye", "see you"};
		
		//얕은 복사 : 얕은 복사는 byeMessage 변수에 byeMessage2의 주소 값을 대입
//		byeMessage = byeMessage2;
//		byeMessage2[1] = "Hello bye bye"; // 주소 복사이기 때문에 원본의 실제 값을 변경하면 복제한 값도 똑같이 변경된다. 계속 연결되어 있음
//		System.out.println(Arrays.toString(byeMessage));
		
		// 깊은 복사 : 값 자체를 복사해서 대입
		// System.arraycopy(src, srcPos, dest, destPos, length);  arraycopy()는 깊은 복사 할 때 사용
		// 		src : 원본 배열의 이름
		//		srcPos : 복사를 시작할 원본의 위치
		//		dest : 붙여넣기 할 배열의 이름
		//		destPos : 붙여넣기를 시작할 위치를 결정
		//		length : 복사를 몇개나 할 것인지 결정
		
//		System.arraycopy(byeMessage2, 1, byeMessage, 5, 1);
//		System.out.println("bye1 : "+Arrays.toString(byeMessage));
//		System.out.println("bye1 : "+Arrays.toString(byeMessage2));
//		
//		byeMessage2[0] = "Good bye!!";
//		
//		System.out.println("bye1 : "+Arrays.toString(byeMessage));   // byeMessage2의 값을 수정해도 byeMessage의 값은 변하지 않는다. 연결되지 않음
		
		// 깊은 복사를 통해서
		// byeMessage에 byeMessage2에 있는 배열의 값을 복사하세요
		System.arraycopy(byeMessage2, 0, byeMessage, 0, byeMessage2.length);
		System.out.println(Arrays.toString(byeMessage));
		
		
	}

}
