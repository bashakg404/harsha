package com.array.programs;


public class FindDupllicateNumberInArray {

	public static void main(String args[]){
	
		//to find duplicate numbers in given array
/*int [] myarray={3, 5, 6, 7, 8, 5, 4, 6};

for(int i=0; i<myarray.length-1; i++){
	for(int j=i+1; j<myarray.length; j++){
		if(myarray[i]==myarray[j] && i != j){
			System.out.println("Duplicate element:" +myarray[j]);
		}
	}
}
}
}*/

		//to find duplicate string in given array of string
String[] myString={"Basha", "Ravi", "Sandeep", "Sandeep", "Hazi", "Hazi"};
		
		for(int i=0; i<myString.length-1; i++){
			for(int  j=i+1; j<myString.length; j++){
				if(myString[i]==myString[j] && i!=j){
					System.out.println("Duplicate String:" +myString[j]);
				}
			}
		}
}}