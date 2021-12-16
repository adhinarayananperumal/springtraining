package com.hrms.proxy.dao;

import org.springframework.stereotype.Repository;

import com.hrms.dao.EmployeeDao;
import com.hrms.pojo.EmployeePojo;

@Repository("employeeDao")
public class EmployeeDaoImplProxy implements EmployeeDao{

	public EmployeePojo getEmployee(int empId) {

		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setId(456);
		employeePojo.setEname("raviproxyvalue");
		employeePojo.setAge(40);

		return employeePojo;
	}

	public EmployeePojo saveEmployee(EmployeePojo employeePojo) {
		employeePojo.setId(123);
		return employeePojo;
	}
	
}
