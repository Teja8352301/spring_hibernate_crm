package com.teja.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teja.dao.CustomerDaoImpl;
import com.teja.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDaoImpl customerDao;

	@Override
	@Transactional
	public Object getCustomerList() {
		return customerDao.getCustomerLists();
	}

	@Override
	@Transactional
	public Object getCustomerById(String customerId) {
		return customerDao.getCustomerById(customerId);
	}

	@Override
	@Transactional
	public void saveNewCustomer(Customer customer) {
		if(customer.getCustomerId() != null && customer.getCustomerId().length()>0) {
			customerDao.updateExistingCustomer(customer);
		}
		else {
			customerDao.addNewCustomer(customer);
		}
	}

	@Override
	@Transactional
	public void deleteExistedCustomer(String customerId) {
		customerDao.deleteExistingCustomer(customerId);
		
	}

}
