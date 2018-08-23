package com.basha.hashmap;

import java.util.HashMap;

public class MyHashCodeImpl {

	public static void main(String[] args) {
		HashMap<Price, String> hm=new HashMap<Price, String>();
		hm.put(new Price("Banana", 20), "Banana");
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Orange", 30), "Orange");
		//creating new object to use as key to get value
		Price key=new Price("Orange", 30);
		System.out.println("HashCode of the Key:" +key.hashCode());
		System.out.println("Value from Map:" +hm.get(key));

	}

}
