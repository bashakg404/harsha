package com.springdemo.anninject;


import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
    
	
	@Override
	public String getDailyWorkout() {
		
				return "Practice your backend volley";
	}

	

}
