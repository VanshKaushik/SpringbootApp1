package com.amdocs.Springbootapp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.Springbootapp1.CustomerRepo;

@Service
public class CustomerService {

	private CustomerRepo customerRepo;
	
	@Autowired
	public CustomerService(CustomerRepo customerRepo)
	{
		this.customerRepo=customerRepo;
	}
	
}
