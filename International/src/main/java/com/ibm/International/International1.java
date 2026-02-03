package com.ibm.International;

import java.util.Locale;
import java.util.ResourceBundle;

public class International1 {
	public static void main(String[] args) {
		  Locale defaultLocale = Locale.KOREAN; // ko
	        System.out.println("Default Locale:");
	        System.out.println("Language: " + defaultLocale.getLanguage());
	        System.out.println("Country: " + defaultLocale.getCountry());
	        System.out.println("Display Name: " + defaultLocale.getDisplayName());
	        System.out.println("Variant: " + defaultLocale.getVariant());

	        // Load the ResourceBundle dynamically based on the locale
	        ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages_fr", defaultLocale);

	        // Print messages
	        printMessages(resourceBundle);
	    }

	    private static void printMessages(ResourceBundle bundle) {
	        System.out.println("Messages for locale: " + bundle.getLocale());
	        System.out.println("Greeting: " + bundle.getString("greeting"));
	        System.out.println("Question: " + bundle.getString("question"));
	        System.out.println("Farewell: " + bundle.getString("farewell"));
	    }
}