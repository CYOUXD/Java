package day17.filterstream;//3

import java.io.*;

public class TextWriterApplication {
	//데이터 파일 만들기 - 단순 텍스트를 사용하는 경우
	public static void main(String[] args) {

		String data1 = "홍길동,M,hkd@test.com,30";	// "," : 필드와 컬럼을 구분하는 구분자!
		String data2 = "홍길남,M,hkn@test.com,25";	// "\n" : 값과 값을 구분하는 레코드 구분자!
		
		File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\"+"customer.txt");
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(f);
			fos.write(data1.getBytes());
			fos.write('\n');  //레코드 구분자, 데이터 구분자
			fos.write(data2.getBytes());
			fos.write('\n');
			System.out.println("File saved!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null)
				try {fos.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		//만든 파일 읽어오기
//		FileReader fr = null;
//		BufferedReader br = null;
//		String user = null;
//	
//		try {
//			fr = new FileReader(f);
//			br = new BufferedReader(fr);
//			String line = br.readLine();
//			while(line != null) {
//				line = br.readLine();
//				user += line;
////				System.out.println(user);
//			}
//			//????????????????? 왜 2번재 줄만 나오지? - 처음 실행한건 안넣어서
//			System.out.println(user);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(br != null)
//				try {br.close();}catch(Exception e) {e.printStackTrace();}
//			if(fr != null)
//				try {fr.close();}catch(Exception e) {e.printStackTrace();}
//		}
		
	}

}
