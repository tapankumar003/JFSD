package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee, int employeeId) {
		return employeeRepository.findById(employeeId).map( emp ->{emp.setName(employee.getName());
		return employeeRepository.save(emp);
		}).orElse(null);	
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	

}
