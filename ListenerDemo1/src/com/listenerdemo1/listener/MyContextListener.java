package com.listenerdemo1.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent event){
		{
			System.out.println("**context destroyed");
		}
		public void contextInitialized(ServletContextEvent contextevent) {
			System.out.println("**Context initialized");
			ServletContext context=contextevent.getServletContext();
			context.setAttribute("TV", 0);
			context.setAttribute("TA", 0);
		}
	}

}
