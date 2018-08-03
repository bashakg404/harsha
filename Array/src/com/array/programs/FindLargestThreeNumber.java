package com.array.programs;

public class FindLargestThreeNumber {

	public static void main(String[] args) {
		
		int i,j,k;
		i=48; j=124; k=4;

		if(i>j && i>k)
			System.out.println("i is largest");
			else if(i<j && j>k)
				System.out.println("j is largest");
			else if(i<j && j<k)
				System.out.println("k is largest");
			else
				System.out.println("i j k is not different numbers");
		

		
	}

}
