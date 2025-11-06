package com.internalProgram;

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
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		address.displayAddress();
	}
}
