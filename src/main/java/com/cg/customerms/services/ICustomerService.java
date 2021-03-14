package com.cg.customerms.services;

import java.util.Set;

import com.cg.customerms.entities.Customer;
import com.cg.items.entities.Item;

public interface ICustomerService {

	Customer findByID(long id);
	Customer createCustomer(String name);
    Set<Item> itemsBoughtByCustomer(long customerID);
    Customer addAmount(long customerId, double amount);
}
