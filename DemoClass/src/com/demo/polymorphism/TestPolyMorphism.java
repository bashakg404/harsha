package com.demo.polymorphism;

public class TestPolyMorphism {

	public static void main(String[] args) {
		Bank b=new ICICI();
		System.out.println("ICICI interest rate is:" + b.getRateOfInterest());
		Bank sbi=new SBI();
		System.out.println("SBI Interest rate is:" +sbi.getRateOfInterest());
		
		
	}
	}

	class Bank{
		float getRateOfInterest(){
			return 0;
		}
	}
	
	class ICICI extends Bank{
		float getRateOfInterest(){
			return 9.8f;
		}
	}
	
	class SBI extends Bank{
		float getRateOfInterest(){
			return 9.3f;
		}
	}
	
	class Citi extends Bank{
		float getRateOfInterest(){
			return 12.99f;
		}
	}

