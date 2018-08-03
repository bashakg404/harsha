package com.servletchaining.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletB extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	System.out.println("ServletB service() Started");
    RequestDispatcher requestdispatcher=request.getRequestDispatcher("c.jlc");
    requestdispatcher.forward(request, response);
    System.out.println("ServletV service() completed");
}
}