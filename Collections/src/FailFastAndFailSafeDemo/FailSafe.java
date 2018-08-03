package FailFastAndFailSafeDemo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	
	    public static void main(String[] args) {
	       List<String> list = new CopyOnWriteArrayList<String>();
	       list.add("a");
	        list.add("b");
	        list.add("c");
	       
	        Iterator<String> iterator = list.iterator();
	       
	        while(iterator.hasNext()){
	  
	         String str = iterator.next();
	         System.out.print(str+" ");
	         
	         if(str.equals("b"))
	           list.add("b2");   //No ConcurrentModificationException
	         
	        }
	       
	        System.out.println("\nAfter iteration list is : "+list);
	       
	    }
	 
	}


