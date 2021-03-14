package com.cg.items.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.cg.customerms.entities.Customer;

@Entity
public class Item {

	@Id
	private String id;

	private double price;
	private String description;
	private LocalDateTime addedDate;
	
	@ManyToOne
	private Customer boughtBy;
	
	
	public String generateID() {
		String chars = "0123456789";
		StringBuilder id = new StringBuilder();
		for(int i=0; i<10; i++) {
			id.append(chars.charAt((int)(Math.floor(Math.random()*10))));
		}
		return id.toString();
	}

	public Item(){
		super();
		this.price = 0;
		this.description = null;
		this.addedDate = null;
		this.boughtBy = null;
	}

	public Item(double price, String description) {
	super();
	this.price = price;
	this.description = description;
	this.addedDate = LocalDateTime.now();
	this.boughtBy = null;
}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getAddedDate() {
		return addedDate;
	}

	public Customer getBoughtBy() {
		return boughtBy;
	}

	public void setBoughtBy(Customer boughtBy) {
		this.boughtBy = boughtBy;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", description=" + description + ", addedDate=" + addedDate
				 + ", boughtBy=" +this.boughtBy.toString() + "]";
	}


}
