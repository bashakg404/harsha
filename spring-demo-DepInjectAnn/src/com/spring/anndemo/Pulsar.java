package com.spring.anndemo;

import org.springframework.stereotype.Component;

@Component

public class Pulsar implements Bike {

	@Override
	public String getBikeCC() {
		
		return "My pulsar is 150CC";
	}

}
