package com.basha.setcollections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args){
		Set<String> hashSet=new HashSet<String>();
		hashSet.add("CGI");
		hashSet.add("Infy");
		hashSet.add("Bosch");
		hashSet.add("Verifone");
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
