package com.hrms.aop.customermanagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.hrms.config.ApplicationConfig;
import com.hrms.config.ApplicationConfigProxy;
import com.hrms.pojo.EmployeePojo;
import com.hrms.service.EmployeeService;

public class AOPTest {

	public static void main(String[] args) {

		try {
			AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
			appContext.register(ApplicationConfigAOP.class);
			appContext.refresh();

			CustomerManager customerManager = (CustomerManager) appContext.getBean("customerManagement");
			String status = customerManager.saveCustomer(101, "ravi");
			System.out.println("end....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
