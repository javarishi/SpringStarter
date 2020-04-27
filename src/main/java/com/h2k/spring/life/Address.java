package com.h2k.spring.life;

public class Address {
	
	private GoogleMapPin googlePin;

	public Address() {
		System.out.println("Address is validated with GooglePin" );
	}

	/**
	 * @return the googlePin
	 */
	public GoogleMapPin getGooglePin() {
		return googlePin;
	}

	/**
	 * @param googlePin the googlePin to set
	 */
	public void setGooglePin(GoogleMapPin googlePin) {
		this.googlePin = googlePin;
	}
	
}
