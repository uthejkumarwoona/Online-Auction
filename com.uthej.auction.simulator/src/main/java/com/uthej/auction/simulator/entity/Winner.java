package com.uthej.auction.simulator.entity;

public class Winner {
	
	//declare the variables

	public String winnerName;
	
	public int finalBid;
	
	public String productName;
	
	// constructor with fields

	public Winner(String winnerName, int finalBid, String productName) {
		super();
		this.winnerName = winnerName;
		this.finalBid = finalBid;
		this.productName = productName;
	}
	
	// getters and setters	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getWinnerName() {
		return winnerName;
	}

	public void setWinnerName(String winnerName) {
		this.winnerName = winnerName;
	}

	public int getFinalBid() {
		return finalBid;
	}

	public void setFinalBid(int finalBid) {
		this.finalBid = finalBid;
	}
	
	// declare toString() method

	@Override
	public String toString() {
		return "Winner [winnerName=" + winnerName + ", finalBid=" + finalBid + ", productName=" + productName + "]";
	}


}
