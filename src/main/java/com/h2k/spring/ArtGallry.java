package com.h2k.spring;

public class ArtGallry {

	private String clipArtName;
	
	public ArtGallry(String artName) {
		this.clipArtName = artName;
		System.out.println("ArtGallry :: " + clipArtName);
	}
	/**
	 * @return the clipArtName
	 */
	public String getClipArtName() {
		return clipArtName;
	}

	/**
	 * @param clipArtName the clipArtName to set
	 */
	private void setClipArtName(String clipArtName) {
		this.clipArtName = clipArtName;
	}

	
}
