package com.demo.methodoverriding;

public class MethodOverride {

	public static void main(String[] args) {
		System.out.println("Main");
		//Bike b=new Bike();
		Bike b=new Bullet();
		//b.m1();
	    b.add(2, 5);
	}

}


class Bike{
	/*void m1(){
		System.out.println("Bike is running");
	}*/
	int add(int a, int b){
		return a+b;
	}
}

class Bullet extends Bike{
	/*void m1(){
		System.out.println("Bullet running very fastly");
	}*/
	float add(float a, float b){
		return a+b;
		
	}
}

//to override method return type should be same
//static method cannot be overriden