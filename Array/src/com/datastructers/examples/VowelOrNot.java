package com.datastructers.examples;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		char ch='1';
		
		if(ch>=65 && ch<=90){
			switch(ch){
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Charactor is vowel");
				break;
				default:
				System.out.println("charactor is constant");
			}
			
		}else{
			System.out.println("invalid alphabet");
		}

	}

}
