package com.app.SpringbootWithRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringbootWithRestAPI.mapper.EmployeeMapper;
import com.app.SpringbootWithRestAPI.model.Employee;
import com.app.SpringbootWithRestAPI.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping ("/employee")
	
	public Employee saveEmployee(@RequestBody EmployeeMapper employeeMapper) {
		
		Employee emp = 	employeeService.saveEmployee(employeeMapper);
		return emp;
		
	}
	
	@GetMapping("/fetch/{empId}")
	
	public EmployeeMapper fetchEmployeeById(@PathVariable("empId") String empId) {
		
		EmployeeMapper employeeMapper = employeeService.fetchEmployeeById(empId);
		return employeeMapper;
		
		
	}
	
	@DeleteMapping("/delete/{empId}")
	
	public String deleteEmployeeById(@PathVariable("empId") String empId) {
		
		String s = employeeService.deleteEmployeeById(empId);
		return s;
		
		
	}
	
	
	
	
	@GetMapping("/employees")
	
	public List<EmployeeMapper> fetchEmployeeList() {
		
		List<EmployeeMapper> empList = employeeService.getEmployeeList();
		return empList;
		
		
	}
	
	@PutMapping("/update")
	
	public EmployeeMapper updateEmployee(@RequestBody EmployeeMapper employeeMapper) {
		
		EmployeeMapper emp = employeeService.updateEmployee(employeeMapper);
		return emp;
		
		
	}
	
	
}
