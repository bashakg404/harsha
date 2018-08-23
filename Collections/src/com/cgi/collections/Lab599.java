package com.cgi.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Lab599 {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("basha");
		col.add("avi");
		col.add("hsrsha");
		col.add("pavan");
		Object arr[] = col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] = "CGI";

		}
		System.out.println(col);
	}
}
