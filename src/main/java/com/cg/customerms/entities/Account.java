package com.cg.customerms.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private long accountID;

	private double balance;
	private LocalDateTime created;
	
	public Account() {
		super();
		this.balance = 0;
		this.created = LocalDateTime.now();
	}
	
	public Account(double balance) {
		super();
		this.balance = balance;
		this.created = LocalDateTime.now();
	}

	public Long getAccountID() {
		return accountID;
	}

	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", balance=" + balance + ", created=" + created + "]";
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	
	
}
