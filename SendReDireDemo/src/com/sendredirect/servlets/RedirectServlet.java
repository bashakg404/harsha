package com.sendredirect.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedirectServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("page");
		if (page == null || page.trim().length() == 0) {
			RequestDispatcher rd = null;
			rd = request.getRequestDispatcher("error.html");
			rd.forward(request, response);
			return;
		}
		if (page.startsWith("www")) {
			page = "http://" + page;
		}
		response.sendRedirect(page);
	}
}