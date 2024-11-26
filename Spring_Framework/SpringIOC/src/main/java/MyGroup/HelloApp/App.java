package MyGroup.HelloApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("student_config.xml");
        Student stud = (Student) context.getBean("stud");
        
        System.out.println(stud);
    }
}
