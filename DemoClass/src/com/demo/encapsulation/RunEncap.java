package com.demo.encapsulation;

public class RunEncap {

	public static void main(String[] args) {
		
		EncapTest encap=new EncapTest();
		encap.setName("Basha");
		encap.setIdNum("DEV402");
		encap.setAge(29);
		
		System.out.println("Name: " + encap.getName() + " IDNUM: " + encap.getIdNum() + " AGE: " +encap.getAge());

	}

}
