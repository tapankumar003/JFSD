package EmpAutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmpAutoWire/emp_config.xml");
		Employee empl = (Employee) context.getBean("emp");
		System.out.println(empl);
	}

}
