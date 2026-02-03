package com.ibm.Project1.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean("textEditor")
	public TextEditor getTextEditor(SpellChecker spellchecker) {
		return new TextEditor(spellchecker); 
	}
	@Bean
	public SpellChecker getspellChecker() {
		return new SpellChecker();
	}

}
