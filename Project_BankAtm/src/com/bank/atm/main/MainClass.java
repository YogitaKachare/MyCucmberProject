package com.bank.atm.main;

import com.bank.atm.service.LoginService;

public class MainClass {

	public static void main(String [] args) {
		
		LoginService login = new LoginService();
		login.userAuthentication(null);
		
	}

}
