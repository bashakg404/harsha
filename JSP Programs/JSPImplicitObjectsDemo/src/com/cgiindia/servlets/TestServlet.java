package com.cgiindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Collect Parameters");

		String sname = request.getParameter("sname");
		String email = request.getParameter("email");
		String emails[] = request.getParameterValues("email");
		System.out.println(sname);
		System.out.println(email);
		for (String string : emails) {
			System.out.println(string);
		}

		System.out.println("Collect Headers");
		String host = request.getHeader("host");
		String referer = request.getHeader("referer");
		String acceptlanguage = request.getHeader("accept-language");
		String acceptencoding = request.getHeader("accept-encoding");
		System.out.println(host);
		System.out.println(referer);
		System.out.println(acceptlanguage);
		System.out.println(acceptencoding);

		System.out.println("Collect Cookies");
		Cookie cookie[] = request.getCookies();
		for (Cookie cook : cookie) {
			System.out.println(cook.getName() + "---" + cook.getValue());
		}
		Cookie ck1 = new Cookie("email", "sri@cgi.com");
		Cookie ck2 = new Cookie("phone", "1234567");
		response.addCookie(ck1);
		response.addCookie(ck2);
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("show.jsp");
		requestdispatcher.forward(request, response);
	}

}
