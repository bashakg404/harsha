package com.demo.interfacepractice;

public class Bicycle implements Vehicle {

	int speed;
	int gear;
	
	//to change the gear
	@Override
	public void changerGear(int newGear) {
		
		gear=newGear;

	}

	//to increase the speed
	@Override
	public void speedUp(int increment) {
	
		speed=speed+increment;

	}

	//to decrese the speed
	@Override
	public void applyBreaks(int decrement) {
		
		speed=speed-decrement;

	}

	public void printStates(){
		System.out.println("speed:" + speed + "gear:" + gear);
	}
}
