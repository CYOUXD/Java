package day17.serializable;//8

import java.io.Serializable;

public class Customer implements Serializable {
	//Customer에 마우스를 가져다 대면 + 아이콘 두개가 있음
	//디폴트는 1의 값을 가진 시리얼 넘버가 나오고 두번째 것은 랜덤한 숫자가 나온다
//	private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 8453619258708624488L;
	
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	
	public Customer() {}
	
	public Customer(String name, char gender, String email, int birthYear) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
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
	public String toString() {
		return "Customer [name = "+name+", gender = "+gender+", email = "+email+", birthYear = "+birthYear+"]";
	}
	
}
