package com.control;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public static String uploadDir= System.getProperty("user.dir")+"/src/main/resources/static/empImages";

	@GetMapping("/employee")
	public String getAllEmp(Model model) {
		model.addAttribute("employees", employeeService.getAllEmp());
		return "employee";
	}
	
	@GetMapping("/employee/add")
	public String addGetEmp(Model model) {
		model.addAttribute("employee", new Employee());
		return "addEmployee";
	}
	
	@PostMapping("/employee/add")
	public String addPostEmp(@ModelAttribute("employee") Employee employee, @RequestParam("image") MultipartFile file) throws IOException{
		
		String imageUUID;
		
		if(!file.isEmpty()) {
			imageUUID = file.getOriginalFilename();
			Path fileNameAndPath = Paths.get(uploadDir,imageUUID);
			Files.write(fileNameAndPath, file.getBytes());
		}
		else {
			imageUUID = "abc";
		}
		employee.setImagePath(imageUUID);
		employeeService.saveEmp(employee);
		
		return "redirect:/employee";
	}

}
