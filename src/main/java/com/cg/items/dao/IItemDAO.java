package com.cg.items.dao;

import com.cg.items.entities.Item;

public interface IItemDAO {

	Item add(Item item);
	Item update(Item item);
	Item findByID(String itemID);
	
}
