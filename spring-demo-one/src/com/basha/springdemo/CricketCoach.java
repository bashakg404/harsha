package com.basha.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//literal values
    private String emailAddress;
    private String team;
	// no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// our setter method for setter injection

	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside Setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside Setter method - setTeam");
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside Setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice Bowling for 15 Minutes";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
