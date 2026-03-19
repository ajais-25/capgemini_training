package com.springboot2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot2.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
}
