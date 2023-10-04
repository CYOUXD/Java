package day17.serializable;//10

import java.io.*;
import java.util.ArrayList;

import util.Closer;

public class ReadCustomerExample {

	public static void main(String[] args) {
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customer.ser");
				
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			//ois.readObject()는 object 타입이므로 캐스팅해준다
			Customer cus1 = (Customer)ois.readObject();	//반환타입 Customer
			Customer cus2 = (Customer)ois.readObject();				
			@SuppressWarnings("unchecked")	//아래 ArrayList 경고 뜬걸 알고 있다는 의미
			ArrayList<Customer> list = (ArrayList<Customer>)ois.readObject();
			System.out.println(cus1);
			System.out.println(cus2);
			System.out.println(list);
			
		//경로에 파일이 존재하지 않는 경우, 이름을 잘못 입력했을 경우
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {	//ClassNotFoundException :io가 아님 java.lang
			//해당 클래스에 맞춰서 불어오려 했는데 그 클래스를 찾을 수 없을 때
			System.out.println(e.getMessage());			
		} finally {
			if(ois != null) Closer.close(ois);
			if(fis != null) Closer.close(fis);
		}
	}

}
