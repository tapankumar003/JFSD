package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.StudentDao;
import com.dao.StudentDaoImp;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDaoImp studao = context.getBean("studentdao",StudentDaoImp.class);
        
        
        Student st = new Student(2,"Rakesh");
        
//        int r = studao.insert(st);
//        int r = studao.change(st);
//        int r = studao.delete(1);
//        Student s1 = studao.getStudent(2);
          List<Student> lst = studao.getAllStudent();
          
          for(Student s: lst) {
        	  System.out.println(s);
          }
        
    }
}