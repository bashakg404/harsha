package com.cgi.collections;

import java.util.*;

public class Lab618{
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
			if(obj.equals("nivas"))lit.remove();
			else if (obj.equals("kumar")) lit.set("katla");
			else if (obj.equals("manojkumar")) lit.add("nanda");
		}
		System.out.println(list);
	}}
