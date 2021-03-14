package com.cg.items.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.customerms.entities.Customer;
import com.cg.items.entities.Item;

@Repository
public class ItemDAOImpl implements IItemDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public Item add(Item item) {
		
		// If ID already exists in the record, generate new ID.
		String id = item.generateID();
		while(entityManager.find(Item.class, id) != null) {
			id = item.generateID();
		}
		item.setId(id);
		entityManager.persist(item);
		return item;
	}

	@Transactional
	@Override
	public Item update(Item item) {
		entityManager.merge(item);
		return item;
	}

	@Override
	public Item findByID(String itemID) {
		return entityManager.find(Item.class, itemID);
	}
	
	@Transactional
	public Item buyItem(String itemId, Customer customer) {
		Item item = entityManager.find(Item.class, itemId);
		item.setBoughtBy(customer);
		entityManager.merge(item);
		return item;
	}

}
