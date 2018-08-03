package com.spring.cricketapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPropertyFileApp {

	public static void main(String[] args) {
		        //load the spring config file
				ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//retrive the beans from the container
				Australia theMatch=context.getBean("myAustraliaMatchDetails", Australia.class);
				
				//call the methods to get the results
				System.out.println(theMatch.theTeam1());
				System.out.println(theMatch.theTeam2());
				
				//call the method to get the results by constructor injection
				System.out.println(theMatch.getMatchResultStatus());
				
				//call the new mathods from literal values
				System.out.println(theMatch.getAustraliaCoachName());
				System.out.println(theMatch.getAustraliaBoardName());
				
				//close the conext
				context.close();
	}

}
