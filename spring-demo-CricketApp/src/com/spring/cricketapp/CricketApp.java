package com.spring.cricketapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the beans from the container
		//Match theMatch=context.getBean("myMatch", Match.class);
		Match theMatch=context.getBean("myEnglandMatch", Match.class);
		
		//call the methods to get the results
		System.out.println(theMatch.theTeam1());
		System.out.println(theMatch.theTeam2());
		
		//call the method to get the results by constructor injection
		System.out.println(theMatch.getMatchResultStatus());
		
		//close the conext
		context.close();

	}

}
