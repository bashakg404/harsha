package com.sessionmandemo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveFromCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			request.setAttribute("MSG", "Session is Destroyed");
		} else {
			String bnm = request.getParameter("bname");

			System.out.println("Removing the client selected book from session");
			session.removeAttribute(bnm);
		}
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("showcart.jlc");
		requestdispatcher.forward(request, response);
	}
}
