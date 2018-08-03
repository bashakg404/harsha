package com.springdemo.annqualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the beans from the container
		Bike theBike=context.getBean("active", Bike.class);
		
		//call the methods
		System.out.println(theBike.getYourBikeCC());
		System.out.println(theBike.myBikeBrand());
		
		//close the context
		context.close();
	}

}
