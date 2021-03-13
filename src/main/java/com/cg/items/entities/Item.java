package com.cg.items.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


import com.cg.customerms.entities.Customer;

@Entity
public class Item {
	String id;
	double price;
	String description;
	
//	@ManyToOne
//	Customer boughtBy;
	
	LocalDateTime addedDate;
	
//	private String generateID() {
//		
//	}
}
