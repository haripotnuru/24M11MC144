package com.internalProgram;

public class Address {
	private String district;
	private String country;
	public void setDistrict(String district) {
		this.district = district;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void displayAddress()
	{
		System.out.println("District:"+district);
		System.out.println("Country:"+country);
	}
}
