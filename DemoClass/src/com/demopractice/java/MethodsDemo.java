/*package com.demopractice.java;

public class MethodsDemo {
	public static void main(String args[]){
Hai h=null;
//h.m1();
h=new Hai();
h.m1();

}}


class Hai{
	void m1(){
		System.out.println("instance show()");
	}
}
		
		//------------------------------------------
		Hi h1=null;
		h1.m2();
		h1=new Hi();
		h1.m2();
		Hi.m2();
	}}
		class Hi{
			static void m2(){
				System.out.println("Static method()");
			}
		}
	//--------------------------------------	
		World w=new World();
		w.m3();
		World.m3();
	}}
		class World{
			//int a=111;
		static int c=222;
			 void m3(){
				//System.out.println(a);
				System.out.println(c);
				
			}
		}
		
		
		Test.show(86, 16);
		Test.show(5, 0);
	}}

		class Test{
		static void show(int a, int b){
			if (b==0)
			return;
				System.out.println(a%b);
			}
		}
		
		
		//------------------------------------
		
		Add obj=new Add();
		//add.m1();
		int a=obj.m1(15);
		System.out.println("main method");
		System.out.println(a);
		System.out.println("==========");
		System.out.println(obj.m1(19));
		System.out.println("+++++++++");
		System.out.println("hello Add");
	}}
		class Add{
			int m1(int x){
				System.out.println("Add class");
				return x+1;
				
			}
		}
		//----------------------------
		MethRef h=new MethRef();
		int q=h.m2(20);
		System.out.println("main method");
		System.out.println(q);
	}}
		class MethRef{
		int m2(int z){
				System.out.println("m2()");
		return z+1;
			}
		}
		Bas h=new Bas();
		long q=h.show(111);
		System.out.println("==2==");
				System.out.println(h.show(10));
				System.out.println("==3==");
				System.out.println(q);
	}}
		class Bas{
			long show (int x){
				System.out.println("show()");
				System.out.println("==1==");
				return x;
			}
		}
		Sha h=new Sha();
		System.out.println("==1==");
		System.out.println(h.isDigit('A'));
		System.out.println("after A value");
		System.out.println(h.isDigit('8'));
		System.out.println("==3==");
	}}

		class Sha{
			boolean isDigit(char ch){
				System.out.println("==2==");
			System.out.println("isDigit:"+ch);
			if(ch>=48 && ch<=57)
				return true;
			
			else 
				System.out.println("after return 1");
				return false;
			}
		}*/