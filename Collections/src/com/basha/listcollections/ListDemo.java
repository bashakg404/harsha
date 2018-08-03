package com.basha.listcollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		ArrayList list1=new ArrayList();
		
		list.add("Basha");
		list.add(12);
		System.out.println(list);
		list.add(null);
		list.add(null);

		System.out.println(list);
		
		list1.add("cgi");
		list1.add(1, null);
		list1.add(2, "badsha");
		list1.add("bkg");
		list1.add(3, "ckg");
		list1.add("fkg");
		list1.add("gd");
		list1.add(7, "ABS");
		list1.add("nG");
		list1.add(8, "KH");
		list1.set(9,"NHHHHH");
		list1.add(10, "KJK");
		list1.add("NMM");
		
		System.out.println(list1);
		
		//***Linked List**
		System.out.println("LINKEDLIST EXAMPLE");
		LinkedList linklist=new LinkedList();
		
		linklist.add("HKJ");
		linklist.add(898);
		linklist.add(null);
		linklist.add(null);
		linklist.set(0, "VHJ");
		linklist.addFirst("HKJ");
		linklist.removeLast();
		linklist.addLast("BKGJ");
		linklist.add("BKJ");
		linklist.add(5, "BKJL");
		linklist.add("OOK");
		System.out.println(linklist);
		
		//**Vector**
		System.out.println("VECTOR");
		Vector v=new Vector();
		
		System.out.println(v.capacity());
		for(int i=1; i<=10; i++){
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
