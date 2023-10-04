package day17.serializable;//9

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import util.Closer;

public class WriteCustomerExample {
//객체화해서 정렬에 집어 넣기
	public static void main(String[] args) {
		Customer cust1 = new Customer("홍길동", 'M', "hkd@test.com", 30);
		Customer cust2 = new Customer("홍길남", 'M', "hkn@test.com", 25);
		
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customer.ser");
		//사용할 객체 선언
		FileOutputStream fos = null;	//바이트로 저장
		ObjectOutputStream oos = null;
		
		try {
			//객체 생성
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cust1);
			oos.writeObject(cust2);
			
			ArrayList<Customer> list = new ArrayList<>();
			list.add(cust1);
			list.add(cust2);
			oos.writeObject(list);		
			//oos에 cust1, cust2, ArrayList를 집어 넣음(모두 오브젝트이다)
			
			System.out.println("Customer 데이터가 저장되었습니다.");
			//엔티티 객체를 직접 파일 시스템에 저장할 수 있다. 컬렉션 객체에 저장되어 있는 경우
			//컬렉션 객체를 직렬화 할 수 있다.
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(oos!=null) Closer.close(oos);
			if(fos!=null) Closer.close(fos);
		}
		
//		//집어 넣은 순서대로 객체 불러오기
//		FileInputStream fis = null;
//		ObjectInputStream ois = null;
//		
//		try {
//			fis = new FileInputStream(file);
//			ois = new ObjectInputStream(fis);
//			
//			System.out.println(ois.readObject().toString());				
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
	}

}
