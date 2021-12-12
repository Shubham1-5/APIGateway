package com.shubham.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * 1. I should get registered to the eureka server
 *
 * 2. Define the routes so that, it can start acting as the API Gateways
 * a. I need to define the routes (Decide the logic, to make the call to the different services)
 *
 *		- Define the configuration class
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
