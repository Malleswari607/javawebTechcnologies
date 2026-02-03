package com.ibm.Project1.services;

import org.springframework.stereotype.Component;

@Component("UPIServices")
public class UPIServices implements PaymentServices {

	@Override
	public void processPayment(double amount) {
		System.out.println(amount+" paid using the UPI sevices");
		
	}
	

}
