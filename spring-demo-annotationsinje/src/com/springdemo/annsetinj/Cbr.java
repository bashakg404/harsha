package com.springdemo.annsetinj;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Cbr implements Bike {


	@Autowired
	private Brands brands;

	public void setBrands(Brands brands) {
		System.out.println("inside setter method");
		this.brands = brands;
	}

	/*@Autowired
	public void doMyCrazyStuffs(Brands brands){
		System.out.println("inside domycrazystuffs method");
		this.brands=brands;
	}*/

	
	@Override
	public String getYourBikeCC() {
		
		return "My CBR is 250CC";
	}


	@Override
	public String myBikeBrand() {
		
		return "mybike:" + brands.myBikeBrand();
	}

}
