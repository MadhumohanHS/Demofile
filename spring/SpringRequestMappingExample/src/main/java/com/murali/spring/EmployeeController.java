package com.murali.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	
	/*
	 * @Autowired EmployeeService service;
	 * 
	 * //@GetMapping("/{id}") public Employee getEmployeeDetails(@PathVariable int
	 * id) { Employee e = service.getEmployeeDetails(id); return e; }
	 */
}
