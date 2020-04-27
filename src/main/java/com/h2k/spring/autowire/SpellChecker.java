package com.h2k.spring.autowire;

public class SpellChecker {

	private String language;
	
	public SpellChecker(String lang) {
		this.setLanguage(lang);
	}
	
	
	
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	private void setLanguage(String language) {
		this.language = language;
	}


	
}
