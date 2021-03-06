package com.amdocs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.consumer.OrderRestConsumer;

@RestController
public class PaymentRestController {

	@Autowired
	private OrderRestConsumer consumer;	// Has-A with OrderRestConsumer
	
	@GetMapping("/payment")
	public String showPaymentData() {
		
		return "FROM PAYMENT -  "+consumer.connectToOrder();
	}
}
