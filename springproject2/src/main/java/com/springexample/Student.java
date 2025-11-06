package com.springexample;

public class Student {
	public Student()
	{
		System.out.println("Student class constructer method");
	}
	private String name="default";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
