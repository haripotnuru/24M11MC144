package org.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstMain {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("app.xml");
		Employee e1=c.getBean("e",Employee.class);
		Employee e2=c.getBean("d",Employee.class);
		System.out.println(e1+"\n");
	}
}
