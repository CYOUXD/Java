package day16.stream;//3

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		
		InputStream fis = null;
		try {
			//입력 스트림 객체 생성
			fis = new FileInputStream("E:\\Develop\\Java\\FirstJAVA\\file\\OutputStream.txt");	//자식 개체인 FileInputStream을 넣어준다.
			
			//입력한 데이터를 저장할 변수 선언
			byte[] buffer = new byte[256];	//buffer는 배열이니까 heap에 저장된다. 배열은 참조 데이터 타입이므로 heap에 저장
			int readCount = fis.read(buffer);	//처음 블록을 읽기 - 처음 256바이트를 읽고 버퍼에 저장
			//fis.read(buffer) = 리드는 자신이 읽은 fis의 데이터를 스택에 저장하는데 그것을 힙에 있는 버퍼에 저장한다.
			while (readCount != -1) { //-1이 아니면 데이터가 있다는 의미
				String data = new String(buffer, 0, readCount);	//읽은 버퍼의 내용을 String으로 바꾼다. = buffer의 0번 인덱스부터 readCount까지 읽는다
				System.out.print(data);
				readCount = fis.read(buffer);	//다음 블럭을 읽기(이전까지 읽었던 위치부터 시작하기 때문에 다음 블럭이 됨)
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
