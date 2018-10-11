package com.ford.bank;

//better not use fields in interface, though they're usable
public interface Bank {
	String getName();
	Address address();
	double getBalance();
	void withdraw(double amount);
	void deposit(double amount);
	boolean loanRequest(double amount);
	void transferFunds(Bank bank, double amount);
	double withdrawLimit();
}
