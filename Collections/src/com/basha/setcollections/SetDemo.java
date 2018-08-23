package com.basha.setcollections;

import java.util.HashSet;

public class SetDemo {
	
	public static void main(String[] args){
		//Set<String> hashSet=new HashSet<String>();
		HashSet hashSet=new HashSet();
		hashSet.add("CGI");
		hashSet.add("Infy");
		hashSet.add("Bosch");
		hashSet.add("Verifone");
		hashSet.add("CGI");//duplicate value will not be printed
		System.out.println(hashSet);
		
		//isEmpty method
		System.out.println(hashSet.isEmpty());
		
		//remove method
		hashSet.remove("Infy");
		System.out.println(hashSet);
		
		//contains method
		System.out.println(hashSet.contains("CGI"));
		
		
	}

}
