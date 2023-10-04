package day16.stream;//4

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		//파일 쓰기(File Writer)
		File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\w.txt");
		
		//new FileWriter(File f, boolean append)
		//File f : 쓰고자하는 파일 객체의 정보
		//append : true일 때 파일에 추가하면서 쓰는 기능(기본값 : false)
		
		FileWriter out = null; //객체 선언
		
		try {
			//FileWriter 객체 생성
			out = new FileWriter(f, true);	//여기서 append를 true로 설정함. append가 false면 추가가 안됨. false면 계속 추가되는게 아니고 한번만 나온다.
			out.append("테스트를 위한 메시지!!!\n");	//append가 true면 할 때마다 append의 텍스트가 w 파일에 계속 추가됨
			out.append("테스트를 위한 메시지2!!!\n");
			out.write("Write로 추가한 메시지!!!\n");	//write와 append는 비슷하다.
			out.append("테스트를 위한 메시지3!!!\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null) 
				try {out.close();} catch (Exception e) {e.printStackTrace();}
		}
		
	}

}
