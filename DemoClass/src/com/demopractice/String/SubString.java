package com.demopractice.String;

public class SubString {

	public static void main(String args[]){
		String str="CGIINDIA";
		int len=str.length();
		System.out.println(str.substring(3, len));
		System.out.println(str.substring(2, len-2));
	}
}
