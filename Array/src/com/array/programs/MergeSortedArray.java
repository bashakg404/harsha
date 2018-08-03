package com.array.programs;

import java.util.Arrays;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 15, 33};
		int[] arr2 = {2, 3, 4, 23, 34, 54};
		int[] result = mergeSortedArray(arr1, arr2);
		System.out.println("the merged sorted array is "+ Arrays.toString(result));
	}
	
	public static int[] mergeSortedArray(int[] arr1, int[] arr2){
		int len = arr1.length + arr2.length;
		int[] mergedArray = new int[len];
		
		int i=0, j=0, k=0;
		
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				System.out.println("Arr 1 and 2:" +arr1[i] +'\t' +arr2[j]);
				mergedArray[k++] = arr1[i++];
				//System.out.println("Arr 1 and 2 after:" +mergedArray[k++] +'\t' +arr1[i++]);
			}else{
				mergedArray[k++] = arr2[j++];
			}
		}
		
		while(i<arr1.length){
			mergedArray[k++] = arr1[i++];
			System.out.println("MergeArray:" + mergedArray[k++]);
		}
		
		while(j<arr2.length){
			mergedArray[k++] = arr2[j++];
		}
		
		return mergedArray;
	}

}
