package com.hrms.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.hrms.pojo.EmployeePojo;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao, InitializingBean {

	public EmployeePojo getEmployee(int empId) {

		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setId(230);
		employeePojo.setEname("Priya");
		employeePojo.setAge(34);

		return employeePojo;
	}

	public EmployeePojo saveEmployee(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afset is called...");
	}

}
