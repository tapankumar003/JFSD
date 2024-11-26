package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Student;
import com.rowmap.RowMapperImpl;

public class StudentDaoImp implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student stud) {
		String qry = "INSERT INTO student (id,name) values(?,?)";
		int res = jdbcTemplate.update(qry,stud.getId(),stud.getName());
		return res;
	}

	@Override
	public int change(Student stud) {
		String qry = "UPDATE student set name=? where id =?";
		int res = jdbcTemplate.update(qry,stud.getName(),stud.getId());
		return res;
	}

	@Override
	public int delete(int stdid) {
		String qry = "DELETE from student where id =?";
		int res = jdbcTemplate.update(qry, stdid);
		return res;
	}

	@Override
	public Student getStudent(int stdid) {
		String qry = "SELECT * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student st = jdbcTemplate.queryForObject(qry, rowMapper, stdid);
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		String qry = "SELECT * from student";
		List<Student> list = jdbcTemplate.query(qry, new RowMapperImpl());
		return list;
	}

}
