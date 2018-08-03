package com.explorehttp.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("entering servlet class");
		HttpSession session=request.getSession();
		Writer out=response.getWriter();
		out.write("<h1><br/>ID:"+session.getId());
		out.write("<br/>isNew:"+session.isNew());
}}
