package com.hrms.aop.customermanagement;

import org.springframework.stereotype.Component;

@Component("customerManagement")
public class CustomerManagementImpl implements CustomerManager {

	public String saveCustomer(int cusId, String cusName) {
		System.out.println("saveCustomer method called........");
		return "customer saved successfully";
	}

	public String getCustomer(int cusId) {
		System.out.println("getCustomer method called");
		return "customer retrived successfully";
	}

}
