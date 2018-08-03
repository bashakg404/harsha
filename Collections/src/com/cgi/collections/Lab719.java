package com.cgi.collections;

public class Lab719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class cls1=int.class;
System.out.println("====");
Class cls2=Cloneable.class;
System.out.println("======");
Class cls3=args.getClass();
System.out.println("============");
Class cls4=Color.class;
System.out.println("===================");
verifyClass(cls1);
System.out.println("==_____");
verifyClass(cls2);
System.out.println("===+++++++++");
verifyClass(cls3);
System.out.println("=======::::::::::");
verifyClass(cls4);

	}
	private static void verifyClass(Class cls) {
		// TODO Auto-generated method stub
		
	System.out.println("\n**Name:" + cls.getName());
	System.out.println("=[][][][");
	System.out.println("Primitive:" + cls.isPrimitive());
	System.out.println("{{{{}}}}");
	System.out.println("Interface:" + cls.isInterface());
	System.out.println("()()()()");
	System.out.println("Array:" + cls.isArray());
	System.out.println("@@@@@@@@");
	System.out.println("Enum:" + cls.isEnum());
}
}
enum Color{
	RED,BLUE
}
