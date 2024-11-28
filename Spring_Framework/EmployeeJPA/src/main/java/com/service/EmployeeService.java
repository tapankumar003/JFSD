package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee, int empId);
	
	public void deletEmplyeeById(int empId);
	
	public Employee getEmployeeById(int empId);
	
	public List<Employee> getAllEmployee();
	
}
