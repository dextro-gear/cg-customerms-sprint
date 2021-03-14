package com.cg.items.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customerms.dao.CustomerDAOImpl;
import com.cg.customerms.entities.Customer;
import com.cg.items.dao.ItemDAOImpl;
import com.cg.items.entities.Item;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {
	
	@Autowired
	ItemDAOImpl itemDAO;
	
	@Autowired
	CustomerDAOImpl customerDAO;

	@Override
	public Item create(double price, String description) {
		Item item = new Item(price, description);
		itemDAO.add(item);
		return item; 
	}

	@Override
	public Item findByID(String itemID) {
		return itemDAO.findByID(itemID);
	}

	@Override
	public Item buyItem(String itemID, long customerID) {
		Customer customer = customerDAO.findByID(customerID);
		Item item = itemDAO.buyItem(itemID, customer);
		customerDAO.addToItems(item, customer.getID());
		return null;
	}
//	public Item buyItems(List<Item> items, List<long> customerIDs) {
//
//	}



}
