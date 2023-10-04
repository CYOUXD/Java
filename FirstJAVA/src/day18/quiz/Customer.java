package day18.quiz;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = -2113814997386470537L;

	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	public Customer() {}

	public Customer(String name, String gender, String email, int birthYear) {
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

	public int getBitrhYear() {
		return birthYear;
	}

	public void setBitrhYear(int bitrhYear) {
		this.birthYear = bitrhYear;
	}
	
	@Override
	public String toString() {
		return "[ 이름 : "+name+", 성별 : "+gender+", 이메일 : "+email+", 출생년도 : "+birthYear+" ]";
	}
	
}
