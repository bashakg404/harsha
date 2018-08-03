package com.cgiindia.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgotPWAction extends CGIBaseAction{
	
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String email=request.getParameter("email");
		String password=userservice.getPasswordByEmail(email);
		String result="";
		if (password !=null) {
		
			result = "pwstatus.jsp";
			String sub = "Your Password Here!!";
			String body = "<h1>Hi Your password is"+password+"</h1>";
			MailService.sendMail(email, sub, body);
		} else {
			String message = "Invalid Email-Try Again";
			request.setAttribute("MSG", message);
			result = "forgotpw.jsp";
		}
		return result;
	}
}
