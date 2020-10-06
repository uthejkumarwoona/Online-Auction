package com.uthej.auction.simulator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uthej.auction.simulator.entity.Bidder;
import com.uthej.auction.simulator.entity.Product;
import com.uthej.auction.simulator.entity.Winner;

@Service
public class AuctionService {

	public List<Winner> getWinners(List<Product> productList) {
		
		List<Winner> winnersList = new ArrayList<>();
		
	//	int n = productList.size();
	//	int i;
		
		//Integer maxBidValue = Integer.MIN_VALUE;
		String maxBidderName = null;
		
	//	List<Bidder> bidder = new ArrayList<Bidder>();
		
		for(Product p : productList) {
			
			int maxBidValue = 0;
		
	//	Product prod = productList.get(i);
		
		for(Bidder bid : p.getBidderList()) {
			
			int maxValue = call(bid);
			
			if ( maxValue > maxBidValue) {
				
				maxBidValue = maxValue;

				maxBidderName = bid.getName();

			}			
			
		}
		
		winnersList.add(new Winner(maxBidderName, maxBidValue, p.productName));

		}
		
		return winnersList;

	}

	private int call(Bidder bid) {
		
		int maxValue = bid.getInitial_bid();
		
		while (maxValue < (bid.getMax_bid() - bid.getIncrement())){
			
			maxValue += bid.getIncrement();
			
		}

		return maxValue;
	}

}
