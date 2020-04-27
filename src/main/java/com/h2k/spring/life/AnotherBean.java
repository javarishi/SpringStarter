package com.h2k.spring.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AnotherBean implements InitializingBean, DisposableBean{
	
	
	public AnotherBean() {
		System.out.println("AnotherBean Contructor");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("AnotherBean afterPropertiesSet (init)");
		
	}

	public void destroy() throws Exception {
		System.out.println("AnotherBean destroy");
	}

}
