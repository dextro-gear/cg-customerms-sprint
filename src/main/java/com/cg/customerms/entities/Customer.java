package com.cg.customerms.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToOne
	private Account account;
//	private Set<Items> boughtItems;
	
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
//		this.boughtItems = boughtItems;
	}

	public long getID() {
		return this.id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

//	public Set<Items> getBoughtItems() {
//		return boughtItems;
//	}
//
//	public void setBoughtItems(Set<Items> boughtItems) {
//		this.boughtItems = boughtItems;
//	}
	
	
}
