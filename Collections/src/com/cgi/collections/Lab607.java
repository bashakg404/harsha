package com.cgi.collections;

import java.util.ArrayList;
import java.util.List;

public class Lab607{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("nivas");
		list.add("kumar");
		list.add("Srikumar");
		System.out.println(list);
		list.add(1,"Java");
		System.out.println(list);
		Object obj=list.get(2);
		System.out.println(obj);
		
	}}

		
		