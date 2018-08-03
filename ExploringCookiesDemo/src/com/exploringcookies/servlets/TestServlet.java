package com.exploringcookies.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("entering servlet class");

PrintWriter out=response.getWriter();
Cookie cookies[]=request.getCookies();
out.print("<h1>"+cookies);
boolean jsidflag=false;
System.out.println("request and response");
boolean jlcflag=false;
if(cookies==null || cookies.length==0){
	out.println("<h1> OOOOOOOOOO No Coookies</h1>");
	System.out.println("entering the loop");
}else{
	for(Cookie cookie:cookies){
		String cookiename=cookie.getName();
		String  cookievalue=cookie.getValue();
		out.print("<h1>"+cookiename+"------"+cookievalue+"</h1>");
		if(cookiename.equals("JSESSIONID")){
			jsidflag=true;
		}
		if(cookiename.equals("JLC")){
			jlcflag=true;
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		
		}}}
System.out.println("closing the loop");
if(jsidflag)
	out.println("<h1>JSESSIONID Cookie is Found...");

else
	out.println("<h1>JSESSIONID Cookie is Not Found...");
	
if(jlcflag)
	out.println("<h1>JLC Cookie is Found ...");
else
	out.println("<h1>JLC Cookie is Not Found...");	
System.out.println("output started");

Cookie cookie1=new Cookie("JLC", "Welcome to JLC");
response.addCookie(cookie1);

Cookie cookie2=new Cookie("BKG", "bkg@jlc");
response.addCookie(cookie2);

Cookie cookie3=new Cookie("PH", "9999");
response.addCookie(cookie3);


	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
