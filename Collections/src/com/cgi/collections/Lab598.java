package com.cgi.collections;

import java.util.*;

public class Lab598 {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		System.out.println(col);
		System.out.println("Size:" + col.size());
		System.out.println("Empty:" + col.isEmpty());
		System.out.println();
		col.add("basha");
		col.add("avi");
		col.add("hsrsha");
		col.add("pavan");
		col.add("anil");
		System.out.println(col);
		System.out.println("Size:" + col.size());
		System.out.println("Empty:" + col.isEmpty());
System.out.println(col.contains("basha"));
System.out.println(col.contains("java"));
System.out.println(col);
System.out.println(col.remove("JDBC"));
System.out.println(col.remove("avi"));
System.out.println(col);
col.clear();
System.out.println(col);
System.out.println(col.size());


	}

}
