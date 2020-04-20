package com.amdocs.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderRestConsumer {

	@Autowired
	private LoadBalancerClient client;
	
	
	public String doHttpCall() {
		// select ServiceInstance having Less Load Factor
		ServiceInstance si = client.choose("ORD-SER");
		// get URI and add Producer Path
		String URL = si.getUri()+"/order";
		
		// make HTTP call adding URL and ResponseType
		RestTemplate rt = new RestTemplate();
		String msg = rt.getForObject(URL, String.class);
				
		return msg;
	}
	
}
