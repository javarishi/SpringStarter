package com.h2k.spring.life;

public class GoogleMapPin {

	private String longitude;
	private String lattitude;

	
	public GoogleMapPin(String longitude,String lattitude) {
		this.lattitude = lattitude;
		this.longitude = longitude;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the lattitude
	 */
	public String getLattitude() {
		return lattitude;
	}

	/**
	 * @param lattitude the lattitude to set
	 */
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	
}
