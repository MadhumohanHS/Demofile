package com.murali.spring.autowired.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class FooService {
	
	@Autowired
	@Qualifier("BarBean")
	Formatter formatter;
	
	void invoke() {
		System.out.println("FooService invoked formatter::"+formatter.format());
	}
	
}
