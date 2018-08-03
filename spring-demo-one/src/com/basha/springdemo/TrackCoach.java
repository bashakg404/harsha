package com.basha.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	public TrackCoach(FortuneService fortuneService) {
	
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 2k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do It:" + fortuneService.getFortune();
	}
	//add an init method
	
	public void doMyStartupStuff(){
		System.out.println("TrackCoach:inside method doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanUpStuffYoYo(){
		System.out.println("TrackCoach:inside method doMyCleanUpStuffYoYo");
	}

}
