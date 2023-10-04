package day17.filterstream;//7

import java.io.*;

import util.Closer;

public class StringInputExample {

	public static void main(String[] args) {
		//한줄씩 입력 받아서 내용을 저장
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\stringline.data");
		
		//입력-필터-
		InputStreamReader isr = null; 	//키보드 입력값 처리
		BufferedReader br = null;		
		FileOutputStream fos = null;	
		OutputStreamWriter osw = null;	
		BufferedWriter bw = null;		
		
		String inputString;
		System.out.println("저장할 내용을 입력 후 Ctrl+z를 눌러주세요.");	//=화면 종료하면서 저장
		try {
			//텍스트 입력
			isr = new InputStreamReader(System.in); //byte -> char로 바꿔줌
			br = new BufferedReader(isr);//입력값을 받아서 버퍼값으로 저장
			
			//파일 저장
			fos = new FileOutputStream(file);//노드 스트림(byte)
			osw = new OutputStreamWriter(fos);//byte -> char로 바꿔줌
			//만든 노드 스트림을 문자로 처리할 수 있는 곳에 넣음
			
			bw = new BufferedWriter(osw);
			
			while((inputString = br.readLine()) != null) {
				bw.write(inputString+"\n"); // \n or bw.newLine()하면 줄바꿈
				
			}
						
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(br != null) Closer.close(br);
			if(bw !=null) Closer.close(bw);
		}
		
	}

}
