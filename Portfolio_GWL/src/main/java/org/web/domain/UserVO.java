package org.web.domain;

import javax.validation.constraints.NotNull;

public class UserVO {
	private String ID;
	@NotNull
	private String email;
	@NotNull
	private String password;
	
	@Override
	public String toString() {
		return "UserVO [ID=" + ID + ", email=" + email + ", password=" + password + "]";
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
