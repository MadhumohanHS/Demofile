package com.murali.spring.autowired.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eid;
	private String ename;
	private Department department;
	

	@Autowired
	Employee(Department department) {
		
		this.department = department;
	}
	
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void showEployeeDetails() {
		System.out.println("*** Autowiring by using @Autowire annotation on Property ***");
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		department.setDeptName("Information Technology");
		System.out.println("Department : " + department.getDeptName());
	}
}