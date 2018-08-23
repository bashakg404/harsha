package com.cgi.collections;

import java.util.TreeSet;


public class Lab629 {
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
		System.out.println("--subset()--");
		System.out.println(ts.subSet(3, 6));
		System.out.println(ts.subSet(4, false,10,true));
		System.out.println(ts.subSet(4, true,10,true));
		System.out.println("--headSet()---");
		System.out.println(ts.headSet(9));
		System.out.println(ts.headSet(9,true));
		System.out.println(ts.headSet(2));
		System.out.println("--tailset--");
		System.out.println(ts.tailSet(9));
		System.out.println(ts.tailSet(9,false));
	}}
