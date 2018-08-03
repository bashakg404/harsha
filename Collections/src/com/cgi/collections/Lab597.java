package com.cgi.collections;

import java.util.*;

public class Lab597 {
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

	}

}
