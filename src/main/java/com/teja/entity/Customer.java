package com.teja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
		        name = "UUID",
		        strategy = "org.hibernate.id.UUIDGenerator"
		    )
	@Column(name="customer_id")
	private String customerId;
	
	private String name;
	
	@Column(unique=true)
	private String email;
	
	@Column(name="school_name")
	private String schoolName;

	public Customer(String name, String email, String schoolName) {
		super();
		this.name = name;
		this.email = email;
		this.schoolName = schoolName;
	}

	public Customer() {
		super();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", schoolName="
				+ schoolName + "]";
	}	
	
	
}
