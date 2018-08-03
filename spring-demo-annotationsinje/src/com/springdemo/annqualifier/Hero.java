package com.springdemo.annqualifier;

import org.springframework.stereotype.Component;

@Component
public class Hero implements Brands {

	@Override
	public String myBikeBrand() {
		
		return "Honda Active 4G";
	}

}
