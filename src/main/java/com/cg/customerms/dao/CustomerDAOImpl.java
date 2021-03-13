package com.cg.customerms.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.customerms.entities.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer findByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
