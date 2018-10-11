package com.ford.bank;

public class Address {
	private String city, streetNumber;
	private int houseNumber, pincode;
	
	//constructor is better than setter function
	public Address(String city, String streetNumber,int houseNumber, int pincode) {
		this.houseNumber=houseNumber;
		this.streetNumber=streetNumber;
		this.pincode=pincode;
		this.city = city;		
		
	}
	
	
	public int gethouseNumber() {
		return houseNumber;
	};
	
	public String getstreetNumber() {
		return streetNumber;
	};
	
	public int getpincode() {
		return pincode;
	};
		
	public String getCity() {
		return city;
	}

}
