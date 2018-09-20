package com.array.programs;

public class SwapTwoNumsWithoutUsingThirdVariable {

	public static void main(String[] args) {
	/*	Logic
		define 2 numbers n1 n2
		n1=n1+n2
		n2=n1-n2
		n1=n1-n2*/
		
		int n1=101, n2=202;
		System.out.println("before swapping n1=" + n1 +"and n2=" +n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("After swapping n1=" + n1 + "and n2=" +n2);
	}

}
