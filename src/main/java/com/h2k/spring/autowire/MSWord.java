package com.h2k.spring.autowire;

public class MSWord {
	
	private SpellChecker spellcheck;
	
	
	public MSWord(SpellChecker spellcheck) {
		this.spellcheck = spellcheck;
	}
	
	

	/**
	 * @return the spellcheck
	 */
	public SpellChecker getSpellcheck() {
		return spellcheck;
	}

	/**
	 * @param spellcheck the spellcheck to set
	 */
	private void setSpellcheck(SpellChecker spellcheck) {
		System.out.println("Set with Setter method");
		this.spellcheck = spellcheck;
	}

	public void printLanguage() {
		System.out.println("MSWord is configured for :: " + spellcheck.getLanguage() );
	}
}
