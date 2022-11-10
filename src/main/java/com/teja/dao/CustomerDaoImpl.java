package com.teja.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teja.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SessionFactory factory;

	@Override
	public List<Customer> getCustomerLists() {
		Session session = factory.getCurrentSession();
		Query query = session.createNativeQuery("select * from customer", Customer.class);
		List<Customer> list = query.getResultList();
		return list;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		Session session = factory.getCurrentSession();
		Customer customer = session.get(Customer.class, customerId);
		return customer;
	}

	@Override
	public void addNewCustomer(Customer customer) {
		Session session = factory.getCurrentSession();
		session.save(customer);
	}

	@Override
	public void deleteExistingCustomer(String customerId) {
		Session session = factory.getCurrentSession();
		Customer customer = session.get(Customer.class, customerId);
		session.delete(customer);
		
	}

	@Override
	public void updateExistingCustomer(Customer customer) {
		Session session = factory.getCurrentSession();
		session.update(customer);
	}
}
