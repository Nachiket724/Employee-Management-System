package com.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the Employee Service!";
    }
}
