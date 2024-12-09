package com.murali.spring.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation2 e = (Operation2) context.getBean("opBean2");
		
		//Operation e = (Operation) context.getBean("opBean");
		//@AfterReturning
//		  System.out.println("calling m...");  
//	        System.out.println(e.m());  
//	        System.out.println("calling k...");  
//	        System.out.println(e.k());  
//		System.out.println("calling msg...");
//		e.msg();
		
		
	// @AfterThrowing example
		  
		try {
			e.validate(19);
		} catch (Exception e1) {
			System.out.println(e1);
		}
		System.out.println("calling validate again...");

		try {
			e.validate(11);
		} catch (Exception e2) {
			System.out.println(e2);
		}
		 
    }  
	
}