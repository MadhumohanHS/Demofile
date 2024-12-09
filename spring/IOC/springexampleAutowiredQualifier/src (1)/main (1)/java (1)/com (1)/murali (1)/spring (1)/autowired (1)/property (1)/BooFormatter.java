package com.murali.spring.autowired.property;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BarBean")
public class BooFormatter implements Formatter {

	public String format() {
		return "BooFormatter";
	}

}
