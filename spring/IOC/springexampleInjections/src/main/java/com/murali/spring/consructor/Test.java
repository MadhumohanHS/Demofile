package com.murali.spring.consructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {  
    public static void main(String[] args) {  
          
        //Resource r=new ClassPathResource("applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BeanFactory factory=new XmlBeanFactory(r);  
          
        //Employee s=(Employee)factory.getBean("e");  
        Employee s=(Employee)context.getBean("e");  
        s.show();  
          
    }  
}  
