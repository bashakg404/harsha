package com.demopractice.java;

public class ThisDemo {
	public static void main(String args[]) {
		//System.out.println("hhhh");
		System.out.println(A.b);
		System.out.println("hhhh");
		A a = new A();
		a.m1();

	}

}

class A {
	int a = 10;
	static int b = 20;

	void m1() {
		String a = "Basha";
		String b = "Anil";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("hhhh");
		System.out.println(A.b);
		System.out.println("hhhh");
	}
}