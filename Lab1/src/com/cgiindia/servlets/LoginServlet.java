package com.cgiindia.servlets;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String unm = req.getParameter("username");
		String pwd = req.getParameter("password");

		if (unm.equals(pwd)) {
			res.sendRedirect("success.html");
		} else {
			res.sendRedirect("failure.html");
		}
	}
}