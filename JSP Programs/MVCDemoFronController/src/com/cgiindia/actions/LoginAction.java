package com.cgiindia.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction extends CGIBaseAction{
	
public String process(HttpServletRequest request, HttpServletResponse response)throws Exception{
	System.out.println("Login Action Service()");
String username=request.getParameter("username");
String password=request.getParameter("password");
int x=userservice.verifyUser(username, password);
HttpSession session =request.getSession();
String result="";
if (x==1){
	session.setAttribute("UN", username);
	result="home.jsp";
}else{
	String message="Iinvalid Username or Password";
	request.setAttribute("MSG", message);
	result="index.jsp";
}
return result;
}
}
