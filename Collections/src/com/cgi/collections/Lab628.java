package com.cgi.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Lab628 {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(10);
		ts.add(2);
		ts.add(4);
		ts.add(7);
		ts.add(9);
		ts.add(1);
		ts.add(6);
		ts.add(3);
		ts.add(5);
		ts.add(8);
		System.out.println(ts);
		Set ts1=ts.descendingSet();
		System.out.println(ts1);
		System.out.println("--Ascending Iterator--");
		Iterator it=ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("descending iterator");
		Iterator it1=ts.descendingIterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		
		
	}

}
