package com.basha.listcollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterationTypes {

	public static void main(String args[]){
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(23, "SOAP");
		map.put(12, "REST");
		map.put(31, "JSON");
		
		//iterate over keys
		Iterator<Integer> keyIterator=map.keySet().iterator();
		while(keyIterator.hasNext()){
			System.out.println(keyIterator.next());
		}
		
		//iterate over values
		Iterator<String> valueIterator=map.values().iterator();
		while(valueIterator.hasNext()){
			System.out.println(valueIterator.next());
		}
		
		//iterator over Entry
		Iterator<Entry<Integer, String>> entryIterator=map.entrySet().iterator();
		while(entryIterator.hasNext()){
			System.out.println(entryIterator.next());
		}
	}
}
