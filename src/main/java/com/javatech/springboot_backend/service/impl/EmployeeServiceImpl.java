package com.javatech.springboot_backend.service.impl;

import org.springframework.stereotype.Service;

import com.javatech.springboot_backend.model.Employee;
import com.javatech.springboot_backend.repository.EmployeeRepository;
import com.javatech.springboot_backend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository empRepositry;
	
	
	public EmployeeServiceImpl(EmployeeRepository empRepositry) {
		super();
		this.empRepositry = empRepositry;
	}


	@Override
	public Employee saveEmployee(Employee emp) {
		return empRepositry.save(emp) ;
	}

}
