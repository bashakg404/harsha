package com.basha.springdemopractice;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	//create array for Strings

	private String[] data={ "Knowledge is the power",
"You need knowledge and luck to get succeed",
"You are not getting error?then you are not trying any thing new",
"The journey is the reward" };
	
	//create random number generator
	private Random myRandom=new Random();
	@Override
	public String getFortune(){
		//pick a random string from array
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}
	

}
