package com.listenerdemo1.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		ServletContext context = session.getServletContext();
		int tv = (Integer) context.getAttribute("TV");
		tv++;
		context.setAttribute("TV", tv);
		int ta = (Integer) context.getAttribute("TA");
		ta++;
		context.setAttribute("TA", ta);
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		ServletContext context = session.getServletContext();
		int ta = (Integer) context.getAttribute("TA");
		ta--;
		context.setAttribute("TA", ta);
	}

}
