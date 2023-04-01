package com.bank.atm.service;

import com.bank.atm.bean.BankAccount;

public class BankAccountService {
	
	private BankAccount bankAcc;

	public BankAccountService(BankAccount bankAcc) {
		super();
		this.bankAcc = bankAcc;
	}
	public BankAccount getBankAcc() {
		return bankAcc;
	}
	public void setBankAcc(BankAccount bankAcc) {
		this.bankAcc = bankAcc;
	}
		//method to deposit amount.
		public void depositAmount(double depositeAmount) {
			this.getBankAcc().setBalance(this.getBankAcc().getBalance()+depositeAmount);
			System.out.println("Amount Deposite Successfully");
			System.out.println("Balance after Deposite :: "+this.getBankAcc().getBalance());
		}
		
		//method o withdraw amount
		public void checkWithdrawAmount(double amoutToBeWithDraw) {
			if(this.getBankAcc().getBalance()>=this.getBankAcc().getMinBal()) {
				this.getBankAcc().setBalance(this.getBankAcc().getBalance()-amoutToBeWithDraw);
				System.out.println("Amount Withdraw Successfully");
				
			}else if(this.getBankAcc().getBalance()<this.getBankAcc().getMinBal()) {
				System.out.println("Balance below :: "+this.getBankAcc().getMinBal());
				System.out.println("Amount uanble to Withdraw as no minimum balance maintain");
			}
			System.out.println("Balance after Withdraw"+this.getBankAcc().getBalance());
		}
		
		public void displayBalanceWithName() {
			System.out.println("Name of account holder ::"+this.getBankAcc().getName()+"Balance in account :: "+this.getBankAcc().getBalance());
		}
	
}
