package com.murali.spring.autowired.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ConfigurableApplicationContext context = SpringApplication.run(Test.class, args);
	    Employee emp = context.getBean(Employee.class);
	    emp.setEid(1001);
	    emp.setEname("Spring Framework Autowired By Property");
	    emp.showEployeeDetails();
	}
}