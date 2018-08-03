package com.datastructers.examples;

public class GetLargest {

	public static void main(String[] args) {
		int a[]={2,5,6,3,9,23};
		System.out.println("Largest:" +thelargest(a,6));
	}

	private static int thelargest(int[] a, int total) {
		int temp;
		for(int i=0; i<total; i++){
			
			
			for(int j=i+1; j<total;j++){
			
				if(a[i]>a[j]){
				
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				System.out.println("inside J loop j value:" +a[j]);
			}
			System.out.println("inside I loop i value:" +a[i]);
			
		}
		
		return a[total-1];
	}

}
