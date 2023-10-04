package day16.stream;//5

import java.io.File;
import java.io.FileReader;

public class FileReadEx1 {

	public static void main(String[] args) {
		
		File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\w.txt");
		
		FileReader in = null;
		
		try {
			in = new FileReader(f);	
			while (true) {
				int data = in.read();	//FileInputStream의 read와는 달리 이 read는 문자 기반 스트림의 메서드 read이기 때문에 2byte씩 읽는다. 그래서 char로 캐스팅 해도 깨지지 않는다.
				System.out.print((char)data);
				if(data == -1) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {in.close();} catch (Exception e2) {e2.printStackTrace();}
		}
	}
}
