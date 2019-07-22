package com.sb.pg.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.pg.entity.Employee;
import com.sb.pg.service.EmployeeService;

@RestController
@RequestMapping("/pgApp")
public class ApplicationController {

	@Resource 
	EmployeeService employeeService;
	
	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	
	}
	
	
}
