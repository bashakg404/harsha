package com.basha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDempApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
		//retrive the beans from container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		
		context.close();
		

	}

}
