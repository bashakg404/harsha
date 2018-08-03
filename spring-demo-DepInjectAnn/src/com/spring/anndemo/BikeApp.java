package com.spring.anndemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BikeApp {

	public static void main(String[] args) {
		
		//config the spring container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean from the container
		Bike thePulsar=context.getBean("myPulsar", Bike.class);
		
		//call the methods
		System.out.println(thePulsar.getBikeCC());
		
		
		//close the context
		context.close();
		
	}

}
