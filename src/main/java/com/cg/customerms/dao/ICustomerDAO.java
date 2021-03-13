package com.cg.customerms.dao;

import com.cg.customerms.entities.Customer;

public interface ICustomerDAO {

	Customer add(Customer customer);
	Customer findByID(long id);
	Customer update(Customer customer);
	
}
