package com.servletchaining.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("**Servlet ServiceA() started");
		RequestDispatcher requestdispathcer = request.getRequestDispatcher("b.jlc");
		requestdispathcer.forward(request, response);
		System.out.println("**ServletA Service() completed");
	}
}
