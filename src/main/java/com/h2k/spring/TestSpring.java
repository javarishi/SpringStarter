package com.h2k.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	//	Doctor doctor = context.getBean("doctor", Doctor.class);
	//	Doctor doctorTwo = context.getBean("doctor", Doctor.class);
	//	System.out.println(doctor.getLicense() + "  " + doctor.getDoctorName() + " " + doctor.getSpeciality());
		/*
		if (doctor.equals(doctorTwo)) {
			System.out.println("Singleton Class");
		}else {
			System.out.println("Prototype Pattern");
		}*/
	
	//	System.out.println("Printing Doctor Two:");
	//	System.out.println(doctorTwo.getLicense() + "  " + doctorTwo.getDoctorName() + " " + doctorTwo.getSpeciality());
		
		MSWord word = context.getBean(MSWord.class);
		word.printLanguage();
		
		context.close();
	}

}
