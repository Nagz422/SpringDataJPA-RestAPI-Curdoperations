package com.javatech.springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatech.springboot_backend.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
