package com.demopractice.String;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {


	public static void main(String[] args){
		
		
		// string with and without new operator
		
		//without new
		
		String st1="Basha";
		String st2="Basha";
		String st3="Basha";
		System.out.println(st1);

		System.out.println(st1);

		System.out.println(st1);
		
		System.out.println(st1==st2);

		System.out.println(st1==st3);
		
		System.out.println(st1.equals(st2));
		
		//with new
		
		String s1=new String("Basha");

		String s2=new String("Basha");
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//compare example
		String str="Basha";
		String str1="Basha";
		String str2=null;
		String str3=new String("Basha");
		System.out.println(str==str3);//it will compare the hashcode of the objects
		System.out.println(str.equals(str3));//it will compare string literals
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		
		
		//concat means addition of strings 
		
		String strs="JLC JAVA LEARNING CENTERE BEST JAVA FACULTY";
		String res[]=strs.split(strs);
		
		System.out.println(res);
		String str4="Basha";
		String str5="KG";
		String str6=str4.concat(str5);//Output: BashaKG
		System.out.println(str6);
		
		
		//Intern operator
		/*
		String s1="Basha";
		String s2=new String("Basha");
		String s3=s2.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println("==========");
		String s4="OK".intern();
		String s5="OK";
		System.out.println(s4==s5);*/
		
		//this snippet will give result how many chars are there in string
		String s = "Basha";
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == 'h' ) {
		        counter++;
		    } 
		}
		System.out.println("Count:" +counter);
		
		//Program to find the repeated chars
		String stng="nacbvsdfbbvdiso";
		Map<Character, Integer> charmap=new HashMap<Character, Integer>();
		char[] arr=stng.toCharArray();
		for(char value: arr){
			if(Character.isAlphabetic(value)){
				if(charmap.containsKey(value)){
					charmap.put(value, charmap.get(value) + 1);
				}else{
					charmap.put(value, 1);
				}
			}
		}
		System.out.println("repeated chars:" + charmap);
		
		//String methods
		/*String str="I am doing Java course in JLC BTM and its best Java institute";
		String st1=str.trim();
		System.out.println(str+"\t" +st1);
		System.out.println(str.length()+"\n" +st1.length());
		String res[]=str.split("Java", 1);
		System.out.println("----------");
		for(int i=0; i<res.length; i++){
			String st=res[i];
			System.out.println("for:"+i +"\t" +st);
		}*/
	
		//Typecasting
		/*int y=45;
		byte b=10;
		short s=b;
		int a=s;
		long x=a;
		float f=x;
		double d=f;
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(x);
		System.out.println(f);
		System.out.println(d);
		char ch=(char)y;
		byte z=(byte)y;
		System.out.println("Cha:" +ch);
		System.out.println("Cha:" +z);*/
		
		
		}
}
