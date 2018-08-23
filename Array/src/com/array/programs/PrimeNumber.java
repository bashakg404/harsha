package com.array.programs;

public class PrimeNumber {

	public static void main(String[] args) {
	
	/*	Logic
		take any random number n
		for i=2 i<sqrt(n)
		if n%2==0 then its not prime else its prime
		*/
		int n=7;
		System.out.println(isPrimeNumber(n)?n + "is prime": n+"is not prime");

	}

	public static boolean isPrimeNumber(int n){
		for(int i=2;i<Math.sqrt(n); i++){
			System.out.println("I value:" +i);
			System.out.println("n Value:" +n);
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
}