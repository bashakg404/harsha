package com.cgi.collections;

import java.util.*;

public class Lab619{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("nivas");
		list.add("kumar");
		list.add("Srikumar");
		list.add("manojkumar");
		list.add("chetankumar");
		ListIterator lit= list.listIterator();
		System.out.println("forward order");
		while(lit.hasNext()){
			int indx=lit.nextIndex();
			System.out.println("____________");
			Object obj=lit.next();
			System.out.println("++++++++++");
			System.out.println(indx+"\t"+obj);
		}
		    System.out.println("reverse order");
		    while(lit.hasPrevious()){
		    	int indx=lit.previousIndex();
		    	Object obj=lit.previous();
		    	System.out.println(indx+"\t"+obj);
		    	
			
		}
		System.out.println(list);
	}}
