package com.basha.contextxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCollegeApp {
	
	public static void main(String args[]){
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		/*//retrieve the bean/object from the container
		College theCollege=context.getBean("theBranch", College.class);
		
		//call the methods on the bean
		System.out.println(theCollege.getYourBranch());
		System.out.println(theCollege.getYourDreamJobTip());*/
		
		//it will create one more object
		College theColleges=context.getBean("theNewBranch", College.class);
		
		//call the new methods for new object
		System.out.println(theColleges.getYourBranch());
		System.out.println(theColleges.getYourDreamJobTip());
		
		//lets call our new method to get the results
		System.out.println(theColleges.getYourResults());
		
		//close the context
		context.close();
		
	}

}
