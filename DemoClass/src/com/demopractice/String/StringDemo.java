package com.demopractice.String;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {


	public static void main(String[] args){
		
		
		// string with and without new operator
		
		/*//without new
		
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
		*/
		
		//concat means addition of strings 
		
		/*String str="JLC JAVA LEARNING CENTERE BEST JAVA FACULTY";
		String res[]=str.split(str);
		
		System.out.println(res);
		String str1="Basha";
		String str2="KG";
		String str3=str1.concat(str2);//Output: BashaKG
		System.out.println(str3);*/
		
		
		//Intern operator
		
		/*String s1="Basha";
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
		/*String s = "Basha";
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == 'w' ) {
		        counter++;
		    } 
		}
		System.out.println(counter);*/
		
		//Program to find the repeated chars
		/*String stng="nacbvsdfbbvdiso";
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
		System.out.println(charmap);*/
		
		//String methods
		String str="I am doing Java course in JLC BTM and its best Java institute";
		String st1=str.trim();
		System.out.println(str+"\t" +st1);
		System.out.println(str.length()+"\n" +st1.length());
		String res[]=str.split("Java", 1);
		System.out.println("----------");
		for(int i=0; i<res.length; i++){
			String st=res[i];
			System.out.println("for:"+i +"\t" +st);
		}
		
	}
}