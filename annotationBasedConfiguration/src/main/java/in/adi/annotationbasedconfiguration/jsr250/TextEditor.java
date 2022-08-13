package in.adi.annotationbasedconfiguration.jsr250;

import javax.annotation.Resource;

import in.adi.annotationbasedconfiguration.autowired.SpellChecker;

public class TextEditor {

	private SpellChecker spellChecker;

	@Resource(name = "spellChecker")
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside SpellChecker setter JSR-250.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
