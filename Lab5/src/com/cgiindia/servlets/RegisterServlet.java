package com.cgiindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		
		

		System.out.println("collect data");
		String fn = request.getParameter("fname");
		String em = request.getParameter("email");
		String ph = request.getParameter("phone");
		String ge = request.getParameter("gender");
		String ti = request.getParameter("timings");
		String dom = request.getParameter("domain");
		String cous[] = request.getParameterValues("domain");
		String re = request.getParameter("remarks");
		String msg = "your registration has been completed successfully";
		System.out.println("fn ************* "+fn+"  and ph: "+ em);
		System.out.println("Send the response");
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1>CGI Bengaluru</h1>");
		printWriter.println("<h1>" + msg + "</h1>");
		printWriter.println("<h1>Full name:" + fn);
		printWriter.println("<h1>Email ID:" + em);
		printWriter.println("<h1>Phone No:" + ph);
		printWriter.println("<h1>Gender:" + ge);
		printWriter.println("<h1>Timings:" + ti);
		printWriter.println("<h1>Domain:" + dom);
		printWriter.println("<h1>All Domains");
		
	}

}
