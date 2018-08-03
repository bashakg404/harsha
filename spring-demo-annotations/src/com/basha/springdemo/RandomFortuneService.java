package com.basha.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data={"Knowledge is devine", "Create your dependency wherever you go", "Make the journey happier"};
	
	//create random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
	 
		//pick a random string from the array
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
