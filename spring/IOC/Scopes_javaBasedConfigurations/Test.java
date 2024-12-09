package com.murali.spring.autowired.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.setMessage("I'm object B");
	      objB.getMessage();
	      
	      System.out.println(objA.hashCode());
	      System.out.println(objB.hashCode());

	}
}
