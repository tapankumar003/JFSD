package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao empDao = context.getBean("employeeDao", EmployeeDao.class);
        
//        Employee emp = new Employee(3,"Mohit");
//        int res = empDao.insert(emp);
//        System.out.println(res);
        
//        int empId = 2;
//        Employee employee = empDao.getEmployee(empId);
//        System.out.println(employee);
        
//        List<Employee> employee = empDao.getAllEmployee();
//        for(Employee emp: employee) {
//        	System.out.println(emp);
//        }
        
//        Employee emp = new Employee(3,"Sandeep");
//        empDao.update(emp);
        
          int empId = 2;
          empDao.delete(empId);
    }
}
