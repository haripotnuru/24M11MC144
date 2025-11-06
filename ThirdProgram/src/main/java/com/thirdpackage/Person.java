package com.thirdpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id=25;
	private String name="Hari";
	private String studentID="24M11MC144";
	@Autowired
	private Address address;
	public void setId(int id) {
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
		System.out.println("\n\n  Person ID: "+id);
		System.out.println("  Person name: "+name);
		System.out.println("  Student ID: "+studentID);
		address.displayAddress();
	}
}
