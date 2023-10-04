package day17.quiz2.teacher;	//선생님 github에서 가져오기

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import util.Closer;

import java.util.Set;

public class PhoneBook {
	
	// HashMap을 이용해 전화번호부를 구현해 보세요
	
	// 1. "그룹/전화번호/이름'을 저장해야 합니다.
	// 2. 그룹을 키값으로 넣으면 그 그룹에 해당하는 HashMap이 선택됩니다. 
	// 3. 그룹의 HashMap에 전화번호를 키값으로 넣으면 이름이 나온다
	HashMap<String, HashMap<String, String>> phoneBook;
	
	//5-2. 
	File saveFile = null;
	String savePath = "savefile/phonebook.sav";
	
	public PhoneBook() {//이 클래스의 생성자로 생성하는 순간 hashmap이 만들어짐
		phoneBook = new HashMap<>();
		
		//5-3. 저장 된 파일 객체 생성
		saveFile = new File(savePath);	
		//5-4. 저장 경로 디렉터리 생성
		if(!saveFile.exists()) {
			File dir = new File(saveFile.getParent());
			dir.mkdirs();
		}
		//7-2 객체 실행시 파일의 정보를 읽어와서 정보를 완성!!
		load();
	}
	
	
	// ####메서드####
	// 1. phoneBook에 새로운 그룹을 추가하는 메서드
	public void addGroup(String groupNames) {
		if(!phoneBook.containsKey(groupNames)) {
			phoneBook.put(groupNames, new HashMap<String, String>());
		}
	}
	// 2. phoneBook의 모든 목록을 한번에 출력해주는 메서드
	public void printAll() {
		Set<String> groupNames = phoneBook.keySet();
		for(String groupName : groupNames) {
			System.out.println("* * * * *"+groupName+"* * * * *");
			
			//전화번호 이름
			HashMap<String, String> numberAndNames = phoneBook.get(groupName);
			if(numberAndNames.size() == 0) {
				System.out.println("비어 있음");
			}else {
				for(String number : numberAndNames.keySet()) {
					System.out.printf("%s : %s\n", numberAndNames.get(number), number);
					//그냥 이름을 먼저 써 준 것
				}
			}
		}
	}
	// 3-1. 이미 존재하는 그룹에 전화번호를 추가하는 메서드(그룹이 없으면 추가 못함)
	//    (> 모든 전화번호를 HashSet형태로 반환 및 중복 체크 기능도 있어야 함)
	public AddPhMessage addPhoneNo(String groupName, String number, String name) { //반환타입의 유무는 메서드 구조에 따라 선택
		if(!phoneBook.containsKey(groupName)) {
			return new AddPhMessage("없는 그룹입니다.", AddPhMessage.NOT_EXISTING_GROUP);
			// return new addPhMessage("없는 그룹입니다.", 0); 위와 같음
		}else {
			HashMap<String, String> numberAndNames = phoneBook.get(groupName);
			
			//3-4
			if(checkDupleNumber(number)) {
				return new AddPhMessage("이미 등록된 번호입니다. 수정하시겠습니까?", AddPhMessage.EXISTING_NUMBER);
				
			}
			
			numberAndNames.put(number, name);
			return new AddPhMessage("정상적으로 등록되었습니다.", AddPhMessage.ADD_SUCCESS);
		}
		
	}	
	
	//3-3 전화번호 불러오기 
	//모든 전화번호를 HashSet형태로 반환하는 메서드
	private Set<String> getAllNumber(){
		HashSet<String> allNumbers = new HashSet<>();
		
		for(HashMap<String, String> group : phoneBook.values()) {//전체 그룹에서 번호 확인
			allNumbers.addAll(group.keySet());
		}
		return allNumbers;
	}
	
	//3-4 중복체크
	//전화번호 중복체크 메서드
	private boolean checkDupleNumber(String number) {
		return getAllNumber().contains(number);
	}	
	
	// 4. 전화번호의 일부를 입력하면 입력한 부분과 일치하는 모든 사람의 목록을 출력하는 메서드
	public void searchByNumber(String number) {
		System.out.println("* * * * *"+number+"* * * * *");
		for(HashMap<String, String> group : phoneBook.values()) {
			for(String key : group.keySet()) {
				if(key.contains(number)) {
					System.out.printf("%s : %s\n", group.get(key), key);
				}
			}
		}
	}
	
	// 5. 이름을 입력하면 해당하는 사람의 전화번호를 모두 출력하는 메서드(동명이인이 있는 경우 여러개 출력)
	public void searchByName(String inputName) {
		System.out.println("* * * * *"+inputName+"* * * * *");
		for(HashMap<String, String> group : phoneBook.values()) {
			for(Entry<String, String> entry : group.entrySet()) {
				//키 값인 전화번호가 아니라 밸류 값인 이름을 가져와야하기 때문에 entrySet을 사용한다.
				String number = entry.getKey();
				String name = entry.getValue();
				if(name.contains(inputName)) {
					System.out.printf("%s : %s\n", name, number);
				}
			}
		}
	}
	// *** 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할 때도 유지되도록 만들어 주세요.!!!
	//6. 저장
	public void save() {
		FileWriter out = null;
		
		try {
			out = new FileWriter(saveFile);
			//전화번호부의 내용을 나름대로의 문자열로 구성하고 구성하여 파일에 저장!!
			//직렬화 사용할 수도 있음
			for(String groupName : phoneBook.keySet()) {
				out.write(groupName + ":");
				for(Entry<String, String> e : phoneBook.get(groupName).entrySet()) {
					out.write(String.format("%s=%s ", e.getKey(), e.getValue()));
				}
				out.write('\n');
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null) Closer.close(out);;
		}
	}
	//7. 로드
	//저장된 파일을 불러오기
	public void load() {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader(saveFile));
			String line = null;
			while((line=in.readLine()) != null) {
				String[] groupAndEntry = line.split(":");
				//함수를 심플하게 만들면 재사용성이 올라간다.
				if(groupAndEntry.length == 1) {	
					addGroup(groupAndEntry[0]);	//추가할게 하나라면 첫번째 것을 추가
				}else {
					addGroup(groupAndEntry[0]); //추가할게 두개 이상이라면 구분 값으로 나눠서 저장하고 전화번호와 이름을 "="로 나눠서 저장한다.
					String [] entry = groupAndEntry[1].split(" ");//각 전화번호, 이름 구분값 " "
					
					for(String e : entry ) { //저장된 내용을 가져와서 생성해줘야 하기 때문에 addPhoneNo사용
						String[] phoneAndName = e.split("=");
						addPhoneNo(groupAndEntry[0], phoneAndName[0], phoneAndName[1]);
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) Closer.close(in);
		}
	}
}

//3-2. 상태 정보 메세지를 넘기는 클래스 - 기능이 끝나고 난 후 결과에 대한 메세지 전달
class AddPhMessage{
	String msg;
	int type;
	
	final static int NOT_EXISTING_GROUP = 0;	//그룹이 없는 경우
	final static int EXISTING_NUMBER = 1;	//그룹이 있는 경우
	final static int ADD_SUCCESS = 2;	//작업 성공한 경우
	
	public AddPhMessage(String msg, int type) {
		this.msg = msg;
		this.type = type;
	}
	@Override
	public String toString() {
		return msg;
	}

}
