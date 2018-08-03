package com.basha.JunitTestDemo;

public class CalcMethods {
	
	//method to returns the max numbers
	public static int findMax(int arr[]){
		int max=0;
		for(int i=1; i<arr.length; i++){
			if (max<arr[i])
				max=arr[i];
			
		}
		return max;
	}

	public static int cube(int n){
		return n*n*n;
	}
	
	public static String reverseWord(String str){
		char ar[]=str.toCharArray();
		char temp;
		for(int i=0, j=ar.length-1; i<(ar.length/2); i++,j--){
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		return new String(ar);
	}
	

	
}
