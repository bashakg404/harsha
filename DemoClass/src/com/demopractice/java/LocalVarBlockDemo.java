package com.demopractice.java;

public class LocalVarBlockDemo {
	public static void main(String args[]) {
		/*
		 * System.out.println(LocalVar.b); LocalVar loc=new LocalVar();
		 */
		// 2nd Part
		// System.out.println("main:"+LocalVar.x);

		// 3rd Part
		LocalVar loc2=new LocalVar();
      
	}
}

class LocalVar {
	/*
	 * int a; static int b=4; { int c=55; System.out.println(a);
	 * System.out.println(b); System.out.println(c);
	 * 
	 * }
	 */

	/*
	 * //2nd part static int x; static{ 
	 * //static int y; final int z=777;
	 * System.out.println(x); System.out.println("static block");
	 * //System.out.println(y); System.out.println(z);
	 * 
	 * }
	 */
	{
		int i=10;
		System.out.println("Instance block:"+i);
	}
	static{
		int j=100;
		System.out.println("Static block:"+j);
	}
}