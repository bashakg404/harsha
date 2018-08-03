package com.array.programs;

public class ChangeThCaseOfChar {

	public static void main(String[] args) {
		
	/*	ASCII
		A-Z=65 to 90
		A=65 Z=90
		
		a-z=97 to 122
		a=97 z=122*/
		
		String inputString="I love to code";
		System.out.println("Input:" +inputString);
		System.out.println("Output:" +changeCases(inputString));
				

	}
	
	public static String changeCases(String inputString){
		char ar[]=inputString.toCharArray();
		for(int i=0;i<ar.length;i++){
			if(ar[i]>=65 && ar[i]<=90){
				ar[i]+=32;
			
			}else if(ar[i]>=97 && ar[i]<=122){
				ar[i]-=32;
			}
		}
		return new String(ar);
	}

}
