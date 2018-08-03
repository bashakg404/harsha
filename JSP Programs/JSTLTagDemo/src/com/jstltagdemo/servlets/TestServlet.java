package com.jstltagdemo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext context = session.getServletContext();

		System.out.println("1 String Wrapper DOB");

		request.setAttribute("EMAIL", "basha@cgi.com");
		session.setAttribute("PHONE", new Long(12345));
		context.setAttribute("DOB", new Date());

		System.out.println("2 Collection String Wrapper and Date");

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(new Integer(11));
		arraylist.add(new Integer(22));
		arraylist.add(new Integer(33));
		arraylist.add(new Integer(44));
		arraylist.add(new Integer(55));
		request.setAttribute("ARRAYLIST", arraylist);
		String string[] = { "basha", "anil", "hkj", "yuvi", "suri" };
		session.setAttribute("STRING", string);

		System.out.println("3 Collections of collections ***JSTL");

		ArrayList<ArrayList> arraylist1 = new ArrayList<ArrayList>();
		arraylist1.add(arraylist);
		arraylist1.add(arraylist);
		arraylist1.add(arraylist);
		request.setAttribute("ARRAYLIST1", arraylist1);

		System.out.println(" 4 Custom or User defined class Object");

		Address address = new Address("HMT Main Road", "Blore");
		Account account = new Account(101, "SA", 9999.99, address);
		Customer customer = new Customer(99, "sri", "sri@jlc", 99999, account);
		session.setAttribute("CUSTOMER", customer);

		System.out.println(" 5 Collection of User defined class object");

		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		customers.add(customer);
		customers.add(customer);
		customers.add(customer);
		customers.add(customer);
		session.setAttribute("CUSTOMERS", customers);

		System.out.println(" 6 MAP object");

		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("sid", "123");
		hashmap.put("sname", "sri");
		hashmap.put("email", "sri@jlc");
		session.setAttribute("HASHMAP", hashmap);

		System.out.println(" 7 Collecction of Map Object **JSTL");

		ArrayList<HashMap<String, String>> arraylist2 = new ArrayList<HashMap<String, String>>();
		arraylist2.add(hashmap);
		arraylist2.add(hashmap);
		arraylist2.add(hashmap);
		request.setAttribute("ARRAYLIST2", arraylist2);
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("show.jsp");
		requestdispatcher.forward(request, response);

	}

}
