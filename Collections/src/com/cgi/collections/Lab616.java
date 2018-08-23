package com.cgi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab616{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("nivas");
		list.add("kumar");
		list.add("Srikumar");
		list.add("manojkumar");
		list.add("chetankumar");
		Iterator it= list.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}}
