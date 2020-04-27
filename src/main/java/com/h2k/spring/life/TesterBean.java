package com.h2k.spring.life;

public class TesterBean {

	public void startUp() {
		System.out.println("TesterBean startup or init method");
	}
	
	public TesterBean() {
		System.out.println("TesterBean Constructor");
	}

	public void shutdown() {
		System.out.println("TesterBean shutdown or destroy");
	}
}
