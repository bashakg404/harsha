package com.datastructers.examples;

import java.util.Scanner;

public class DemoClass {

	// public static void main(String[] args) {

	/*
	 * String s1=null; s1="cgi"; String
	 * st=10+20+"AVI"+10+21+"Basha"+1+2+"Three"+3+4;
	 * System.out.println(10+23+"Basha"); System.out.println(st);
	 * System.out.println(s1); }
	 */

	/*
	 * int j=5; int k=2; for(int i=1;i>10;i++){ System.out.println("i:" +k +"\t"
	 * +"j:" +j); System.out.println(k); } }
	 */
	// ====================
	/*
	 * int x=21; do{ System.out.println(x); x++; } while(x<23); } }
	 * 
	 */

	// ==========

	/*
	 * int a = 20 ; DemoClass.a =DemoClass.a+a ;
	 * System.out.println(DemoClass.a); System.out.println(a);
	 * System.out.println(DemoClass.a); a = a + DemoClass.a ;
	 * System.out.println(DemoClass.a); System.out.println(a); } static int a =
	 * 10 ;
	 * 
	 * }
	 */
	// ============
	/*
	 * static int a=10; public static void main(String[] args) { int a =20;
	 * 
	 * DemoClass.a=DemoClass.a+a; System.out.println(DemoClass.a);
	 * System.out.println(a); a=a+DemoClass.a;
	 * DemoClass.a=DemoClass.a+a+DemoClass.a; System.out.println(DemoClass.a);
	 * System.out.println(a);
	 * 
	 * }}
	 */

	// ================

	/*
	 * int a; DemoClass(int a){ a=a;
	 * 
	 * } public static void main(String[] args) { DemoClass demoClass=new
	 * DemoClass(10); System.out.println(demoClass.a); } }
	 */

/*
*/

	/*public static void main(String[] args){
		String str="Basha";
		String str1="KG";
		System.out.println(str+str1);
		System.out.println(str==str1);
		String str2="Basha";
		System.out.println(str==str2);
		String str3=str+str1;
		String str4="BashaKG";
		System.out.println(str4);
		System.out.println(str3);
		System.out.println(str3==str4);
		System.out.println();
		String str5="Basha"+99;
		System.out.println(str5);
		System.out.println("---------------");
		String st=new String("JLC");
		String st1=new String("JLC");
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		System.out.println("ABC".compareTo("ABC"));
		System.out.println("==trim==");
		String st2="CGI";
		String st3=st2.trim();
		System.out.println(st3);
		System.out.println("---index of");
		String ss="I have good skills in java";
		System.out.println(ss.indexOf(97));
		System.out.println("**substring**");
		String ss1="Welcome to Java World";
		System.out.println(ss1.substring(0,5));
		
	}}*/

//public static void main(String args[]){
	public interface Test{
		public static String msg="Basha";
	}
	}
