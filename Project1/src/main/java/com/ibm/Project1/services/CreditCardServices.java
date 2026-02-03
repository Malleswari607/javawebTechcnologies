package com.ibm.Project1.services;

import org.springframework.stereotype.Component;

@Component("creditCardServices")
public class CreditCardServices implements PaymentServices {

	@Override
	public void processPayment(double amount) {
		System.out.println(amount+" paid using credit card");
		
	}

}
