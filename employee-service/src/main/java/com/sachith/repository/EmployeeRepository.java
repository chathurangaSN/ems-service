package com.sachith.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachith.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
