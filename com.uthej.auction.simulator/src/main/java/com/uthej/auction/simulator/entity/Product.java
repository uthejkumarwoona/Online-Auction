package com.uthej.auction.simulator.entity;

import java.util.List;

public class Product {
	
	//declare the variables
	
	public String productName;
	
	public List<Bidder> bidderList;
	
	// constructor with fields

	public Product(String productName, List<Bidder> bidderList) {
		super();
		this.productName = productName;
		this.bidderList = bidderList;
	}

	// getters and setters	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Bidder> getBidderList() {
		return bidderList;
	}

	public void setBidderList(List<Bidder> bidderList) {
		this.bidderList = bidderList;
	}
	

	// declare toString() method

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", bidderList=" + bidderList + "]";
	}
	
	
	

}
