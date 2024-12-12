package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/employee")
	public Employee addEmp(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee/{employeeId}")
	public Employee updateEmp(@RequestBody Employee employee,@PathVariable int employeeId) {
		return employeeService.updateEmployee(employee, employeeId);
		
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmp(){
		return employeeService.getAllEmployee();
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public String delEmp(@PathVariable int employeeId) {
		employeeService.deleteEmployeeById(employeeId);
		return "Successfully deleted id="+employeeId;
	}
	@GetMapping("/employee/{employeeId}")
	public Employee getEmpById(@PathVariable int employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}

}
