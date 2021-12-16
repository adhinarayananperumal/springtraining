package com.hrms.aop.customermanagement;

public interface CustomerManager {

	String saveCustomer(int cusId, String cusName);

	public String getCustomer(int cusId);

}
