package com.springboot2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot2.exception.NotFoundException;
import com.springboot2.models.Employee;
import com.springboot2.repos.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee save(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	public List<Employee> getAll() {
		return employeeRepo.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).orElseThrow(() -> new NotFoundException("Employee not found with id " + id));
	}
	
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}
	
	public Employee updateEmployee(int id, String name) {
		Employee employee = employeeRepo.findById(id).orElseThrow(() -> new NotFoundException("Employee not found with id " + id));
		
		employee.setName(name);
		
		return employee;
	}
}
