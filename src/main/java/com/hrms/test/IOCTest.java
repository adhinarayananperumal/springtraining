package com.hrms.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hrms.config.ApplicationConfig;
import com.hrms.config.ApplicationConfigProxy;
import com.hrms.pojo.EmployeePojo;
import com.hrms.service.EmployeeService;

@Configuration
@ComponentScan(basePackages = "com.hrms.service,com.hrms.dao")
public class IOCTest {

	public static void main(String[] args) {

		try {
			AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
			appContext.register(IOCTest.class);
			appContext.refresh();

			EmployeeService es = (EmployeeService) appContext.getBean("employeeService");
			EmployeePojo pojo = es.getEmployee(11);
			System.out.println(pojo.getEname());
			System.out.println(pojo.getId());
			System.out.println(pojo.getAge());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
