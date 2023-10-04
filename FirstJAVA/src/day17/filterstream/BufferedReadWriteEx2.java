package day17.filterstream;//2

import java.io.*;

public class BufferedReadWriteEx2 {

	public static void main(String[] args) {
//		FileReader write = null;
//		FileWriter read = null;
//		BufferedWriter bWrite = null;
//		BufferedReader bRead = null;
		
		//작성된 텍스트를 저장 읽어오기
		String htmlCode = "<html><head><style>\n";
		htmlCode += "div { \n"
					+"		width: 100px; \n"
					+"		height: 100px; \n"
					+"		color: white; \n"
					+"		background: red; \n"
					+"		padding: 50px; \n"
					+"		font-size : 30px; \n"
					+" }\n";
		htmlCode += "</style></head><body>";
		htmlCode += "<div>Hello HTML!</div>";
		htmlCode += "</body></html>";
		
		String path = "E:\\Develop\\Java\\FirstJAVA\\file\\index.html";
		
		write(path, htmlCode); //write 메서드 만들어서 사용
		
		System.out.println(read(path));
		
		
	}
	
	public static void write(String path, String code) {
		File f = new File(path);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		/*
		 * bufferedWriter가 flush를 호출하는 경우!!
		 * 
		 * 1. 설정한 버퍼가 가득 찼을 때
		 * 2. flush()를 호출 했을 때
		 * 3. close()할 때
		 */
		
		try {
			fw = new FileWriter(f);		//노드 스트림
			bw = new BufferedWriter(fw);	//필터 스트림 - 매개변수로 노드 스트림을 가져옴
			
			bw.write(code);			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null)
				try {bw.close();}catch(Exception e) {e.printStackTrace();}
			if(fw != null)
				try {fw.close();}catch(Exception e) {e.printStackTrace();}
		}
	}
	
	public static String read(String path) {
		File f = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		
		String code = null;	//받아서 읽어 줄 String
		
		try {
			code = new String();
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				code += line;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null)
				try {br.close();}catch(Exception e) {e.printStackTrace();}
			if(fr != null)
				try {fr.close();}catch(Exception e) {e.printStackTrace();}
		}
//		System.out.println(code);	//출력
		return code;
	}
}
