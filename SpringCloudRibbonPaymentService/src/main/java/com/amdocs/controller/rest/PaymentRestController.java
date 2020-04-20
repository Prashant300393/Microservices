package com.amdocs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.consumer.OrderRestConsumer;


@RestController
public class PaymentRestController {

	@Autowired
	private OrderRestConsumer consumer;
	
	@GetMapping("/consume")
	public String findMsg() {
		
		return "FROM-CONSUMER - "+consumer.doHttpCall();
	}
}
