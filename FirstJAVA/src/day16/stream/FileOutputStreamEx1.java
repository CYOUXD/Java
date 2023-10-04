package day16.stream;//1

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		 // 문자열을 입력 받아서 해당 문자열을 파일로 내보내기
		
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.println("파일 명을 입력하세요 : ");
		String name = scan.next();
		
		//빈 객체 선언
		OutputStream fos = null;
		//IO 패키지에 있는 클래스이기 때문에 꼭 예외 처리를 해줘야 한다.
		//Exception 중 checked에 포함된 것들은 꼭 예외 처리를 해준다.
		
		//체크드라서 꼭 try catch를 써줘야 한다
		try {
			//fileOutputStream(파일을 쓸 경로)
			fos = new FileOutputStream("E:\\Develop\\Java\\FirstJAVA\\file\\"+name+".txt");
			System.out.print("문장 입력 : ");
			scan.nextLine();	//버퍼 정리용 : 저장공간에 남은 것을 처리하는 용도. 위의 scan에서 엔터가 남아서 내려 올 수 있기 때문에 정리해준다.
			String str = scan.nextLine();
			
			byte[] bs = str.getBytes();
			//문자열을 바이트에 전달 할 수 있도록 조정해 줌. 상대방이 읽을 때 깨지지 않도록 바이트 형태로 전달함
			
			fos.write(bs);	//파일을 쓰는 메서드 OutputStream의 주 메서드
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch (Exception ie) {
			ie.printStackTrace();
		}finally {
			try {
				fos.close();
				scan.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
