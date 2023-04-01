package com.bank.atm.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bank.atm.bean.BankAccount;
import com.bank.atm.bean.User;
import com.bank.atm.constant.BankParamaEnum;

public class LoginService {

	private User user;
	
	public LoginService() {
	}

	public LoginService(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validateUser(Map userMap) {
		
		int count = getUser().getCount();
		if(getUser().getUserName().equals(userMap.get("userName")) && getUser().getPassword().equals(userMap.get("password")) && count<=3) {
			getUser().setCount(1);
			System.out.println("WelCome to Bank Atm");
			//System.out.println("Thank You, Visit agian");
			
			String name = BankParamaEnum.ACC_HOLDER_NAME.getValue();
			int accNo = Integer.parseInt(BankParamaEnum.ACC_NO.getValue());
			double balance = Double.parseDouble(BankParamaEnum.ACC_HOLDER_BAL.getValue());
			String accType = BankParamaEnum.ACC_HOLDER_ACC_TYPE.getValue();
			BankAccount bankAcc = new BankAccount(name, accNo , balance, accType);
			BankAccountService bankAccountService = new BankAccountService(bankAcc);
			BankAction bAction = new BankAction(getUser(), bankAccountService);
			bAction.bankAccountOperation();
			
		}else {
			getUser().setCount(count++);
		}
		
		if(getUser().getCount()>3) {
			getUser().setCount(1);
			passwordReset(userMap);
			
		}else {
			System.out.println("Your Credentials are incorrect, Please Try Again......"+count);
			userAuthentication(userMap);
		}
	}
	
	public void passwordReset(Map userMap) {
		System.out.println("Please reset password");
		System.out.println("Enter Your phone number to reset password");
		Scanner sc= new Scanner(System.in);
		String phoneNumber= sc.nextLine();  
		
		if(phoneNumber.equals(userMap.get("phoneNumber"))){
			sc= new Scanner(System.in);
			System.out.println("Enter Your New password");
			String newPassword= sc.nextLine();
			
			System.out.println("Reenter Your New password");
			String confirmPassword= sc.nextLine();
			
			if(newPassword.equals(confirmPassword)) {
				userMap.put("password", confirmPassword);
				
				System.out.println("Dear User Please LoginService Again");
				System.out.println("Enter Your User Id");
				sc= new Scanner(System.in);
				String userName= sc.nextLine();  
				getUser().setUserName(userName);
				
				System.out.println("Enter Your Pssword");
				String userPassword= sc.nextLine();
				getUser().setPassword(userPassword);
				
				validateUser(userMap);
			}else
			{
				System.out.println("Your Reentered Password Incorrect, Please contact to admin service for reset password");
			}
		}
		else
		{
			System.out.println("Your Contact Number Is Incorrect, Please contact to admin service for reset password");
		}
	}

	public void userAuthentication(Map<String,String> usrMap) {
		System.out.println("Welcome to Bank Atm");
		System.out.println("Enter Your User Name");
		Scanner sc= new Scanner(System.in);
		String userName= sc.nextLine();  
		
		System.out.println("Enter Your Pssword");
		sc= new Scanner(System.in);
		String password= sc.nextLine();  
		
		Map<String,String> userMap = new HashMap<>();
		if(null==usrMap || usrMap.isEmpty()) {
			userMap.put("userName",BankParamaEnum.ACC_HOLDER_NAME.getValue());
			userMap.put("password", BankParamaEnum.ACC_HOLDER_PASS.getValue());
			userMap.put("phoneNumber", BankParamaEnum.ACC_HOLDER_MOBILE.getValue());
		}else {
			userMap = usrMap;
		}
		
		User user=new User(userName, password, 7718917151L, BankParamaEnum.ACC_HOLDER_EMAIL.getValue());
		LoginService login = new LoginService(user);
		login.validateUser(userMap);
	}

	

}