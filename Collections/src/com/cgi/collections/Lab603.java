package com.cgi.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Lab603{
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
		Collection col3 = new ArrayList();
		col3.add("Jquery");
		col3.add("OJDBC");
		col3.add("JSF");
		col3.add("Springs");
		System.out.println(col3 + "\t" + col3.size());
		System.out.println(col + "\n" + col2 + "\n" + col3);
		System.out.println("++++++++++");
		System.out.println(col.containsAll(col2));
		System.out.println(col.containsAll(col3));
		System.out.println("++++++++++");
		System.out.println(col + "\t" + col.size());
	}}