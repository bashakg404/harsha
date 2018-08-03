package com.listener.demo;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyRequestListener implements ServletRequestListener{
	public MyRequestListener(){
		System.out.println("===15===");
		System.out.println(" MyRequest Listener() Def Cons()");
	}
	public void requestDestroyed(ServletRequestEvent arg0){
		System.out.println("===16===");
		System.out.println("**request Destroyed");
	}
public void requestInitialized(ServletRequestEvent arg0){
	System.out.println("===17===");
	System.out.println("\n** requestinitialized");
}
}
