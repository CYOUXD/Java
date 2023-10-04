package day13.api.java_lang;//2

import java.util.Arrays;

public class StringMethodExample {

	public static void main(String[] args) {
		
		// String 메서드 사용 예
		String str = "Hello, world! 1234567890";
		System.out.println(str);
		
		//*1. substring : 문자열을 원하는 만큼 자르는 메서드
		System.out.println(str.substring(0));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2));
		System.out.println(str.substring(3));
		System.out.println(str.substring(4));
		
		System.out.println(str.substring(0, 4));	//시작부터 끝 전까지...
		System.out.println(str.substring(7, 13));	//world!
		
		//*2. split : 문자열을 원하는 기준으로 자른 후 배열로 반환
		str = "apple/banana/kiwi/lemon/orange";
		String[] fruit = str.split("/");
		for(int i=0; i<fruit.length; i++) {		//향상된 for문으로 바꿔보기
			System.out.println(fruit[i]);
		}
		System.out.println(Arrays.toString(fruit));
		
		//3. indexOf : 원하는 문자의 인덱스를 반환(못찾는 경우 -1)
		int orange_index = str.indexOf("orange");
		System.out.println("오렌지 위치 : "+orange_index);
		
		System.out.println("첫번째 o의 위치 : "+str.indexOf('o'));
		System.out.println("두번째 o의 위치 : "+str.indexOf('o', str.indexOf('o')+1));	// =앞의 문자를 뒤의 숫자 인덱스부터 찾기
		//indexOf로 'o'를 찾아서 첫번째 'o'의 위치부터 시작하는 'o'를 찾는다. +1을 하는 이유는 첫번째 'o'의 위치와 검색 시작 위치가 같으면 두번째에 가기 전에 해당 인덱스에 'o'가 있으므로 +1을 해준다.
		
		//4. charAt : 원하는 위치의 문자를 가져옴.
		char ch = str.charAt(str.indexOf("orange"));
		String orange = str.substring(
					str.indexOf("orange"),
					str.indexOf("orange")+"orange".length());	//오렌지 시작 위치를 찾고, 오렌지 시작 위치 부터 오렌지의 길이만큼 자르고 나머지 삭제
		System.out.println(ch);
		System.out.println(orange);
		
		//5. contains : 해당 문자가 문자열에 포함되어 있는지 체크. boolean 값으로 반환
		if(str.contains("apple")) {
			System.out.println("사과는 과일이다.");
		}else {
			System.out.println("사과는 과일이 아니다.");
		}
		
		//6. length() - 문자열 길이, equals() - 문자열 비고
		
		//7. replace : 원하는 문자를 치환
		str = "abc@naver.com";
		
		str = str.replace("naver", "microsoft");	//다 바꾸기
		System.out.println(str);
		
		str = "abc@naver.naver.com";
		str = str.replaceFirst("naver", "micosoft");	//첫번째만 바꾸기
		System.out.println(str);
		
		//8. lastIndexOf : 해당 문자열의 뒤에서부터 찾아서 위치를 반환
		str = "abcd   dcba";
		System.out.println("indexOf(d) : "+str.indexOf('d'));	//앞에서부터 찾기
		System.out.println("lastIndexOf(d) : "+str.lastIndexOf('d'));	//뒤에서부터 찾기
				
		//9. toUpperCase, toLowerCase : 대/소문자 변환
		String email = "abc123@NaVer.CoM";
		str = "naver.com";
		
		email = email.toLowerCase();
		System.out.println(email.contains(str));
		
		//10. trim : 문자열 바깥 쪽 공백 제거 
		String id_1 = "     abc   123  ";
		String id_2 = "  abc   123       ";
		
		System.out.println("before1 : "+id_1);
		System.out.println("before2 : "+id_2);
		System.out.println("equals : "+id_1.equals(id_2));
		
		id_1 = id_1.trim();
		id_2 = id_2.trim();
		
		System.out.println("after1 : "+id_1);
		System.out.println("after2 : "+id_2);		
		System.out.println("equals : "+id_1.equals(id_2));
		
		//11. format : 서식문자열을 이용하여 문자열을 만들어서 반환
		str = String.format("%d:%d:%d", 13, 45, 94);
		System.out.println(str);
		
		//12. endsWith : 지정된 문자로 끝나는지 검사 (확장자 등을 체크할 때 사용)
		str = "오늘 할 일.html";
		
		if(str.endsWith(".txt")) {
			System.out.println("확장자가 올바른 텍스트 파일입니다.");
		}else if(str.endsWith(".html")||str.endsWith(".htm")) {
			System.out.println("웹 페이지 입니다.");
		}else {
			System.out.println("텍스트 파일이 아닙니다.");
		};
		
	}

}
