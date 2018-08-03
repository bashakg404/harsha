package com.array.programs;

import java.util.Arrays;

public class RotateArray {
	
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		int[] result = rotateArray(2, arr);
//		System.out.println(Arrays.toString(result));
// 	}
//	
//	public static int[] rotateArray(int turns, int[] arr){
//		int[] result = new int[arr.length];
//		turns = turns%arr.length;
//		for(int i=0; i<arr.length; i++){
//			result[i] = arr[(i+turns)%arr.length];
//		}
//		return result;
//	}
	
	/*
	 * {1, 2, 3, 4,| 5, 6} with rotate 2
	 * rotate first part of array {4, 3, 2, 1, | 5, 6}
	 * rotate second part of array {4, 3, 2, 1, | 6, 5}
	 * rotate whole array { 5, 6, 1, 2, 3, 4}
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int rotate =4;
		int len = arr.length;
		reverse(arr, 0, len-rotate-1);
		/*reverse(arr, len-rotate, len-1);
		reverse(arr, 0, len-1);*/
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse(int[] arr, int first, int last) {
		int temp;
		
		while(first<last){
			temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		
		return;
	}

}
