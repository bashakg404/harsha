package com.listener.demo;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
	public MySessionListener() {
		System.out.println("===18===");
		System.out.println("**MySession Listener() Def Cons");
	}

	public void sessionCreated(HttpSessionEvent arg0) 
	{
		
		System.out.println("===19===");
		System.out.println("** Session created");
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("===20===");
		System.out.println("session Destroyed");
		System.out.println("===21===");
	}
}
