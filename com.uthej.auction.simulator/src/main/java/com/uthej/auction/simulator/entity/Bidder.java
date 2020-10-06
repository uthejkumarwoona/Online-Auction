package com.uthej.auction.simulator.entity;

public class Bidder{
	
	//declare the variables
	
	public String name;
	
	public int initial_bid;
	
	public int max_bid;
	
	public int increment;
		
	// constructor with fields
	
	public Bidder(String name, int initial_bid, int max_bid, int increment) {
	super();
	this.name = name;
	this.initial_bid = initial_bid;
	this.max_bid = max_bid;
	this.increment = increment;
}
		
	// getters and setters	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInitial_bid() {
		return initial_bid;
	}

	public void setInitial_bid(int initial_bid) {
		this.initial_bid = initial_bid;
	}

	public int getMax_bid() {
		return max_bid;
	}

	public void setMax_bid(int max_bid) {
		this.max_bid = max_bid;
	}

	public int getIncrement() {
		return increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}

	
	// declare toString() method
	
	@Override
	public String toString() {
		return "Bidder [name=" + name + ", initial_bid=" + initial_bid + ", max_bid=" + max_bid + ", increment=" + increment
				+ "]";
	}
	
	
	

}
