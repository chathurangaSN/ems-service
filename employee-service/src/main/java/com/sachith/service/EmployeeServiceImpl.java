package com.sachith.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachith.model.Employee;
import com.sachith.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee){
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAll(){
		return employeeRepository.findAll();
	}
	
	@Override
	public Optional<Employee> fetchOne(Integer id){
		return employeeRepository.findById(id);
//		return employeeRepository.
	}
	
	@Override
	public Employee update(Employee employee, Integer id){
		employee.setId(id);
		return employeeRepository.save(employee);
	}
	
	@Override
	public void delete(Integer id){
		employeeRepository.deleteById(id);
	}
}
