package com.datastructers.examples;

import java.util.Scanner;

public class RevereseNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int inputNumber=scanner.nextInt();
		System.out.println("ResversedOutput:" +revrseNum(inputNumber));
	}

	public static int revrseNum(int inputNumber) {
		int reminder;
		int reverse=0;
		
		while(inputNumber>0){
			reminder=inputNumber%10;
			inputNumber=inputNumber/10;
			reverse=reverse*10+reminder;
		}
		
		return reverse;
	}

}
