package com.sessionmandemo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			request.setAttribute("MSG", "Session is Destroyed");
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("showbooks.jsp");
			requestdispatcher.forward(request, response);
		} else {

			Enumeration<String> enumerations = session.getAttributeNames();
			ArrayList<String> selectedilst = Collections.list(enumerations);
			selectedilst.remove("BOOKS");
			if (selectedilst.size() == 0) {
				request.setAttribute("MSG", "No Books Selected");
			} else {
				request.setAttribute("CART", selectedilst);
			}
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("showcart.jsp");
			requestdispatcher.forward(request, response);
		}

	}
}
