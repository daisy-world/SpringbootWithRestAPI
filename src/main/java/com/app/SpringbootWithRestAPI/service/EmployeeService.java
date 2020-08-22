package com.app.SpringbootWithRestAPI.service;

import java.util.List;

import com.app.SpringbootWithRestAPI.mapper.EmployeeMapper;
import com.app.SpringbootWithRestAPI.model.Employee;

public interface EmployeeService {
	
	
	public Employee saveEmployee(EmployeeMapper employeeMapper);

	public EmployeeMapper fetchEmployeeById(String empId);

	public String deleteEmployeeById(String empId);

	public EmployeeMapper updateEmployee(EmployeeMapper employeeMapper);
	
	public List<EmployeeMapper> getEmployeeList();

}
