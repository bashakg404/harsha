package com.sessionmandemo.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchBookServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entering search book servlet");
		String cat = request.getParameter("category");
		System.out.println("category:"+cat);
		if (cat != null && cat.equals("Java")) {
			ArrayList<String> blist = new ArrayList<String>();
			blist.add("JAVA");
			blist.add("COREJAVA");
			blist.add("JDBC");
			blist.add("MYSQL");
			blist.add("SERVLET");
			blist.add("JSP");
			blist.add("HIBERNATE");
			blist.add("SPRING");
			blist.add("EJB");
			blist.add("RMI");
			System.out.println("list of books shown");
			HttpSession session = request.getSession();
			session.setAttribute("BOOKS", blist);
		} else {
			request.setAttribute("MSG", "No Book Found With Category" + cat);
		}
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("showbooks.jsp");
		requestdispatcher.forward(request, response);
	}
}
