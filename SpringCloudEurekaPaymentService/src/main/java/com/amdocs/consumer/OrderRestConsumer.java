package com.amdocs.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderRestConsumer {

	@Autowired
	private DiscoveryClient client;	// makes Has-A relation with OrderRestController [ PRODUCER ]
	
	public String connectToOrder() {
		
		// Rest Template
		RestTemplate rt = new RestTemplate();
		
		// Get the List of Instances using Service ID/ App Name
		List<ServiceInstance> siList = client.getInstances("ORDER-PROVIDER");
		
		// Get the ServiceInstance at index 0. i.e there is only one SERVER
		ServiceInstance si = siList.get(0);
		
		// read URI and add Path to make URL
		String URL = si.getUri()+"/order";
		
		// make HTTP request/call
		String respMsg = rt.getForObject(URL, String.class);
		
		return respMsg;
	}
	
}
