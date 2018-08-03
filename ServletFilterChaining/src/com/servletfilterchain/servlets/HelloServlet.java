package com.servletfilterchain.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
		System.out.println("Hello servlet class started");
		Writer out=response.getWriter();
		out.write("<h1>Verify the Server Console");
		System.out.println("HelloServlet Class Completed");
	}

}
