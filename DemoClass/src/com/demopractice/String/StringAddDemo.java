package com.demopractice.String;

public class StringAddDemo {

	public static void main(String[] args) {
		//add method
		System.out.println("***Add Method***");
		String str="JLC99";
		final String str1="JLC";
		final String str2="99";
		String str3=str1+str2;
		System.out.println(str3);
		System.out.println(str1==str3);
		System.out.println(str.equals(str3));
		String str4="JLC"+99;
		System.out.println(str3.equals(str4));
		
		//concat method
		System.out.println("***Cancat Method***");
		String s1="JLC";
		String s2="INDIA";
		String s3=s1.concat(s2);
		System.out.println(s3);
		String s4="JLCINDIA";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		//indeex of method
		System.out.println("***Index Method***");
		String st="Hi Anjali, How are you, Had your dinner";
		System.out.println(st.indexOf(110));
		System.out.println(str.indexOf('n'));
		
		//matches method
		System.out.println("***Matches Method***");
		String ex="[A-Z]";//it will not accept multiple chars
		String exp="[A-Z]*";//it will accept multiple chars
		String expr="[A-Za-z0-9]*";//it will accept all char and numbers 
		System.out.println("A".matches(ex));
		System.out.println("h".matches(ex));
		System.out.println("B".matches(exp));
		System.out.println("BASHA".matches(exp));
		System.out.println("Basha4024".matches(expr));
		
	}

}