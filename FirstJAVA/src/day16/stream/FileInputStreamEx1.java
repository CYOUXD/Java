package day16.stream;//2

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {

		InputStream fis = null;
		
		try {
			//FileInputStream(읽을 파일의 경로)
			fis = new FileInputStream("E:\\Develop\\Java\\FirstJAVA\\file\\OutputStream.txt");
			byte[] buffer = new byte[1000];//1000바이트짜리 저장공간을 만듦  데이터를 읽어들일때 사용하는 저장공간
			//한번에 1000바이트씩 덩어리로 읽는다. 읽어들인 다음에 버퍼에 저장한다
			String content = "";
			while(true) {
				//반환타입 : 읽어들인 데이터의 크기
//				int data = fis.read();	//1바이트씩 데이터를 읽어들인다. 한글(2byte)은 다 깨져서 오고, 영문자(1byte)는 제대로 온다. 리턴값 : 읽은 데이터의 크기
				//read()는 1바이트씩 데이터를 읽는다. 1바이트씩 저장해서 캐스팅해서 읽는건 괜찮다. 1바이트씩 읽는게 아니고 1바이트씩 저장된 데이터를 연결해서 읽을테니까
//				System.out.print((char)data); 	//char 형태로 데이터를 처리	//read()는 1바이트씩 읽기  char는 2바이트라서 변경이 안되기 때문에 깨진다
				//1바이트씩 가져온걸 바로바로 읽기 때문에 한글은 2바이트라서 1바이트만 읽으면 반만 읽게되서 깨지게 된다.
				
				int data = fis.read(buffer);	//read()안에 들어간 배열의 사이즈만큼 읽는다.
				System.out.println(data);	//읽어들인 데이터의 바이트 출력
				
				if (data != -1) content = new String(buffer, 0, data);
				else break;
//				if(data == -1) 	//data가 -1인 경우는 더이상 데이터가 없는 경우
//					break;
				System.out.println(content);
			}
		} catch (FileNotFoundException fe) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		} catch (IOException e) { 
			System.out.println();
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}

}
