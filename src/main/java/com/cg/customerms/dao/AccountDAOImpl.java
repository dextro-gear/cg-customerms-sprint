package com.cg.customerms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.customerms.entities.Account;

@Repository
public class AccountDAOImpl implements IAccountDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public Account add(Account account) {
		entityManager.persist(account);
		return account;
	}

	@Transactional
	@Override
	public Account update(Account account) {
		entityManager.merge(account);
		return account;
	}

}
