package com.techgeeknext.dao;

import com.techgeeknext.model.Employee;

import java.util.List;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
}