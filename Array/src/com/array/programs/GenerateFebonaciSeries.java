package com.array.programs;

public class GenerateFebonaciSeries {

	public static void main(String[] args) {
		int n=5;
		generateFebonaciSeries(n);

	}
	public static void generateFebonaciSeries(int n){
		int first=0;
		int second=1;
		int temp;
		
		System.out.println("Febonaci Sereis:" +first+"" +second+"");
		for(int i=0; i<n; i++){
			System.out.println("i value before add: " +i);
			temp=first+second;
			System.out.println("Temp:" +temp);
			first=second;
			System.out.println("first value:" +first);
			second=temp;
			System.out.println("Second value:" + second);
			System.out.println(temp+ "");
		}
	}

}
