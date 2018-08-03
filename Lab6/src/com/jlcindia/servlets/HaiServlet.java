package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HaiServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		System.out.println("**service() method of HaiServlet**");
		String fnm=req.getParameter("fname");
		String phn=req.getParameter("Phone");
		Writer out=res.getWriter();
		res.setContentType("text/html");
		out.write("<h1> Response from HaiServlet");
		out.write("<hr/> Request Parameters");
		out.write("<br/> Fname:" + fnm);
	    out.write("<br/> Phone:" + phn);
		out.write("<hr> Servlet Config Parameteers");
		ServletConfig cfg=getServletConfig();
		String eml=cfg.getInitParameter("email");
		out.write("<br/>" +cfg);
		out.write("<br/>Email:" + eml);
		
		/*ServletConfig ccc=getServletConfig();
		String ph=cfg.getInitParameter("phone");
		out.write("<br/>" +ccc);
		out.write("<br/>Phone:" + ph);*/
		
		
	
		out.write("<hr/> Servlet Context Parameters");
		ServletContext ctx=cfg.getServletContext();
		String web=ctx.getInitParameter("website");
		out.write("<br/>" + ctx);
		out.write("<br/>Web:" +web);
		}
	}
