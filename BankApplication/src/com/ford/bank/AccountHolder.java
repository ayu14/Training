package com.ford.bank;

public class AccountHolder {

	private String name;
	private Address address;
	private int count=0;
	
	private Bank[] bankArray=new Bank[5];
	
	//any app asks for the bank while payment options
	public void createAccount(Bank bank) {
		//count is instance of acc holder not bank. so, acc holder creates 4 acc.. count won't reset to 0.
		bankArray[count++]=bank;
	}
	
	public void transferWithin(Bank fromBank, Bank toBank, double amount) {
		//using one method in another.
		fromBank.transferFunds(toBank, amount);
	}
	
}
