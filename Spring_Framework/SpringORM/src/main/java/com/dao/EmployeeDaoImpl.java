package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	@Transactional
	public int insert(Employee employee) {
		Integer i =  (Integer) hibernateTemplate.save(employee);
		return i;
	}


	@Override
	public Employee getEmployee(int employeeId) {
		Employee employee = hibernateTemplate.get(Employee.class, employeeId);
		return employee;
	}


	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee = hibernateTemplate.loadAll(Employee.class);
		return employee;
	}


	@Override
	@Transactional
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
		
	}


	@Override
	@Transactional
	public void delete(int employeeId) {
		Employee employee = hibernateTemplate.get(Employee.class, employeeId);
		hibernateTemplate.delete(employee);
	}

}
