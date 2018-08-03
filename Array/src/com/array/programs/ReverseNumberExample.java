package com.array.programs;

public class ReverseNumberExample {

	public static void main(String[] args) {
	
/*		Logic
 		take any random number n
		if n>0
		reminder=n%10
		n=n/10
		reverse=reverse*10+reminder*/
		
		int number=1234567;
		System.out.println("original number:" +number);
		System.out.println("reverse number:" +reverseNumber(number));

	}

	private static int reverseNumber(int number) {
		int reverse=0;
		int reminder;
		while(number>0){
			reminder=number%10;
			number=number/10;
			reverse=reverse*10+reminder;
		}
		
		return reverse;
	}

	
}

