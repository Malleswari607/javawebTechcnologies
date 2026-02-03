package com.ibm.Project1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderServices")
public class OrderServices {
	private final PaymentServices paymentservices;
	@Autowired
	public OrderServices(@Qualifier("UPIServices") PaymentServices paymentServices) {
		this.paymentservices=paymentServices;
	}
	public void makePayment(double amount) {
		paymentservices.processPayment(amount);
	}
}
