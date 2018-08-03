package com.cgiindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cgiindia.jdbc.UserService;

public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		UserService userservice=new UserService();
		System.out.println("LoginAction-service()");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int x=userservice.verifyUser(username, password);
		HttpSession session=request.getSession();
		String result="";
		if(x==1){
			session.setAttribute("UN", username);
			result="home.jsp";
		}else{
			String message="Invalid Username or Password";
			request.setAttribute("MSG", message);
			result="index.jsp";
		}
		RequestDispatcher requestdispatcher=request.getRequestDispatcher(result);
		requestdispatcher.forward(request, response);
		
	}

}
