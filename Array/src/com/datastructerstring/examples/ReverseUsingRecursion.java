package com.datastructerstring.examples;

public class ReverseUsingRecursion {
	
	public static void main(String[] args){
		ReverseUsingRecursion obj=new ReverseUsingRecursion();
		String str="Good Luck";
		obj.reverse(str);
	}

	void reverse(String str) {
		
		if((str==null) || (str.length()<=1))
		System.out.println(str);
		else{
			System.out.println(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
		
	}

	}
}

