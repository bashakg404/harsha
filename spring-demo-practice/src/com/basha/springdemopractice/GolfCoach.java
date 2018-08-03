package com.basha.springdemopractice;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService fortuneService) {
      this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice your Putting Skills for 2 Hours";
	}

	@Override
	public String getDailyFortune() {
		
		return "Go to fortune method:" + fortuneService.getFortune();
	}

}
