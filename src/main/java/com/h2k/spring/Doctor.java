package com.h2k.spring;

public class Doctor {
	
	private String license;
	private String doctorName;
	private String speciality;
	
	public Doctor(String license) {
		this.license = license;
		System.out.println("New Doctor Created");
	}


	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}


	
	
}
