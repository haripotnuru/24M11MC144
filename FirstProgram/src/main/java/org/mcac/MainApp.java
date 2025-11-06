package org.mcac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Person person=(Person) context.getBean("personBean");
		person.displayInfo();
	}
}
