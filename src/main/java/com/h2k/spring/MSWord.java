package com.h2k.spring;

public class MSWord {
	
	private SpellChecker spellcheck;
	
	
	public MSWord() {
		// TODO Auto-generated constructor stub
	}
	
	public MSWord(ArtGallry clipArt) {
		System.out.println(clipArt.getClipArtName());
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
	public void setSpellcheck(SpellChecker spellcheck) {
		this.spellcheck = spellcheck;
	}

	public void printLanguage() {
		System.out.println("MSWord is configured for :: " + spellcheck.getLanguage() 
						+ " " + " Time Zone is :: " + spellcheck.getTimezone());
	}
}
