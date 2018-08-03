package com.testserdemo.servlets;

import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
	static int count=0;
protected void service(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
count++;
System.out.println("---service---:"+count);
Writer out=response.getWriter();
Date dt=new Date();
out.write("<h1>" + dt);
if(count<=10){
response.setHeader("Refresh", "1");
}else{
response.setHeader("Refresh", "1: URL=http://jlcindia.com");
}}}