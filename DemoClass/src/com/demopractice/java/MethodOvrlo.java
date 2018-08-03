/*package com.demopractice.java;

public class MethodOvrlo {
public static void main(String args[]){
	Airt ai=new Airt();
	System.out.println("===1====");
	int x=ai.add(10,15);
	System.out.println("===4===");
	System.out.println(x);
	System.out.println("===5===");
	int y=ai.mul(10, 15, 1);
	System.out.println("===8===");
	System.out.println(y);
	System.out.println("===9===");
}
}
class Airt{
	int add(int a, int b){
		System.out.println("===2====");
		System.out.println("add(int, int)");
		System.out.println("===3====");
		return a+b;
	}
	int mul(int b, int a, int c){
		System.out.println("===6===");
			System.out.println("multiply(int, int, int)");
			System.out.println("===7===");
			return b*a*c;
		}
	}

	//2nd Part
	AirStr airstr=new AirStr();
	int z=airstr.add(111,222);
	System.out.println(z);
	String s=airstr.add("Basha", 143);
	System.out.println(s);
}}
	class AirStr{
		int add(int a, int b){
			System.out.println("add(int, int)");
			return a+b;
			}
		String add(String a, int b){
			System.out.println("add(string, int)");
			return a+b;
			
		}
	}
	ByIn byin=new ByIn();
	byte b=20;
	byin.add(b,b);
	byin.add(b,b);
	
}}
	class ByIn{
		void add(byte a, int b){
			System.out.println("add(byte, int)");
			
		}
		void add(int a, byte b){
			System.out.println("add(byte, int)");
		}		}
	*/