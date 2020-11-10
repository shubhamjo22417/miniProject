package com.cybage.model;

public class Users {
	private String uName;
	
	private String uEmail;
	private String uPassword;
	private String uNumber;
	private String uRole;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String uName,  String uRole) {
		super();
		this.uName = uName;
		
		this.uRole = uRole;
	}
	public Users(String uName, String uEmail, String uPassword, String uNumber, String uRole) {
		super();
		this.uName = uName;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
		this.uNumber = uNumber;
		this.uRole = uRole;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuNumber() {
		return uNumber;
	}
	public void setuNumber(String uNumber) {
		this.uNumber = uNumber;
	}
	public String getuRole() {
		return uRole;
	}
	public void setuRole(String uRole) {
		this.uRole = uRole;
	}
	@Override
	public String toString() {
		return "Users [uName=" + uName + ", uEmail=" + uEmail + ", uPassword=" + uPassword + ", uNumber=" + uNumber
				+ ", uRole=" + uRole + "]";
	}
	
	
}
