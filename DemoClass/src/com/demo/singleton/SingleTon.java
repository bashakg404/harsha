package com.demo.singleton;

public class SingleTon {

	public static void main(String[] args) {
		
		Basha bas=Basha.getBasha();
		System.out.println(bas);

	}

}

class Basha{
	private static Basha singletoninstance=new Basha();
	private Basha(){}
	public static Basha getBasha(){
		return singletoninstance;
	}
}

