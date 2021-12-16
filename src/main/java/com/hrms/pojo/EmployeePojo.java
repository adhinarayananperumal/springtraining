package com.hrms.pojo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class EmployeePojo {
	
	
	private String ename;
	private int id;
	private int age;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
