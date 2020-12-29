package com.techgeeknext.controller;

import com.techgeeknext.model.Employee;
import com.techgeeknext.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployess() {
		return employeeService.getAllEmployees();
	}
}
