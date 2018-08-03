package com.listener.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {
	public MyContextListener() {
		System.out.println("**MyContextListener() Def cons");
	}

	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("===11===");
		ServletContext context = event.getServletContext();
		System.out.println("**context destroyed:" + context);
		System.out.println("===12===");
	}

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("===13===");
		ServletContext context = event.getServletContext();
		System.out.println("**contextInitialized:" + context);
		System.out.println("===14===");
	}
}
