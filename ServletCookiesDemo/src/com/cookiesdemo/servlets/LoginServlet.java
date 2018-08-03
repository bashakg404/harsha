package com.cookiesdemo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	
	private final String userID="basha";
    private final String password="basha#1";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    
    	//get a request parameter
    	String user=request.getParameter("user");
    	String pwd=request.getParameter("pwd");
    	
    	//vallidation
    	if(userID.equals(user) && password.equals(pwd)){
    		Cookie loginCookie=new Cookie("user", user);
    		//setting a cookie to expire in 30min
    		loginCookie.setMaxAge(30*60);
    		response.addCookie(loginCookie);
    		response.sendRedirect("LoginSuccess.jsp");
    	}else{
    		RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
    		PrintWriter out=response.getWriter();
    		out.println("<font colour=red>Either Username or Password is Wrong.</font>");
    		rd.include(request, response);
    		
    		
    	}
    }
}
	