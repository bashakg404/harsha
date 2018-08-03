package com.springdemo.annqualifier;

import org.springframework.stereotype.Component;

@Component
public class RoyalEnfield implements Brands {

	@Override
	public String myBikeBrand() {
		// TODO Auto-generated method stub
		return "Bullet 350CC";
	}

}
