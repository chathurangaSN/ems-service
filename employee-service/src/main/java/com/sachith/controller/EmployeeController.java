package com.sachith.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Employee> save(@RequestBody Employee employee){
		return ResponseEntity
				.status(HttpStatus.OK)
	            .body(employeeService.save(employee));
	}
	
	@RequestMapping(value ="/employee", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> fetchAll(){
		return ResponseEntity
				.ok()
				.header("Author", "Sachith Nanayakkara")
//				.status(HttpStatus.OK)
	            .body(employeeService.fetchAll());
	}
	
	@RequestMapping(value ="/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Employee>> fetchOne(@PathVariable Integer id){
		return ResponseEntity
				.status(HttpStatus.OK)
	            .body(employeeService.fetchOne(id));
	}
	
	@RequestMapping(value ="/employee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Employee> update(@RequestBody Employee employee, @PathVariable Integer id){
		return ResponseEntity
				.status(HttpStatus.OK)
	            .body(employeeService.update(employee,id));
	}
	@RequestMapping(value ="/employee/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
		employeeService.delete(id);
	}
	
	
	
	
}
