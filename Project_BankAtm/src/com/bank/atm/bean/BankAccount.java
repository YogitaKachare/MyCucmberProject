package com.bank.atm.bean;

public class BankAccount {
	private static double minBal = 500;
	private String name;
	private int accNo;
	private double balance;
	private String typeOfAccount;
	
	
	//Created Constructor for initialization.
	public BankAccount(String name, int accNo, double balance, String typeOfAccount) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
		this.typeOfAccount = typeOfAccount;
	}
	
	//Setter and getter method of all instance variable.
	public static double getMinBal() {
		return minBal;
	}
	public static void setMinBal(double minBal) {
		BankAccount.minBal = minBal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	
	
	
	
}
