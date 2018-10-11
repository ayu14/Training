package com.ford.bank;

//just like a gateway
public class BankProvider {
	// now if bank changes our code shouldnt make problems
	//hence, not calling instance of ICICI in RunnerMain
	
	Bank provideBank(String bankName) {
		switch(bankName) {
		case "Icici":
		{
			Address add=new Address("Chennai", "3A", 149, 600097);
			return new IciciBank(add);
		}
		
		}
	}
}
