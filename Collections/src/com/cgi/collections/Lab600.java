package com.cgi.collections;

import java.util.*;

public class Lab600{
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("basha");
		col.add("avi");
		col.add("hsrsha");
		col.add("pavan");
		Iterator it=col.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
			if(obj.equals("avi")) it.remove();
		}
		System.out.println(col);
		}
}