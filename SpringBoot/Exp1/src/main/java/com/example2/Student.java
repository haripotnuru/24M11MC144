package com.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	public Marks m;
	
	public void display() {
		System.out.println("This is student class display method");
	}
}
