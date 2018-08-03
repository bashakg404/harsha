package com.sessionmandemo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Accessing the existing session object");
		HttpSession session = request.getSession();

		System.out.println("validating the session is available or not");
		if (session == null) {
			request.setAttribute("MSG", "Session is Destroyed");
		} else {
			String bnm = request.getParameter("bname");

			System.out.println("Adding the client selected book to session");
			session.setAttribute(bnm, bnm);
			request.setAttribute("ADDED", bnm + "is added to cart");
		}
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("showbooks.jsp");
		requestdispatcher.forward(request, response);

	}

}