package com.murali.spring.setter;

public class A {

	private int id;//mandatory
	
	private String name;///optional

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A(int id) {
		super();
		this.id = id;
	}//called automatically

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		
		A a = new A(10);
		
		a.setId(100);
		
	}

}
