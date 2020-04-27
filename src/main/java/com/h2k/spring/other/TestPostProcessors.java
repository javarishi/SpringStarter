package com.h2k.spring.other;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestPostProcessors implements BeanPostProcessor {

	/**
	 * @returns - Object - Bean 
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization :: Class Initialized :: " + bean.getClass().getName() 
				+ " Bean Name :: " + beanName);
		return bean;
	}
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization :: Class Initialized :: " + bean.getClass().getName() 
				+ " Bean Name :: " + beanName);
		return bean;
	}
}
