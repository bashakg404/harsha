package com.demo.dynamicdispatch;

public class TypeCastingDemo {

	D dobj=new D();
	A aobj=dobj;
	//B bobj=aobj; //cannot conver from A to B
	//D dobj1=aobj;//cannot conver from A to D
	B bobj=(B)aobj;//adding cast to B
}

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E{}
