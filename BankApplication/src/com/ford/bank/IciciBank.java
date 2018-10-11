package com.ford.bank;

//final bank because both these methods should be final and not accessible by any other bank
public final class IciciBank extends BaseBank {
	
	public IciciBank(Address address) {
		super(address);
		this.name="ICICI";

	}

	private static final double WITHDRAW_LIMIT=10000;   //shouldn't change anywhere. so static final
	
	
	
	@Override
	public double withdrawLimit() {         
		return WITHDRAW_LIMIT;
		
	}

	@Override
	public boolean loanRequest(double amount) {
		// process is different for both banks. If same then override in child classes
		if(amount<=10*this.balance) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean isPrivate() {
		// TODO Auto-generated method stub
		return false;
	}

}
