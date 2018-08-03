package com.array.programs;
/*
 * Given 2 strings, find the common continous substrings in both the strings
 */
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		
//		for(int i)
		
		char[] arr1 = string1.toCharArray();
		char[] arr2 = string2.toCharArray();
		
		int[][] dp = new int[string1.length()][string2.length()];
		System.out.println(Arrays.deepToString(dp));
		System.out.println("DP value:" +dp);
		
		int result=0;
		for(int i=0 ; i<string1.length(); i++){
			if(string1.charAt(i) == string2.charAt(0)){
				dp[i][0] = 1;
				result=1;
			}
		}
		
		for(int i=0 ; i<string2.length(); i++){
			if(string2.charAt(i) == string1.charAt(0)){
				dp[0][i] = 1;
				result=1;
			}
		}
		
		//System.out.println(Arrays.deepToString(dp));
		
		for(int i=1; i<string1.length(); i++){
			for(int j=1; j<string2.length(); j++){
				if(string1.charAt(i)==string2.charAt(j)){
					dp[i][j] = dp[i-1][j-1]+1;
					if(dp[i][j]>result)
						result = dp[i][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(dp));
		System.out.println("the max subsequence is "+ result);
		
	}

}