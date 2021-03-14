package com.cg.customerms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.cg.items.entities.Item;
import org.springframework.stereotype.Repository;

import com.cg.customerms.entities.Customer;

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
		return customer;
	}

	@Transactional
	public Customer addToItems(Item item, long customerID) {
		Customer customer = entityManager.find(Customer.class, customerID);
		customer.addToItems(item);
		entityManager.merge(customer);
		return customer;
	}

}
