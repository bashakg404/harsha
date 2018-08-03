package com.datastructers.examples;

public class BubbleSort {

	public static void main(String[] args) {
	
		int array[]={3,6,8,34,5,6,12,5};
		
		System.out.println("before bubble sort");
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]+ " ");
		}
		
		bubblesort(array);

	}

	private static void bubblesort(int[] array) {
		int n=array.length;
		int temp=0;
		for(int i=0; i<n; i++){
			for(int j=1; j<(n-i); j++){
				if(array[j-1]>array[j]){
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println();
	System.out.println("after bubble sort");
	for(int i=0; i<array.length;i++){
		System.out.print(array[i]+" ");
	}

}}
