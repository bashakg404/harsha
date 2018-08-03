package com.array.programs;

public class FindFactorial {
	public static void main(String args[]){
		
		/*Logic
		initailize number
		if n==0 the return 1
		else n*n-1*/
		int n=5;
		System.out.println("Factorial:" + n+"is:"+findFactorial(n));
	}

	public static int findFactorial(int n){
		if(n==0)
		return 1;
		
		return n*findFactorial(n-1);
	}	
}
