package com.demo.interfacepractice;

public class MainClass {

	public static void main(String[] args) {
		
		Bicycle bicycle=new Bicycle();
		bicycle.changerGear(3);
		bicycle.speedUp(50);
		bicycle.applyBreaks(2);
		System.out.println("Bicycle present state");
		bicycle.printStates();

		Bike bike = new Bike();
		bike.changerGear(4);
		bike.speedUp(80);
		bike.applyBreaks(4);
		System.out.println("Bike  present state");
		bike.printStates();

	}

}
