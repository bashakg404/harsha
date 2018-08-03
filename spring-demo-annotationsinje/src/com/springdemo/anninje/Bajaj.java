package com.springdemo.anninje;

import org.springframework.stereotype.Component;

@Component
public class Bajaj implements Brands {

	@Override
	public String myBikeBrand() {
		
		return "Bajaj Pulsar150";
	}

}
