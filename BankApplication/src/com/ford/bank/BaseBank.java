package com.ford.bank;

public abstract class BaseBank implements Bank {
	
	protected double balance=0;
	protected String name;
	private Address address;   //to be used only in class
	

	public BaseBank(Address a) {
		// TODO Auto-generated constructor stub
		this.address=a;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Address address() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void withdraw(double amount) {
		//some 10% interest cuts for private banks
		if(isPrivate()) {
		this.balance=this.balance-amount*0.90;
		}
		else
		 {
			this.balance=this.balance-amount;
			}			
	}

	
	@Override
	public void deposit(double amount) {
		this.balance+=amount;
		
	}
	

	@Override
	public void transferFunds(Bank bank, double amount) {
		bank.withdraw(amount);
		this.deposit(amount);
	}
	
	//this method is abstract bcz Basebank calling Icici-parent calling child
	//method should be overridden by every child
	//shouldn't be in interface as others need not know
	//protected bcz not the normal public but children should access the method
	protected abstract boolean isPrivate();


}
