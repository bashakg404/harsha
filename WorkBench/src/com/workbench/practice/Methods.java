package com.workbench.practice;

//import java.io.*;

/*class Addition {

	int sum = 0;

	public int addTwoInt(int a, int b) {
		sum = a + b;
		return sum;

	}

}

class Methods {
	public static void main(String[] args) {
		Addition add = new Addition();
		int s = add.addTwoInt(1, 2);
		System.out.println("Sum of two integer values :" + s);

	}*/
 //next program
	
/*class Test {
	public static int i = 0;
	Test() {
	  i++;
}
	public static int get() {
		return i;
	}

	public int m1() {
		System.out.println("1.Inside the method m1 by object of GFG class");

		this.m2();
		System.out.println("3.Inside the method m1 by object of GFG class");
		return 1;
	
	}

	public void m2() {

		System.out.println("2.In method m2 came from method m1");
	}
}

class Methods {
	public static void main(String[] args) {

		Test obj = new Test();

		int i = obj.m1();
		System.out.println("Control returned after method m1 :" + i);

		obj.m2();
		int no_of_objects = Test.get();

		System.out.print("No of instances created till now : ");
		System.out.println(no_of_objects);

	}
}
*/

//METHOD OVERLOADING and OVERRIDING
/*
class Methods {
	
public static void main(String[] args) {

    Mammal mammal1 = new Cat();
    System.out.println(mammal1.speak());

    Mammal mammal2 = new Human();
    System.out.println(mammal2.speak());

    // Compilation error speak(String) is specific to Human class and we can not refer it from Mammal reference
    // mammal1.speak("Hindi");

    Human human = new Human();
    System.out.println(human.speak());
    System.out.println(human.speak("Hindi"));

    // Compilation Error ambiguous method call between calculate(int, long) and calculate(long, int)
    // human.calculate(5, 5);


    System.out.println(human.calculate(5, 5L));
    System.out.println(human.calculate(5L, 5));
}

static abstract class Mammal {
    public String speak() {
        return "Well might speak something like ohlllalalalalalaoaoaoa";
    }
}

static class Cat extends Mammal {

    @Override
    public String speak() {
        return "Meow";
    }

}

static class Human extends Mammal {

    @Override
    // Using Override annotation is not necessary but using it will tell you if you are not obeying overriding rules
    public String speak() {
        return "Hello";
    }

    // Valid overload of speak
    public String speak(String language) {
        if (language.equals("Hindi")) return "Namaste";
        else return "Hello";
    }

    public long calculate(int a, long b) {
        return a + b;
    }

    // However nobody should do it but Valid overload of calculate by just changing sequence of arguments
    public long calculate(long b, int a) {
        return a + b;
    }
}
}*/
//ABSTRACTION

abstract class Bike{  

	  abstract void run(); 
	 
	  
	}  
	class Methods extends Bike{  

	void run(){System.out.println("running safely..");}  
	
	public static void main(String args[]){  
		System.out.println("1111");
	 Bike obj = new Methods(); 
	 System.out.println("222");
	 obj.run();  
	}  
	}  