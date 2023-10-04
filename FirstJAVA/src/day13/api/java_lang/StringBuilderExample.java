package day13.api.java_lang;//3

public class StringBuilderExample {

	public static void main(String[] args) {
		//StringBuilder
		
		String str = "Hello, world! 1234567890";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("StringBuilder에 있는 문자열 : "+str);

		
		//1. append
		sb.append(10);
		System.out.println("append(10)의 결과 : "+sb);
		sb.append(true);
		System.out.println("append(true)의 결과 : "+sb);
		
		//2. insert(idx, 추가할 문자)
		sb.insert(7, "insert 합니다");	//7의 위치에 뒤의 것을 집어 넣겠다.
		System.out.println("insert 결과 : "+sb);
		
		//3. delete(시작인덱스, 끝인덱스)
		sb.delete(sb.indexOf("insert"), sb.indexOf("insert")+"insert합니다.".length());	//insert 부터 시작해서 "insert합니다"길이 만큼 삭제
		System.out.println("delete 결과 : "+sb);
		
		//4. deleteCharAt()
		sb.deleteCharAt(12);
		System.out.println("deleteCharAt(12) 결과 : "+sb);
		
		//5. setCharAt()
		sb.setCharAt(12, '!');	//공백의 자리에 '!'가 들어간다.
		System.out.println("setSharAt(12, '!') 결과 : "+sb);
		
		//6. replace()
		sb.replace(12, 14, "! 1");	//12, 13에 "! 1" 3개 추가
		System.out.println("replace() 결과 : "+sb);
		
		//7. reverse()
		sb.reverse();
		System.out.println("reverse() 결과 : "+sb);	
		
	}

}
