package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {
	
	public int insert(Employee employee);
	public Employee getEmployee (int employeeId);
	public List<Employee> getAllEmployee();
	public void update(Employee employee);
	public void delete(int employeeId);
}
