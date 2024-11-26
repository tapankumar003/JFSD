package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	public int insert(Student stud);
	public int change(Student stud);
	public int delete(int stdid);
	public Student getStudent(int stdid);
	public List<Student> getAllStudent();
}
