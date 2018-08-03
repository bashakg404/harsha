package com.servletchaining.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletC extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
           System.out.println("ServletC service() started");
           Writer out=response.getWriter();
        		   out.write("<h2/><br/>Verify the server console");
           System.out.println("ServletC service() completed");
	}

}
