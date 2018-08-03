package com.array.programs;


/*Given an input array, and a integer needs to be removed; remove all the instances of the integer from the array.*/
public class RemoveElement {

	public static void main(String[] args) {
		int arr[] = {2, 2, 1, 3, 8, 2, 2, 3, 2, 4};
		int newLength = removeValue(arr, 8);
		System.out.println("the new length of the array is "+ newLength);
		for(int i=0; i<newLength; i++){
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeValue(int[] arr, int value) {
		/*Create two indexes fast and slow to iterate over array*/
		int slow = 0; 
		int fast = 0;
		
	/*	If the array value is same as the value to be deleted then we will increment only fast index else both will be incremented.
		When fast reaches the value not to be deleted then we will store that value in slow index*/
		while(fast < arr.length){
			
			while(arr[fast]==value){
				fast ++;
			}
					
			
			arr[slow] = arr[fast];
			slow++;
			fast++;
		}
		return slow;
	}
}
