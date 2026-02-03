package com.ibm.Project1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.ibm.Project1.beans.BeanConfig;
//import com.ibm.Project1.beans.JavaCollection;
import com.ibm.Project1.beans.TextEditor;
import com.ibm.Project1.services.OrderServices;
//import com.ibm.Project1.beans.SpellChecker;
//import com.ibm.Project1.beans.TextEditor;

public class Application
{
	public static void main( String[] args )
	{
//		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
//		SpellChecker spellchecker=(SpellChecker) context.getBean("spellchecker1");
//		System.out.println(spellchecker.getId());
//		TextEditor texteditor=(TextEditor) context.getBean("texteditor");
//		texteditor.spellcheck(); 
//		SpellChecker spellchecker1= (SpellChecker) context.getBean("spellchecker1") ;
//		SpellChecker spellchecker2= (SpellChecker) context.getBean("spellchecker1") ;
//		SpellChecker spellchecker3= (SpellChecker) context.getBean("spellchecker1") ;
		
		
//		JavaCollection jc=(JavaCollection) context.getBean("javacollection");
//		System.out.println("List Address");
//		List<String> listaddress=jc.getAddressList();
//		listaddress.forEach(System.out::println);
//		
//		System.out.println("Set Address");
//		Set<String> setaddress=jc.getAddressSet();
//		setaddress.forEach(System.out::println);
//		
//
//		System.out.println("Map Address");
//		Map<String,String> mapaddress=jc.getAddressMap();
//		mapaddress.forEach((key, value) -> 
//	    System.out.println(key + " = " + value)
//	);
//
//
//		System.out.println("Properties Address");
//		Properties propaddress=jc.getAddressProp();
//		propaddress.forEach((key, value) -> 
//	    System.out.println(key + " = " + value)
//	);
//	
		
//	ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
//	TextEditor textEditor=(TextEditor) context.getBean("textEditor");
//	textEditor.spellcheck();
//	System.out.println("End");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		OrderServices orderServices=(OrderServices) context.getBean("orderServices");
		orderServices.makePayment(1000.50);
		System.out.println("End");
		
		
		
	}
}