package com.cgi.collections;

import java.util.TreeSet;


public class Lab630 {
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
		System.out.println("--pollFirst/Last--");
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println("***Lower()<***");
		
		System.out.println(ts.lower(8));
		System.out.println(ts.lower(3));

		System.out.println("--higher()>--");
		System.out.println(ts.higher(8));
		System.out.println(ts.higher(50));
		System.out.println(ts.higher(3));
		System.out.println("***ceiling()>***");
		System.out.println(ts.ceiling(8));
		System.out.println(ts.ceiling(15));
		System.out.println("***floor()<***");
		System.out.println(ts.floor(8));
		System.out.println(ts.floor(3));
		
	}}

