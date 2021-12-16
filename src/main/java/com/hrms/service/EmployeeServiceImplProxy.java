package com.hrms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.EmployeeDao;
import com.hrms.pojo.EmployeePojo;
import com.hrms.proxy.dao.EmployeeDaoImplProxy;

@Service("employeeServicesfs")
public class EmployeeServiceImplProxy implements EmployeeService{
	
	
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeePojo getEmployee(int empId) {
		System.out.println("proxy");
		return employeeDao.getEmployee(empId);
	}

	public EmployeePojo saveEmployee(EmployeePojo employeePojo) {
		return null;
	}

}
