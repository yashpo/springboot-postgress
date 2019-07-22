package com.sample.postgress;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sb.pg.entity.Employee;
import com.sb.pg.service.EmployeeService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PostgressApplicationTests {

	@Resource 
	EmployeeService employeeService;
	
	//@Test
	public void contextLoads() {
		 List<Employee> empList = employeeService.findAll();
	}

}

