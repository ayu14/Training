package com.ford.bank;

//we can't make it private cuz then we wont be able to create an instance of it. hence, final
public final class Sbi extends BaseBank {
	
	private static final double WITHDRAW_LIMIT=20000;   //shouldn't change anywhere within a bank(class). so static final
	
	//constructor needed to pass arguements
	public Sbi(Address address){
		super(address);
		this.name="SBI";
	}
	
	
	@Override
	public double withdrawLimit() {
		return WITHDRAW_LIMIT;
	}

	@Override
	public boolean loanRequest(double amount) {
		// TODO Auto-generated method stub
		if(amount<=5*this.balance) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean isPrivate() {
		// TODO Auto-generated method stub
		return true;
	}
}

	