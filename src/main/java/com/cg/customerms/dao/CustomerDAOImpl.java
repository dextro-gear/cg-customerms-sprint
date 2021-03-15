package com.cg.customerms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.cg.customerms.exceptions.NoItemsBoughtException;
import com.cg.items.entities.Item;
import org.springframework.stereotype.Repository;

import com.cg.customerms.entities.Customer;

import java.util.Set;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer findByID(long id) {
		return entityManager.find(Customer.class, id);
	}

	@Transactional
	@Override
	public Customer update(Customer customer) {
		entityManager.merge(customer);
		return entityManager.find(Customer.class, customer.getID());
	}

	@Transactional
	public Customer addToItems(Item item, long customerID) {
		Customer customer = entityManager.find(Customer.class, customerID);
		customer.addToItems(item);
		entityManager.merge(customer);
		return entityManager.find(Customer.class, customer.getID());
	}

	public Set<Item> retriveItems(long customerID){
		Set<Item> boughtItems = entityManager.find(Customer.class, customerID).getBoughtItems();
		if(boughtItems == null) throw new NoItemsBoughtException("No items have been bought by Customer #" + customerID);
		else return boughtItems;
	}

}
