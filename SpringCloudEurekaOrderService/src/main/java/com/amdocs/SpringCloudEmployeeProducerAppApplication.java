package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient	//  means it is client to Eureka Server
public class SpringCloudEmployeeProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmployeeProducerAppApplication.class, args);
	}

}
