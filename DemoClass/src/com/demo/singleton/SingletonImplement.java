package com.demo.singleton;

public class SingletonImplement {

	public static void main(String[] args) {
		
		Hello h=Hello.getHello();
		System.out.println(h);
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());

		Hello k=Hello.getHello();
		System.out.println(k.getHello());
	}

}

class Hello{
	private static Hello INS=new Hello();
	private Hello(){}
	public static Hello getHello(){
		return INS;
	}
}