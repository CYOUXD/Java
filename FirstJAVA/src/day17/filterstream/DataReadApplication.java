package day17.filterstream;//6

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import util.Closer;

public class DataReadApplication {

	public static void main(String[] args) {
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customer.data");
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String name = null;
			name=dis.readUTF();
			//하나씩 형식에 맞춰 불러온다
			while((name = dis.readUTF()) != null) {
				System.out.println(name);  //이름
				System.out.println(dis.readChar()); //성별
				System.out.println(dis.readUTF()); //이메일
				System.out.println(dis.read()); //나이
				name=dis.readUTF();
			}			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(dis != null) Closer.close(dis);
			if(fis != null) Closer.close(fis);
		}

	}

}
