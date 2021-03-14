package com.cg.customerms.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cg.items.entities.Item;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToOne
	private Account account;
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Item> boughtItems;

	public Customer() {
		super();
		this.name = null;
		this.account = null;
		this.boughtItems = null;
	};

	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
		this.boughtItems = null;
	}
	
	public Customer(String name, Account account, Set<Item> boughtItems) {
		super();
		this.name = name;
		this.account = account;
		this.boughtItems = boughtItems;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + "]";
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

	public Set<Item> getBoughtItems() {
		return boughtItems;
	}

	public void setBoughtItems(Set<Item> boughtItems) {
		this.boughtItems = boughtItems;
	}

	public void addToItems(Item item) {

		if(this.boughtItems == null)
			this.boughtItems = new HashSet<Item>();

		this.boughtItems.add(item);

	}
	
	
}
