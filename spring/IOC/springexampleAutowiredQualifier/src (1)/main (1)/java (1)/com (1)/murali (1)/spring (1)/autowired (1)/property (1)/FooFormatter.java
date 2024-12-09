package com.murali.spring.autowired.property;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FooBean")
public class FooFormatter implements Formatter {

	public String format() {
		return "FooFormatter";
	}

}
