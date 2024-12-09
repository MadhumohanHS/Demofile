package com.murali.spring.autowired.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.murali.spring.autowired.property");

		context.refresh();
		
		FooService service = context.getBean(FooService.class);
		service.invoke();
		
		context.close();
	}
}