package com.sachith.service;

import java.util.List;

import com.sachith.model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);
	
	List<Employee> fetchAll();

}