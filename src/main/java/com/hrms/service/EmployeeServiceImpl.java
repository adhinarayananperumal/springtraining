package com.hrms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.pojo.EmployeePojo;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeePojo getEmployee(int empId) {
		System.out.println("service actual");
		return employeeDao.getEmployee(empId);
	}

	public EmployeePojo saveEmployee(EmployeePojo employeePojo) {
		return null;
	}

}
