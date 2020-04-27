package com.h2k.spring.other;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.h2k.spring.inheritance.Manager;

public class Tester {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
		
		Account account = context.getBean("account", Account.class);
		System.out.println(account.getAccountNumber() + " " + account.getCustomerName());
		
	/*	ComplexClass complex = context.getBean(ComplexClass.class);
		complex.getProps();
		complex.getSimpleList();
		complex.getCourses();
		complex.getFaculty(); */
		
		Manager manager = context.getBean(Manager.class);
		System.out.println(manager.getEmpId() + " " + manager.getName() + " " 
					+ manager.getDesignation() + " " + manager.getCompanyName());
		
		context.close();

	}
}
