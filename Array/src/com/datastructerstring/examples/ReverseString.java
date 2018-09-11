package com.datastructerstring.examples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String inputString=scanner.nextLine();
		System.out.println("Output:" + reverseString(inputString));

	}

	private static String reverseString(String inputString) {
		char ar[]=inputString.toCharArray();
		char temp;
		
		for(int i=0, j=ar.length-1; i<(ar.length/2); i++, j--){
		temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		}
		return new String(ar);
	}

}
