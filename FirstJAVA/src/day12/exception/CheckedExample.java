package day12.exception;//2

import java.io.IOException;

/*
 * CheckedException의 경우에는 반드시 예외처리해야 함
 * 올바르게 설계되어 있더라도 사용자가 잘못된 값을 입력하면 예외가 발생할 수 있다
 * 	ex) IOException, FileNotfoundException, SQLException
 */

public class CheckedExample {

	public static void main(String[] args) {
		System.out.println("값을 입력받는 프로그램!!!");
		
		byte[] data = new byte[100];	//한번에 100byte씩 읽겠다는 의미
		
		try {	//CheckedException이기 때문에 반드시 try catch 사용해야 한다.
			System.in.read(data);	//Unhandled exception type IOException = 입출력 예외처리 해야 함!
			//System.in.read 키보드 입력값을 읽어들임. 시스템이 기본적으로 지원해 주는 표준 입력
			//System.in.read(data)입출력 관련된 내용. 트라이 캐치와 함께 쓰는 경우가 많지만 무조건 함께 쓰지는 않는다. 스캐너는 알아서 예외처리까지 다해서 그때는 예외 처리를 안해도 됨. 
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("입력한 문자열은 : ");
		//시스템이 기본적으로 지원해 주는 표준 출력
		System.out.println(new String(data).trim());	//trim() 문자열 시작과 끝 부분의 불필요한 부분을 없앰 - "    aa a aaa     " -> "aa a aaa"
	}
}
