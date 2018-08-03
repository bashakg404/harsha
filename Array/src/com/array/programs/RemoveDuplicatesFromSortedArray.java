package com.array.programs;
import java.util.Arrays;
/*Given an input sorted array, remove all the duplicates and return the length of the new array */
public class RemoveDuplicatesFromSortedArray {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5,};
		
		int uniqueNumbersIndex = removeDuplicates(arr);
		for(int i=0; i<=uniqueNumbersIndex; i++){
			System.out.print(arr[i]+ " ");
		}
		
	}

	private static int removeDuplicates(int[] arr) {
		int slow = 0;
		int fast = 1;
		
		/*Create two pointers, one is slow and other is fast. If the fast pointer is not equal 
		to slow that means that it is pointing to non duplicate value; hence we will replace 
		the index next to slow with new unique number.*/
		while(fast<arr.length-1){
			if(arr[fast] != arr[slow]){
				arr[++slow] = arr[fast];
			}
			fast++;
		}
		/*return the index to which all the numbers in array are non duplicate*/
		return slow;
	}

}
