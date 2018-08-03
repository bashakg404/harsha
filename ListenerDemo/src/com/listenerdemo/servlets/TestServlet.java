package com.listenerdemo.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Test servlet-->Service()");
		System.out.println("Accessing Session object");
		System.out.println("===1===");
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		ServletContext context = getServletContext();
		System.out.println("===2===");
		System.out.println("storing attribute in Context");
		context.setAttribute("email", "basha@jlc");
		System.out.println("===3===");
		System.out.println("removing attribute from context");
		context.removeAttribute("email");
		System.out.println("===4===");
		System.out.println("invalidating session object");
		session.invalidate();
		System.out.println("===5===");
		Writer out = response.getWriter();
		out.write("<h1> Verify the server console");
		System.out.println("===6===");

	}
}
