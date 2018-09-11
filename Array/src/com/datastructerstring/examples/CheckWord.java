package com.datastructerstring.examples;

public class CheckWord {

	public static void main(String[] args) {
		
		String standard="Harsha";
		String test="Basha";
		boolean result=isHarsha(standard, test);
		System.out.println("is Strings Harsha:" + result);
		
		
	}

	private static boolean isHarsha(String str1, String str2) {
		
		int[] charArray1=new int[256];

		int[] charArray2=new int[256];
		if(str1.length() != str2.length())
		return false;
		
		for(int i=0; i<str1.length(); i++){
			char x=str1.charAt(i);
			charArray1[x]++;
		}
		
		for(int i=0; i<str2.length(); i++){
			char x=str2.charAt(i);
			charArray2[x]++;
		}
		
		for(int i=0; i<256;i++){
			if(charArray1[i] != charArray2[i])
				return false;
		}
		
		return true;
	}

}