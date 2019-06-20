package com.sachith.service;

import java.util.List;
import java.util.Optional;

import com.sachith.model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);
	
	List<Employee> fetchAll();

	Optional<Employee> fetchOne(Integer id);

	Employee update(Employee employee, Integer id);

	void delete(Integer id);

}