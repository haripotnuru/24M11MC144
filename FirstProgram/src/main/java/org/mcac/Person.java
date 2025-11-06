package org.mcac;

public class Person {
	private int id;
	private String name;
	private Address address;
	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void displayInfo()
	{
		System.out.println("  Person ID: "+id);
		System.out.println("  Person name: "+name);
		address.displayAddress();
	}
}
