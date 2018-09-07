package com.demopractice.java;

public class CalValRef {
public static void main(String args[]){
	int a=99;
	CBVR cbvr=new CBVR();

	System.out.println("main begins:"+a);
	cbvr.m1(a);
	System.out.println("maain ends:"+a);
}
}
class CBVR{
	void m1(int a){
		System.out.println("method m1() starts:"+a);
		a=a+10;
		System.out.println("method m1() ends:"+a);
	}
}
	/*
      Ref ref=new Ref();
      System.out.println("entering ref class");
      ref.a=11;
      System.out.println("ref class variable initialized");
      Refe refe=new Refe();
      
      System.out.println("main begin:"+ref.a);
      
      System.out.println("ref variable output");
    
      refe.m1(ref);
      System.out.println("call refe class method ");
      System.out.println("main ends:"+ref.a);
}}
	class Refe{
		void m1(Ref ref){
			System.out.println("m1 begins:"+ref.a);
			ref.a=ref.a+10;
			System.out.println("m1 ends:"+ref.a);
		}
	}
	
	
	class Ref{
		int a;

	}
	
	*/