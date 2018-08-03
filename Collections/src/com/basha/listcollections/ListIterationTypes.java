package com.basha.listcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterationTypes {
	//Types of Iteration examples
		public static void main(String[] args){
			List<String> list=new ArrayList<String>();
			list.add("AWS");
			list.add("Azure");
			list.add("Cloud");
			
			//using iterator
			Iterator<String> iter=list.iterator();
			while(iter.hasNext()){
				System.out.println(iter.next());
			}
			
			//using list iterator
			ListIterator<String> listIterator=list.listIterator();
			System.out.println(list);
			
			
			//using enumeration
			Enumeration<String> listEnum=Collections.enumeration(list);
			while(listEnum.hasMoreElements()){
				System.out.println(listEnum.nextElement());
			}
			
		}}

