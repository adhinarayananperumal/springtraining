package com.hrms.service;

import com.hrms.pojo.EmployeePojo;


public interface EmployeeService {

	EmployeePojo getEmployee(int empId);

	EmployeePojo saveEmployee(EmployeePojo employeePojo);

}
