package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee, int employeeId);
	public void deleteEmployeeById(int employeeId);
	public Employee getEmployeeById(int employeeId);
	public List<Employee> getAllEmployee();
	

}
