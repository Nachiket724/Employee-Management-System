package com.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

	public static void main(String[] args) {
		System.out.println("This is Eureka Server!!");
		System.out.println("We are working");
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

}
