package com.teja.service;

import com.teja.entity.Customer;

public interface CustomerService {
	 
	public Object getCustomerList();
	
	public Object getCustomerById(String customerId);
	
	public void saveNewCustomer(Customer customer);
	
	public void deleteExistedCustomer(String customerId);
}
