package com.bank.atm.service;

import java.util.Scanner;

import com.bank.atm.bean.BankAccount;
import com.bank.atm.bean.User;

public class BankAction {
	private User user;
	private BankAccountService bankAccountService;
	
	public BankAction(User user, BankAccountService bankAccountService) {
		this.user = user;
		this.bankAccountService = bankAccountService;
	}

	public void bankAccountOperation() {
		int num = 2;
		int amountTobBeWithdrawDeposit = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(num!=0) {
			System.out.println("Enter 1. to get account banalnce wih name");
			System.out.println("Enter 2. to withdraw money");
			System.out.println("Enter 3. to deposit money");
			System.out.println("Enter 9. to Exit");
			num = sc.nextInt();
			switch(num) {
				case 1:
					bankAccountService.displayBalanceWithName();
				break;
				case 2:
					System.out.println("Enter Amount To Be Withdraw");
					amountTobBeWithdrawDeposit = sc.nextInt();
					bankAccountService.checkWithdrawAmount(amountTobBeWithdrawDeposit);
				break;
				case 3:
					System.out.println("Enter Amount To Be deposit");
					amountTobBeWithdrawDeposit = sc.nextInt();
					bankAccountService.depositAmount(amountTobBeWithdrawDeposit);
				break;
				case 9:
					System.exit(0);
				break;
			}
			
		}
		
		
	}
	
}
