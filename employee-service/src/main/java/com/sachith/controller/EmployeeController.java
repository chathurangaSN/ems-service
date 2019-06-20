package com.sachith.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachith.model.Employee;
import com.sachith.service.EmployeeService;

@RestController
@CrossOrigin()
@RequestMapping(value="/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value ="/employee", method = RequestMethod.POST)
	public Employee save(@RequestBody Employee employee){
		return employeeService.save(employee);
	}
	
	@RequestMapping(value ="/employee", method = RequestMethod.GET)
	public List<Employee> fetchAll(){
		return employeeService.fetchAll();
	}
	
	@RequestMapping(value ="/employee/{id}", method = RequestMethod.GET)
	public Optional<Employee> fetchOne(@PathVariable Integer id){
		return employeeService.fetchOne(id);
	}
	
	@RequestMapping(value ="/employee/{id}", method = RequestMethod.PUT)
	public Employee update(@RequestBody Employee employee, @PathVariable Integer id){
		return employeeService.update(employee,id);
	}
	@RequestMapping(value ="/employee/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
		employeeService.delete(id);
	}
	
	
	
	
}
