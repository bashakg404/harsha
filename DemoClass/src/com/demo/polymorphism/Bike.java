package com.demo.polymorphism;

class Bike {
	
	
public static void main(String args[]){
		
		System.out.println("main");
		Bike b=new Pulsar();
		b.run();
	}	


	 void run(){
		System.out.println("running");
	}
}
	class Pulsar extends Bike{
		 void run(){
			System.out.println("Pulsar is running safely with 60kmpl");
		}

}
	
	//if you make method as static it will not over ride the method which you have defined in extended class i.e Pulsar


