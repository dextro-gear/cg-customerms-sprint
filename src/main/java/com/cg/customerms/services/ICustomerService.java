package com.cg.customerms.services;

import com.cg.customerms.entities.Customer;

public interface ICustomerService {

	Customer findByID(long id);
	Customer createCustomer(String name);
	
}
