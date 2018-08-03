package com.cgiindia.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cgiindia.to.UserTO;

public class RegisterAction extends CGIBaseAction {
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Register Service-Action");

		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int userid = userservice.getNextUserId();
		long phone1 = Long.parseLong(phone);
		UserTO userto = new UserTO(userid, fname, email, phone1, username, password);

		int x = userservice.RegisterUser(userto);
		HttpSession session = request.getSession();
		String result = "";
		if (x == 1) {
			session.setAttribute("UN", username);
			result = "home.jsp";
			String sub = "Registration Success!!";
			String body = "<h1>Hi" + fname + "Your Registration has been completed successfully</h1>";
			MailService.sendMail(email, sub, body);
		} else {
			String message = "Registration Failed-Try Again";
			request.setAttribute("MSG", message);
			result = "register.jsp";
		}
		return result;
	}

}
