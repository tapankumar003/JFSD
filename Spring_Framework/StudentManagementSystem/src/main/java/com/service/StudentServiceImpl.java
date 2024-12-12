package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

}
