package com.demopractice.String;

public class StringToInt {

	public static void main(String[] args) {
		/* Convert string of number to an integer, float , double*/
		String str="12345";
		int i=Integer.parseInt(str);
		int iadd=i+3;
		System.out.println("Converted from String to an int:" + iadd);
		
		String st="72.3";
		float f=Float.parseFloat(st);
		float fadd=f+5;
		System.out.println("Converted form string to float:" + fadd);
		
		String st1="200000002212";
		double d=Double.parseDouble(st1);
		double dadd=f+5;
		System.out.println("Converted form string to double:" + dadd);
	}

}
