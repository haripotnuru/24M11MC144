package com.hari;

public class Person {
	private String id;
	private String name;
	private Address address;
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayInfo()
	{
		System.out.println("\n\n  Person name: "+name);
		System.out.println("  Person ID: "+id);
		address.displayAddress();
	}
}
