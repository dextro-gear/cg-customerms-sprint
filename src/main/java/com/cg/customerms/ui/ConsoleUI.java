package com.cg.customerms.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customerms.entities.Customer;
import com.cg.customerms.services.ICustomerService;

@Component
public class ConsoleUI {
	
	@Autowired
	ICustomerService customerService;
	
	public void displayCustomers(List<Customer> customers) {
		for(Customer c : customers) {
			System.out.println("Customer #" + c.getID());
			System.out.println("------------------");
			System.out.println("Name: " + c.getName() + "\nAccount ID: " + c.getAccount().getAccountID());
			System.out.println("");
		}
	}
	
	public void start() {
		
		List<Customer> customers = new ArrayList<Customer>(); 
		customers.add(customerService.createCustomer("Raja"));
		customers.add(customerService.createCustomer("Tanisha"));
		customers.add(customerService.createCustomer("Jatin"));
		customers.add(customerService.createCustomer("Ayesha"));
		customers.add(customerService.createCustomer("Dhruv"));
		customers.add(customerService.createCustomer("Shipra"));
				
		displayCustomers(customers);
	}
	
}
