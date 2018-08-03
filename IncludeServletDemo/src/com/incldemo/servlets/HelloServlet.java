package com.incldemo.servlets;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet{
protected void service(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException{
	System.out.println("header output");
RequestDispatcher rd1=
req.getRequestDispatcher("header.html");
rd1.include(req, res);

System.out.println("header output");


RequestDispatcher rd2=
req.getRequestDispatcher("footer.html");
rd2.include(req, res);

System.out.println("footer output");

RequestDispatcher rd3=
req.getRequestDispatcher("home.html");
rd3.include(req, res);

System.out.println("home output");
}}