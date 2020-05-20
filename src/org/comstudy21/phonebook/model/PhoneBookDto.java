package org.comstudy21.phonebook.model;

public class PhoneBookDto { //담을 그릇.
	int idx;
	String name;
	String phone;
	String email;
	
	public PhoneBookDto() { // idx는 0부터 시작하므로. 
		this(0, "","","");
	}

	public PhoneBookDto(int idx, String name, String phone, String email) {
		this.idx = idx;
		this.name = name;
		this.phone = phone;
		this.email = email;
		
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return idx + "," + name + "," + phone + "," + email;
	}
	
}
