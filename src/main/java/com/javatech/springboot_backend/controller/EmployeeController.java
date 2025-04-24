package com.javatech.springboot_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.springboot_backend.model.Employee;
import com.javatech.springboot_backend.service.EmployeeService;
import com.javatech.springboot_backend.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	private EmployeeService empService;

	public EmployeeController(EmployeeService empService) {
		super();
		this.empService = empService;
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployeee(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empService.saveEmployee(emp), HttpStatus.CREATED);
	}
}