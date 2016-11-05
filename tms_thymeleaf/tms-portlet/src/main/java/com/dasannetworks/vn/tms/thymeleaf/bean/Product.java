package com.dasannetworks.vn.tms.thymeleaf.bean;

import java.util.Date;

public class Product {

	private String description;
	private int price;
	private Date availableFrom;
	
	public Product(String description, int price, Date availableFrom) {
		this.description = description;
		this.price = price;
		this.availableFrom = availableFrom;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getAvailableFrom() {
		return availableFrom;
	}

	public void setAvailableFrom(Date availableFrom) {
		this.availableFrom = availableFrom;
	}	
	
}
