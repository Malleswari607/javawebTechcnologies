package com.ibm.Project1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("textEditor")
public class TextEditor {
	private SpellChecker spellchecker;
	public TextEditor() {
		System.out.println("Inside the texteditor no-args Constructor");
		
	}
	public TextEditor(SpellChecker spellchecker) {
		System.out.println("Inside TextEditor Constructor");
		this.spellchecker =spellchecker;
	}
	@Autowired
	@Qualifier("spellchecker2")
	public void setSpellChecker(SpellChecker spellchecker) {
		this.spellchecker= spellchecker;
	}
	
	public void spellcheck() {
		spellchecker.checkSpelling();
	}
}
