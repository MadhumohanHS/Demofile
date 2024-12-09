package com.murali.spring.constructor.object;
public class Employee {  
private int id;  
private String name;  
private Address address2;  
public Employee() {}  
  
public Employee(int id, String name) {  
    super();  
    this.id = id;  
    this.name = name;  
}  
public Employee(int id, String name, Address address2) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.address2 = address2;  
}  
  
void show(){  
    System.out.println(id+" "+name);  
    System.out.println(address2);  
}  
  
}  