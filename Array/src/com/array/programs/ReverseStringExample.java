package com.array.programs;

import java.util.Scanner;

public class ReverseStringExample {
	
/*
	public static void main(String...args) {
		String originalString;
		Scanner scan=new Scanner(System.in);
		 originalString=scan.nextLine();
		 System.out.println("original string:" + originalString);
		 System.out.println("reversed string:" + reverseString(originalString));

	}

	private static String reverseString(String originalString) {
		char ar[]=originalString.toCharArray();
		char temp;
		System.out.println("Array value" + ar);
		for(int i=0, j=ar.length-1; i<(ar.length/2);i++,j--){
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		
		return new String(ar);
	}
}
*/
	
	
	
	
	
	public static void mian(String args[]){
		String inputString;
		Scanner scan=new Scanner(System.in);
		inputString=scan.nextLine();
		System.out.println("outputString:" + stringReversed(inputString));
	}
	
	private static String stringReversed(String inputString){
		char [] ar= inputString.toCharArray();
		char temp;
		for(int i=0, j=ar.length-1; i<(ar.length)/2; i++, j--){
			System.out.println(ar[i]);
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		return new String(ar);
	}
}
	
	
	
	
	
