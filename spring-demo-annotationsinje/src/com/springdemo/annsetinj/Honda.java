package com.springdemo.annsetinj;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Brands {

	@Override
	public String myBikeBrand() {
		
		return "Honda CBR 250CC";
	}

}
