package day12.exception;//8

import java.io.FileInputStream;
import java.io.IOException;

public class AutoResourceManagerExample {

	public static void main(String[] args) {
			
		try (FileInputStream in = new FileInputStream("a.txt")){	//() 안에 조건을 쓸 수 있다.		"a.txt" 파일 객체를 만들겠다는 의미
			System.out.println("read data : "+ in.read());    //파일을 읽어서 출력하겠다. 입출력 예외 발생 
			//.read()에 마우스를 가져다 대면 Throw 라고 써져있는데 그러면 반드시 예외 처리를 해야한다.
		} catch (NullPointerException | IOException ex) {	// = 비어있는 예외가 발생하거나 | 입출력 예외가 발생할 때
			//System.out.println(in);   in은 변수 참조 못함(지역변수로 위의 블럭에서 선언했기 때문에)
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}
		
//		or
//		
//		try {
//			FileInputStream in = new FileInputStream("a.txt");	//a.txt파일이 존재하면 오류가 뜨지 않음. ("a.txt")라고 썼기 때문에 가장 상단에 존재해야 오류가 안난다.
//			System.out.println("read data : "+ in.read());   
//
//		} catch (NullPointerException | IOException ex) {
//			System.out.println("예외 처리합니다.");
//			System.out.println(ex.toString());
//		}

		//위와 아래는 같은 결과가 나옴
		
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read data: "+in2.read());
			
		} catch (NullPointerException ex) {		//이 유형의 예외가 발생하면 여기 실행
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
			
		} catch (IOException ex) {				//이 유형의 예외가 발생하면 여기 실행
			System.out.println(in2);
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
			
		}finally {	//자원 정리 할 때 주로 사용한다.
			try { in2.close();} catch(IOException e) {}	//in2.close(); = CheckedException =  파일 입출력이 발생 되므로 예외가 발생 할 수도 있으니 예외 확인을 꼭 해준다.
		}
		

	}

}
