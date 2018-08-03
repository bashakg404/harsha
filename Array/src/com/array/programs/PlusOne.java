package com.array.programs;
import java.util.Arrays;

public class PlusOne {
	/*
	 * Given a non negative integer represented in the form of array of digits, plus one to the integer.
	 */
	public static void main(String[] args) {
		int[] arr = {9, 9, 6, 9, 9};
		int[] result = plusOne(arr);
		System.out.println(Arrays.toString(result));
		
		//the changes are made directly in the array passed as argument
		System.out.println(Arrays.toString(arr));
	}
	

	private static int[] plusOne(int[] arr) {
		int x = arr.length-1;
		while(x>=0 && arr[x]==9){
			arr[x--]=0;
		}
		
		if(x==-1){
			System.out.println("cannot do. hence returning same");
			int[] result = new int[arr.length+1];
			result[0]=1;
			return result;
		}
		
		else{
			arr[x]++;
		}
		return arr;
	}

}
