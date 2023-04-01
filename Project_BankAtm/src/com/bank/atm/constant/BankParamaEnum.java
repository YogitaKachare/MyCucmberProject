package com.bank.atm.constant;

public enum BankParamaEnum {
	ACC_HOLDER_NAME("Yogita"),ACC_HOLDER_PASS("viyansh@1402"),ACC_NO("12345678"),ACC_HOLDER_MOBILE("7718917191")
	,ACC_HOLDER_ACC_TYPE("Saving"),ACC_HOLDER_BAL("800"), ACC_HOLDER_EMAIL("yogita@gmail.com");
	
	String value;
	
	private BankParamaEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
