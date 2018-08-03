package com.cgi.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab631 {
	public static void main(String[] args) {
		TreeSet treeset= new TreeSet();
		treeset.add("sri");
		treeset.add("basha");
		treeset.add("dande");
		treeset.add("abhi");
		treeset.add("SD");
		System.out.println("_+_+_+_+");
		Iterator iterator=treeset.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
			}
}
