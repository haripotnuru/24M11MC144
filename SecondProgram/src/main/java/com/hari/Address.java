package com.hari;

public class Address {
	private String city;
	private String country;
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void displayAddress()
	{
		System.out.println("  City:"+city);
		System.out.println("  Country: "+country);
	}
}
