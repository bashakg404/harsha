package com.demo.methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Hello h=new Hello();
		int res=h.add(10, 20);
		System.out.println(res);
		int resu=h.add(10, 20, 30);
		System.out.println(resu);

	}
}

	class Hello{
		int add(int a, int b){
			System.out.println("add (int, int)");
			return a+b;
		}
		
		int add(int a, int b, int c){
			System.out.println("add (int int int)");
			return a+b+c;
		}
	}
		

