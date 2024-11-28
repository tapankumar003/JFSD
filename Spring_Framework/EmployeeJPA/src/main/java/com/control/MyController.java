package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeServiceImpl employeeService;

	public EmployeeServiceImpl getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeServiceImpl employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee/{empId}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable int empId) {
		employeeService.updateEmployee(employee, empId);
	}
	
	@DeleteMapping("/employee/{empId}")
	public void deleteEmpById(@PathVariable int empId) {
		employeeService.deletEmplyeeById(empId);
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return employeeService.getEmployeeById(empId);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
}
