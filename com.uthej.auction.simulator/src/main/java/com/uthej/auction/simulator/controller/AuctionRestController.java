package com.uthej.auction.simulator.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uthej.auction.simulator.entity.Product;
import com.uthej.auction.simulator.entity.Winner;
import com.uthej.auction.simulator.service.AuctionService;

@RestController
@RequestMapping("/api")
public class AuctionRestController {
	
	@Autowired
	AuctionService auctionService;
	
	@PostMapping("/auction")
	public ResponseEntity<?> computeWinningBid(@RequestBody List<Product> productList){
				
		List<Winner> winnersList = new ArrayList<Winner>();
				
		winnersList = auctionService.getWinners(productList);
		
		return new ResponseEntity<List<Winner>>(winnersList,HttpStatus.OK);
	}
	


}
