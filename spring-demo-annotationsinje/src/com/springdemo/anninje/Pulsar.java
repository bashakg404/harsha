package com.springdemo.anninje;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pulsar implements Bike {

	@Autowired
	
	private Brands brands;
	//Constructor injection
	public Pulsar(Brands brands) {
		this.brands = brands;
	}


	@Override
	public String getYourBikeCC() {
		
		return "My Pulsar is 150CC";
	}


	@Override
	public String myBikeBrand() {
		
		return "mybike:" + brands.myBikeBrand();
	}

}
