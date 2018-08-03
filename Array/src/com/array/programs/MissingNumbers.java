package com.array.programs;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Java program to find missing elements in a Integer array containing numbers
 * from 1 to 100.
 *
 * @author Javin Paul
 */
public class MissingNumbers {

	public static void main(String args[]) {
		/*System.out.println("aaaaaa");
	
		// Only one missing number in array
		int[] iArray = new int[] { 1, 2, 3, 5 };
		System.out.println("bbbbbb");
		int missing = getMissingNumber(iArray, 5);
		System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);
	}
	*//**
	 * Java method to find missing number in array of size n containing numbers
	 * from 1 to n only. can be used to find missing elements on integer array
	 * of numbers from 1 to 100 or 1 - 1000
	 *//*
	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		System.out.println("expecctedSum:" +expectedSum);
		int actualSum = 0;
		for (int i : numbers) {
			System.out.println("i value;" +i);
			actualSum += i;
			System.out.println("after actualSum:" +i);
		}
		
		return expectedSum - actualSum;
	}

}*/
	/**
	 * A general method to find missing values from an integer array in Java.
	 * This method will work even if array has more than one missing element.
	 */
		// one missing number
	printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 15);

	// two missing number
	printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 9, 8, 10 }, 10);

	// three missing number
	printMissingNumber(new int[] { 1, 2, 3, 4, 6, 9, 8 }, 10);

	// four missing number
	printMissingNumber(new int[] { 1, 2, 3, 4, 9, 8 }, 10);
	}
	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		System.out.println("ccccccccc");
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		System.out.println("ddddddddd");
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),
				count);
		int lastMissingIndex = 0;
		System.out.println("eeeeeeeeee");
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}

	}
	}
	