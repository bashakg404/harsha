package com.basha.setcollections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterationTypes {
	
	public static void main(String[] args){
		
		Set<String> hashSet=new HashSet<String>();
		hashSet.add("JAVA");
		hashSet.add("Spring");
		hashSet.add("Hibernate");
		
		//using iterator
		Iterator iterator=hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//using Enumeration
		Enumeration<String> listEnum=Collections.enumeration(hashSet);
		while(listEnum.hasMoreElements()){
			System.out.println(listEnum.nextElement());
		}
	}

}
