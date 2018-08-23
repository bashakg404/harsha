package com.basha.hashmap;

public class BasicHashCode {
	
	public static void main(String[] args){
		String name1="TCS";
		String name2="Harman";
		String name3="TCS";
		
		System.out.println("name1.equals(name2):" +name1.equals(name2));
		System.out.println("name1.hashCode()="+name1.hashCode());
		System.out.println("name2.hashCode()="+name2.hashCode());
		
		System.out.println("name1.equals(name3):"+name1.equals(name3));
		System.out.println("name1.hashaCode()="+name1.hashCode());
		System.out.println("name3.hashCode()="+name3.hashCode());
	}

}
