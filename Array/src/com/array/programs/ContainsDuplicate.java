package com.array.programs;


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static void main(String args[]){
		int[] arr = {1, 2, 3, 4, 5, 6};
		boolean result = containsDuplicate(arr);
		System.out.println("does array contains duplicate? "+ result);
	}
	
	public static boolean containsDuplicate(int[] arr){
		Set<Integer> set  = new HashSet<>();
		for(int x: arr){
			if(set.contains(x)){
				return true;
			}else{
				set.add(x);
			}
		}
		return false;
	}
}
