package com.amdocs.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

	@GetMapping("/order")
	public String showOrderData() {
		return "FROM ORDER";
	}
}
