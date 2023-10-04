package day07.customermanager.oop;

//DATA 처리를 위한 객체 (데이터만을 위한 클래스를 만들어서 사용)

public class Customer {	//Customer는 레퍼런스 타입 : 레퍼런스 타입은 프린트하면 주소가 나온다
//	Customer() {
//		String nameList;
//		String genderList;
//		String emailList;
//		int birthYearList;
//	}
//	
//	String nameList(String uName) {
//		return uName;
//	}
//	String genderList(String uGender) {
//		return uGender;
//	}
//	String emailList(String uMail) {
//		return uMail;
//	}
//	String birthYearList(String uBirth) {
//		return uBirth;
//	}
	
	//선생님 ver
	//멤버변수 	아무나 접근 하지 못하도록 만들기
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	//생성자 - 만들든 말든 상관 없음. 여기선 생략
	
	
	
	//getter, setter	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {	//toString() : 안에 있는 정보를 그대로 출력해 준다.
		// 이름, 성별, 이메일, 출생년도 출력으로 변경
		return "[이름 = "+name+", 성별 = "+gender+", 이메일 = "+email+", 출생년도 = "+birthYear+"]";
	}
}
