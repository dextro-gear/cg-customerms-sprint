package com.cg.customerms.services;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customerms.dao.AccountDAOImpl;
import com.cg.customerms.dao.CustomerDAOImpl;
import com.cg.customerms.entities.Account;
import com.cg.customerms.entities.Customer;
import com.cg.items.entities.Item;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerDAOImpl customerDAO;
	
	@Autowired
	private AccountDAOImpl accountDAO;
	
	@Override
	public Customer findByID(long id) {
		return customerDAO.findByID(id);
	}

	@Transactional
	@Override
	public Customer createCustomer(String name) {
		
		// Create new account and add to database.
		Account account = new Account();
		accountDAO.add(account);
		
		// Create new customer with given account and add to database.
		Customer customer = new Customer(name, account);
		customerDAO.add(customer);
		
		return customer;
	}

	public Customer

	@Override
	public Set<Item> itemsBoughtByCustomer(long customerId){
		return null;
	}
	
	@Override
	public Customer addAmount(long customerID, double amount) {
		return null;
	}
}
