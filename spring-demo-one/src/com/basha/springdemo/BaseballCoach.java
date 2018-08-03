package com.basha.springdemo;

public class BaseballCoach implements Coach {

	// define the private field
	private FortuneService fortuneservice;
public BaseballCoach(){
		
	}
	// define the constructors for dependency injection
	public BaseballCoach(FortuneService theFortuneservice) {
		fortuneservice = theFortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}
}
