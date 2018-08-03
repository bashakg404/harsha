package com.testservlet.servlets;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// Request Parameters

		String unm = req.getParameter("uname");
		String pwd = req.getParameter("password");

		// Display request parameters
System.out.println("String unm pwd");
		PrintWriter out = res.getWriter();
		out.println("<h1> Username:" + unm);
		out.println("<br/> Password:" + pwd);
		out.println("<hr/>");
		out.println("Request Headers");

		// Request Headers
System.out.println("request headers");

		Enumeration e = req.getHeaderNames();
		while (e.hasMoreElements()) {
			String hn = e.nextElement().toString();
			String hv = req.getHeader(hn);
			out.println("<br/>" + hn + " : " + hv);
		}
		out.println("<hr/>");
		out.println("Local Info");

		// Locales Supported by Browsers
System.out.println("===========");
		out.println("<br/> req.getLocale():" + req.getLocale());
		out.println("<hr/>");
		out.println("Other Info");
System.out.println("----------------");
		// Other Information From Request

		out.println("<br/> METHOD:" + req.getMethod());
		out.println("<br/> Request URI:" + req.getRequestURI());
		out.println("<br/> Request URL:" + req.getRequestURL());
		out.println("<br/> Protocol:" + req.getProtocol());
		out.println("<br/> Content Len:" + req.getContentLength());
		out.println("<br/> Content Type:" + req.getContentType());
		out.println("<br/> Remote Addr:" + req.getRemoteAddr());
		out.println("<br/> Remote Port:" + req.getRemotePort());
		out.println("<br/> Remote Host:" + req.getRemoteHost());
		out.println("<br/> Server Port:" + req.getServerPort());
		out.println("<br/> Server Name:" + req.getServerName());
		out.println("<br/> QueryString():" + req.getQueryString());
		out.println("<br/> req.getServletPath():" + req.getServletPath());
		out.println("<br/> req.getContextPath:" + req.getContextPath());
	}
}
