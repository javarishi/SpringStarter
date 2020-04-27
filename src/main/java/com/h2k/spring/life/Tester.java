package com.h2k.spring.life;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
	//	TesterBean tester = context.getBean(TesterBean.class);
	//	AnotherBean another = (AnotherBean) context.getBean("another");
		Address address = context.getBean(Address.class);
		System.out.println(address.getGooglePin().getLattitude());
		System.out.println(address.getGooglePin().getLongitude());
		context.close();

	}

}
