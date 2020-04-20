package com.amdocs.controller.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

	@Value("${server.port}")
	private int port;
	
	@GetMapping("/order")
	public String showData() {
		
		return "FROM-ORDER : "+port;
	}
	
}
