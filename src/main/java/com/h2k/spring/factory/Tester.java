package com.h2k.spring.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("spring3.xml");

		ClientService cs = context.getBean(ClientService.class);
		
		InsuranceRule ins = context.getBean("insuranceCheck", InsuranceRule.class);
		ins.apply();
		context.close();
	}

}
