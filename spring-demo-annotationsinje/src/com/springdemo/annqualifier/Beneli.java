package com.springdemo.annqualifier;

import org.springframework.stereotype.Component;

@Component
public class Beneli implements Brands {

	@Override
	public String myBikeBrand() {
		// TODO Auto-generated method stub
		return "My beautyfull Beneli 600CC";
	}

}
