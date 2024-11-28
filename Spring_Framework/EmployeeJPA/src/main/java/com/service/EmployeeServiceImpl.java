package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee, int empId) {
		employeeRepository.save(employee);

	}

	@Override
	public void deletEmplyeeById(int empId) {
		employeeRepository.deleteById(empId);

	}

	@Override
	public Employee getEmployeeById(int empId) {
		Employee employee = employeeRepository.findById(empId).get();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emplist = employeeRepository.findAll();
		return emplist;
	}

}
