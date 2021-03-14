package com.cg.customerms.ui;

import java.util.ArrayList;
import java.util.List;

import com.cg.customerms.services.CustomerServiceImpl;
import com.cg.items.services.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customerms.entities.Customer;
import com.cg.customerms.services.ICustomerService;

@Component
public class ConsoleUI {
	
	@Autowired
	CustomerServiceImpl customerService;

	@Autowired
	ItemServiceImpl itemService;
	
	public void displayCustomers(List<Customer> customers) {
		for(Customer c : customers) {
			System.out.println("Customer #" + c.getID());
			System.out.println("------------------");
			System.out.println("Name: " + c.getName() + "\nAccount ID: " + c.getAccount().getAccountID());
			System.out.println("");
		}
	}
	
	public void start() {

		System.out.println("ConsoleUI started...");

//		List<Customer> customers = new ArrayList<Customer>();
//		customers.add(customerService.createCustomer("Raja"));
//		customers.add(customerService.createCustomer("Tanisha"));
//		customers.add(customerService.createCustomer("Jatin"));
//		customers.add(customerService.createCustomer("Ayesha"));
//		customers.add(customerService.createCustomer("Dhruv"));
//		customers.add(customerService.createCustomer("Shipra"));
//		displayCustomers(customers);
//
//		itemService.create(10, "chips");
//		itemService.create(30, "cola");
//		itemService.create(40000, "washing machine");
//		itemService.create(13000, "note 7 pro");
//		itemService.create(70, "chocolate");
//
//		itemService.buyItem("6729398980", 2);
//		itemService.buyItem("0028255068", 4);
//		itemService.buyItem("5525919508", 6);


	}
	
}
