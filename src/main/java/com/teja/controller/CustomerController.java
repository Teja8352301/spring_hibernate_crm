package com.teja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.teja.entity.Customer;
import com.teja.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("getCustomerList")
	public String getController(Model model) {
		List<Customer> customerList = (List<Customer>)customerService.getCustomerList();
		model.addAttribute("customerList", customerList);
		return "get-customer-list";
	}
	
	@GetMapping("addCustomer")
	public String addCustomer(@RequestParam(value="candidateId",required=false) String customerId,Model model) {
		Customer customer;
		if(customerId == null) {
			customer = new Customer();
		}
		else {
			customer = (Customer)customerService.getCustomerById(customerId);
			System.out.println("37"+customer);
		}
		model.addAttribute("customer", customer);
		return "add-customer";
	}
	
	@PostMapping("addNewCustomer")
	public String addNewCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveNewCustomer(customer);
		return "redirect:getCustomerList";
	}
	
	@GetMapping("deleteCandidate")
	public String deleteCandidate(@RequestParam(value="candidateId") String customerId) {
		customerService.deleteExistedCustomer(customerId);
		return "redirect:getCustomerList";
	}

}
