package model;

import java.io.Serializable;

public class UserBeans implements Serializable {
	private String email;
	private String pass;

	public UserBeans() {}
	public UserBeans(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}
	public String getPass() {
		return pass;
	}
}
