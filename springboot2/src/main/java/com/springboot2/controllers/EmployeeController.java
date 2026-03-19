package com.springboot2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot2.models.Employee;
import com.springboot2.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	public Employee save(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	
	@GetMapping("/get")
	public List<Employee> getAllEmployee() {
		return employeeService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		
		return "Employee deleted successfully";	
	}
	
	@PatchMapping("/update")
	public Employee updateEmployeeById(@RequestParam int id,@RequestParam String name) {
		return employeeService.updateEmployee(id, name);
	}
}
