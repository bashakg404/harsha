package com.datastructerstring.examples;

import java.util.Scanner;

public class NameAbbrivation {
	
	public static void main(String[] args){
		System.out.println("Please Enter FirstName, MiddleName, LastName");
		Scanner scanner=new Scanner(System.in);
		String fullname=scanner.nextLine();
		String ar[]=fullname.split(" ", 3);
		System.out.println(ar[0].charAt(0)+" "+ar[1].charAt(0)+" "+ar[2]);
	}

}
