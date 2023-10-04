package day17.filterstream;//5

import java.io.*;

import util.Closer;

public class DataWriteApplication {
//DataOutputStream 클래스를 이용해서 저장하는 방법
	public static void main(String[] args) {
		//파일 객체 - 파일 작업을 하기 위해 생성
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customer.data");
		//노드 스트림
		FileOutputStream fos = null;
		//필터 스트림 - Data
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			//DataInput/OutputStream은 데이터를 순서대로 추가. 불러올 때도 순서대로 불러야함.
			dos.writeUTF("홍길동");//writeUTF : 한글 입력
			dos.writeChar('M');
			dos.writeUTF("hkd@test.com");
			dos.write(30);
			
			dos.writeUTF("홍길남");
			dos.writeChar('M');
			dos.writeUTF("hkn@test.com");
			dos.write(25);
			
			System.out.println("File saved!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//만들어 놓은 util Closer 호출
			if(dos != null) Closer.close(dos);
			if(fos != null) Closer.close(fos);
		}
		
		//읽어 오기
//		FileInputStream fis = null;
//		DataInputStream dis = null;
//		
//		try {
//			fis = new FileInputStream(file);
//			dis = new DataInputStream(fis);
//			String data = null;
//			String[] member;
//			while((data = dis.readUTF()) != null) {
//				
//				member[] = data;
////				int age = Integer.parseInt(member[3]);
//				System.out.println(data);
//			}
//			
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(dis != null) Closer.close(dis);
//			if(fis != null) Closer.close(fis);
//		}
				
		
		
	}

}
