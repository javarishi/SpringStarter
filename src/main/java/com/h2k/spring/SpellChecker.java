package com.h2k.spring;

public class SpellChecker {

	private String language;
	private String timezone;
	private int arg;
	
	public SpellChecker(String lang, String timezone) {
		this.setLanguage(lang);
		this.setTimezone(timezone);
	}
	
	public SpellChecker(String lang, int arg) {
		this.setLanguage(lang);
		System.out.println("Created with Argument : " + arg);
		this.timezone = "PST";
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

	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	private void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	
}
