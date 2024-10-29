package com.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		System.out.println("This is Employee Microservice!");
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
