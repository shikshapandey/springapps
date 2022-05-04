package com.springdemos.springcore.constructorinjection;

public class Address {

	private int hnum;
	private String street;
	private String city;

	

	public Address(int hnum, String street, String city) {
		super();
		this.hnum = hnum;
		this.street = street;
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [housenumber=" + hnum + ", street=" + street + ", city=" + city + "]";
	}

}