package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/student/add")
	public String getAddStudent(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("name", "Tapan");
		return "addStudent";
	}
	
	@PostMapping("/student/add")
	public String postAddStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/student";
	}
	
	@GetMapping("/student")
	public String getAllStudent(Model model) {
		model.addAttribute("student", studentService.getAllStudent());
		model.addAttribute("name", "Students Record");
//		List<Student> allStudent = studentService.getAllStudent();
//		return allStudent;
		return "studentData";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	

}
