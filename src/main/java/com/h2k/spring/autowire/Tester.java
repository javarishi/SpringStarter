package com.h2k.spring.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("spring4.xml");
		
		MSWord word = context.getBean(MSWord.class);
		word.printLanguage();
		
		context.close();
	}

}
