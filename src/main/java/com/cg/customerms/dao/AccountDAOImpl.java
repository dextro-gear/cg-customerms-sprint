package com.cg.customerms.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.customerms.entities.Account;

@Repository
public class AccountDAOImpl implements IAccountDAO {

	@Autowired
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
		// TODO Auto-generated method stub
		return null;
	}

}
