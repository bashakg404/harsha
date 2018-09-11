package com.datastructerstring.examples;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseOrderOfString {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		System.out.println("Output:" + reverseOrderWord(input));
		
	}

	private static String reverseOrderWord(String input) {
		Pattern pattern=Pattern.compile("\\s");
				String[] temp =pattern.split(input);
				String result="";
				
		for(int i=0; i<temp.length; i++){
			if(i==temp.length-1)
				result=temp[i]+result;
			else
				result=" "+temp[i]+result;
			
		}
		return result;
		
	}

}
