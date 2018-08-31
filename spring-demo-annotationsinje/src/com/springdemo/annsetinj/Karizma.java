package com.springdemo.annsetinj;

import org.springframework.stereotype.Component;

@Component
public class Karizma implements Bike {

	@Override
	public String getYourBikeCC() {
		
		return "Karizma is 200CC";
	}

	@Override
	public String myBikeBrand() {
	
		return "Karizma belongs to Hero Moto Corp";
	}

}
