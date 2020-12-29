package com.techgeeknext.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgeeknext.dao.EmployeeDao;
import com.techgeeknext.model.Employee;
import com.techgeeknext.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}

}