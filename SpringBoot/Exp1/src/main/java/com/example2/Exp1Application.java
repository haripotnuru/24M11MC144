package com.example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exp1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Exp1Application.class, args);
		Student s=(Student)context.getBean("student");
		s.display();
		s.m.display();
	}

}
