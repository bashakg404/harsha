package com.filterdemo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{

	public void init(ServletConfig servletconfig)throws ServletException{
		System.out.println("**DemoServlet-init()");
		String city=servletconfig.getInitParameter("city");
		System.out.println(city);
	}
	public void service(HttpServletRequest request, HttpServletResponse response)throws
		IOException, ServletException{
		System.out.println("**Demo Servlet-Service()");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String ip=request.getRemoteAddr();
		String message="<h1>Hello !"+ name + "<br>";
		message=message + "Your Email Id is" + email +"<br>";
		message=message + "Your sending request from IP Address :" + ip;
		request.setAttribute("MESSAGE", message);
		PrintWriter out=response.getWriter();
		out.print(message);
	}
	public void destroy(){
		System.out.println("DemoServlet-destroy()");
	}
}
