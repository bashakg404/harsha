package com.basha.setcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SortUsingSet {
	
	public static void main(String[] args){
		
		HashSet<String> names=new HashSet<String>();
			
		names.add("Basha");
		names.add("Sandeep");
		names.add("Avi");
		names.add("Hazi");
		names.add("Ravi");
		names.add("Sandeep");//duplicate will be ignored by set
		names.add("Ravikiran");
		
		System.out.println("HashSet before Sorting:" + names);
		
		//Sort using List
		List<String> tempList=new ArrayList<String>(names);
		Collections.sort(tempList);
		
		System.out.println("HashSet elements in Sorted order:" + tempList);
		
		//Sorting HashSet using TreeSet
		TreeSet<String> sorted=new TreeSet<String>(names);
		
		System.out.println("HashSet sorted using TreeSet:" + sorted);
	}	
	}
