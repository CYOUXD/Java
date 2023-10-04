package day17.filterstream;//4

import java.io.*;

public class TextReadApplication {
	//만든 파일 형 변환해서 읽어오기
	public static void main(String[] args) {
		
		File f = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customer.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String data = null;
			while((data = br.readLine()) != null) {
				String[] member = data.split(",");
				//읽어 올 때 형변환 해줘야 한다.
				int age = Integer.parseInt(member[3]);	//나이는 int로 변환
				if(age >= 20) {//한줄씩 20살이 이상이면 그 줄 출력
					System.out.println(data);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null)
				try {br.close();}catch(Exception e) {e.printStackTrace();}
			if(fr != null)
				try {fr.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
