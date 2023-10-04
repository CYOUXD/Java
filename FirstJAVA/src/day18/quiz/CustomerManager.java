package day18.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import util.Closer;

public class CustomerManager {

	static ArrayList<Customer> cusList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("========== 원하는 기능을 선택하세요 ==========");
			System.out.println("1. 고객 정보 입력");
			System.out.println("2. 고객 정보 검색");
			System.out.println("3. 고객 정보 전체 조회");
			System.out.println("4. 고객 정보 수정");
			System.out.println("5. 고객 정보 삭제");
			
			int menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				insertCustomerData();
				break;
			case 2:
				printCustomerData();
				break;
			case 3:
				printAllCustomerData();
				break;
			case 4:
				updateCustomerData();
				break;
			case 5:
				deleteCustomerData();
				break;
			default :
				break;
			}
		}
		
	}
	
	public static void insertCustomerData() {
		System.out.print("고객의 이름을 입력해 주세요. :");
		String name = scan.nextLine();
		
		//이름 중복 검사
		for(Customer chk : cusList) {
			if(name.equals(chk.getName())) {
				System.out.println("중복된 이름입니다.");
				return;
			}
		}
		
		System.out.print("고객의 성별을 입력해 주세요. :");
		String gender = scan.nextLine();
		System.out.print("고객의 이메일을 입력해 주세요. :");
		String email = scan.nextLine();
		System.out.print("고객의 출생년도를 입력해 주세요. :");
		int birthYear = scan.nextInt();
		
		Customer addList = new Customer(name, gender, email, birthYear);
		cusList.add(addList);
				
		writeCustomerData();
		
	}
	
	public static void selectCustomerData() {
		
	}
	
	public static void printCustomerData() {
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\CostomerManager.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			ArrayList<Customer> list = (ArrayList<Customer>)ois.readObject();
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ois != null) Closer.close(ois);
			if(fis != null) Closer.close(fis);
		}
		
		
		
		
//		System.out.println("검색할 고객의 이름을 입력해 주세요.");
//		String name = scan.nextLine();
		
		
	}
	
	public static void printAllCustomerData() {
	
	}
	
	public static void updateCustomerData() {
	
	}
	
	public static void deleteCustomerData() {
		
	}
	
	public static void writeCustomerData() {
		System.out.println(cusList);
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\CostomerManager.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cusList);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(oos != null) Closer.close(oos);
			if(fos != null) Closer.close(fos);
		}
	}
	
	public static void readCustomerData() {
		
	}
	

}
