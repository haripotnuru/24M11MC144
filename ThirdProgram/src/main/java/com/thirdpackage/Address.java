package com.thirdpackage;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city="Srikakulam";
	private String country="India";
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
