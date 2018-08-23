package com.cgi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab617{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("nivas");
		list.add("kumar");
		list.add("Srikumar");
		list.add("manojkumar");
		list.add("chetankumar");
		ListIterator lit= list.listIterator();
		while(lit.hasNext()){
			Object obj=lit.next();
			System.out.println(obj);
		}
	}}
