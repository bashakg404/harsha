package com.demopractice.String;

import java.util.Scanner;

public class StringIntro {
	
/*	write program calculate any two string and compare both the string and at last print the output as follows
	ex: INPUT						OUTPUT
		hello java					9
									No
									Hello Java*/
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String st1=sc.next();
		String st2=sc.next();
		
		
		/*String st1="jsha";
		String st2="lgas";*/
		
		System.out.println(st1.length()  + st2.length());
		System.out.println(st1.compareTo(st2)>0?"Yes":"No");
		System.out.println(st1.substring(0, 1).toUpperCase()+ st1.substring(1, st1.length()) + 
				"\n" +st2.substring(0, 1).toUpperCase()+st2.substring(1, st2.length()));
		
		
	}

}
