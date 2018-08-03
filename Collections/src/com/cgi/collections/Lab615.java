package com.cgi.collections;

import java.util.*;

public class Lab615{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("nivas");
		list.add("kumar");
		list.add("Srikumar");
		list.add("manojkumar");
		list.add("chetankumar");
		Iterator it= list.iterator();
		int size=list.size();
		//list.remove("nivas");
		for(int i=0; i<size;i++)
			System.out.println(it.next());
		System.out.println("main ends");
	}}
