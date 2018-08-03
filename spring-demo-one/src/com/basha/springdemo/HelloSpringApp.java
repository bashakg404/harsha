package com.basha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrive bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());

		// lets call new method for fortunes

		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}
}

//Need to start with Setter Injection