package com.murali.spring.autowired.property;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}