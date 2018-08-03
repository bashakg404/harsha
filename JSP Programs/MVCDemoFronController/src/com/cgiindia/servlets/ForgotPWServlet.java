package com.cgiindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgiindia.jdbc.UserService;

public class ForgotPWServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		UserService userservice=new UserService();
		String email=request.getParameter("email");
		String password=userservice.getPasswordByEmail(email);
		String result="";
		if(password !=null){
			result="pwstatus.jsp";
			request.setAttribute("PASSWORD", password);
			}else{
				String message="Invalid Email- Try Again";
				request.setAttribute("MSG", message);
				result="forgotpw.jsp";
				}
		RequestDispatcher requestdispatcher=request.getRequestDispatcher(result);
		requestdispatcher.forward(request, response);
	}

}
