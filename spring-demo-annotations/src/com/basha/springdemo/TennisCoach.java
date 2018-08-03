package com.basha.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
    
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach(){
		System.out.println(">>innside default constructor<<");
	}
	
	//difine my init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">>TennisCoach: inside of doMyStartupStuff()<<");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff()<<");
	}
	
	/*//method injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">>innside the doSomeCrazyStuff() method<<");
		fortuneService = theFortuneService;
	}*/
	
	/*//define setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">>innside the setFortuneService() method<<");
		fortuneService = theFortuneService;
	}
*/
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		
				return "Practice your backend volley";
	}

	

	@Override
	public String getDaiyFortune() {
		
		return fortuneService.getFortune();
	}

}
