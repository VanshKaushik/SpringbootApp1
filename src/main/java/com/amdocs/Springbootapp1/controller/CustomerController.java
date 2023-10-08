package com.amdocs.Springbootapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.Springbootapp1.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping("/indexpage")
	public String indexpage()
	{
		return "customereg";
	}
	
	
	
	
}
