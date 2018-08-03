package com.basha.springdemopractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String args[]){
		//load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive the bean from Spring container
		Coach theCoach=context.getBean("myGolfCoach", Coach.class);
		//call the methods to bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("Go to Daily Fortune");
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Come back to app class");
		//close context
		context.close();
	}
}
