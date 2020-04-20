package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudRibbonOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonOrderServiceApplication.class, args);
	}

}
