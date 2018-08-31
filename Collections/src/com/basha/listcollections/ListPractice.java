package com.basha.listcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListPractice {
/*
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("abcde");
		ArrayList list1=new ArrayList();
		list1.add("abce");
		System.out.println(list);
		System.out.println(list.equals(list1));
		

	}*/

   //remove the elements using object while iterating
	public static void main(String[] args){
		//List li=new ArrayList();
		LinkedList li=new LinkedList();
		li.add("TechM");
		li.add("Infrrd");
		li.add("Infosys");
		li.add("Mindtree");
		li.add("HCL");
		li.add("IZMO");
		li.add("Sapiens");
		li.add("Virtusa");
		li.add("Erricsson");
		li.add("Allstates");
		li.add("ITC");
		li.add("Harman");
		li.add("Bosch");
		System.out.println(li);
		System.out.println("Sorting using collections");
		Collections.sort(li);//it will sort the elements
		Collections.reverse(li);//it will sort from reverse direction
		System.out.println(li);
		System.out.println("Sorted");
		Iterator it=li.iterator();
		while (it.hasNext()){
			Object obj=it.next();
			if(obj.equals("IZMO")) it.remove();
			System.out.println(li);
			}
	
	}
	
}