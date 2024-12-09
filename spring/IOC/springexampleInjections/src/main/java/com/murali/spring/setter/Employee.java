package com.murali.spring.setter;
//setter injection for fields

public class Employee {
	private int id;
	private String name;
	private String city;
	
	//private B b;

	public int getId() {
		System.out.println("getter injection is called for ID");
		return id;
	}

	public void setId(int id) {
		System.out.println("setter injection is called for ID");
		this.id = id;
	}

	public String getName() {
		System.out.println("getter injection is called for name");
		return name;
	}

	public void setName(String name) {
		System.out.println("setter injection is called for name");
		this.name = name;
	}

	public String getCity() {
		System.out.println("getter injection is called for City");
		return city;
	}

	public void setCity(String city) {
		System.out.println("setter injection is called for City");
		this.city = city;
	}

	void display() {
		System.out.println(id + " " + name + " " + city);
	}

}
