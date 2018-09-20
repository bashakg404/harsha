package com.datastructerstring.examples;

import java.util.HashMap;
import java.util.Scanner;

public class CountRepeatedChrs {
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
	HashMap<Character, Integer> charmap=new HashMap<Character, Integer>();
	
	char [] chr=str.toCharArray();
	for(char value:chr){
		if(Character.isAlphabetic(value)){
			if(charmap.containsKey(value)){
				charmap.put(value, charmap.get(value) + 1);
			}else{
				charmap.put(value, 1);
			}
		}
	}
	System.out.println("repeatedCount:" + charmap);
	}
	
}
