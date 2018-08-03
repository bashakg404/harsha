package com.array.programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int number;
		Scanner scan= new Scanner(System.in);
		number=scan.nextInt();
	
	System.out.println("number:" +number);
	System.out.println("sum of digits:" +sumOfDigits(number));

	}

	public static int sumOfDigits(int number){
		int sum=0;
		int reminder;
		while(number>0){
			reminder=number%10;
			number=number/10;
			sum+=reminder;
			
		}
		return sum;
	}
}
