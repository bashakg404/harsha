package com.cgi.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Lab604{
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("basha");
		col.add("avi");
		col.add("hsrsha");
		col.add("pavan");
		System.out.println(col + "\t" + col.size());
		Collection col2 = new ArrayList();
		col2.add("JAVA");
		col2.add("JDBC");
		col2.add("JSP");
		col2.add("HIBERNATE");
		System.out.println(col2 + "\t" + col2.size());
		System.out.println(col);
		System.out.println(col2);
		System.out.println("Remove:"+col.removeAll(col2));
		System.out.println(col);
		System.out.println(col2);
	}}