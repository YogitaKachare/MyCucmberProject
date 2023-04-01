package com.bank.atm.bean;

public class User {
	private static int count=1;
	private String userName;
	private String password;
	private long phoneNumber;
	private String emailId;
	public User(String userName, String password, long phoneNumber, String emailId) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		User.count = count;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", phoneNumber=" + phoneNumber + ", emailId="
				+ emailId + "]";
	}
	
}
