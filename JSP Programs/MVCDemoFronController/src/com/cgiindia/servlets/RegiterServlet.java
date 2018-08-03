package com.cgiindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cgiindia.jdbc.UserService;
import com.cgiindia.to.UserTO;

public class RegiterServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
	UserService userservice=new UserService();
	System.out.println("Register-Action Service()");
    String fname=request.getParameter("fname");
    String email=request.getParameter("email");
    String phone=request.getParameter("phone");
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    int userid=userservice.getNextUserId();
    long phone1=Long.parseLong(phone);
    UserTO userto=new UserTO(userid, fname, email, phone1, username, password);
    int x=userservice.RegisterUser(userto);
    HttpSession session=request.getSession();
    String result="";
    if(x==1){
    	session.setAttribute("UN", username);
        result="home.jsp";
    }else{
    	String message="Registration Failed-Try Again";
    	request.setAttribute("MSG", message);
    	result="register.jsp";
  }
    RequestDispatcher requestdispatcher=request.getRequestDispatcher(result);
    requestdispatcher.forward(request, response);
	}

}
