package com.teja.dao;

import java.util.List;

import com.teja.entity.Customer;


public interface CustomerDao {
	
	public List<Customer> getCustomerLists();
	
	public Customer getCustomerById(String customerId);
	
	public void addNewCustomer(Customer customer);
	
	public void deleteExistingCustomer(String customerId);
	
	public void updateExistingCustomer(Customer customer);

}
