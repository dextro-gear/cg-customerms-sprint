package com.cg.items.services;

import com.cg.items.entities.Item;

public interface IItemService {

	Item create(double price, String desc);
	Item findByID(String itemID);
	Item buyItem(String itemID, long customerID);
	
}
