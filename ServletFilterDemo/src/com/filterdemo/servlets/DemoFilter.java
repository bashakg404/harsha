package com.filterdemo.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoFilter implements Filter {
	public void init(FilterConfig filterconfig) throws ServletException {
		System.out.println("Demo Filter init()");
		System.out.println("get config value from demo servlet parameter:web.xml");
		String city = filterconfig.getInitParameter("city");
		System.out.println(city);
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
			throws IOException, ServletException {
		System.out.println("Demo filter-doFilter()-before");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String ip = request.getRemoteAddr();
		System.out.println(name);
		System.out.println(email);
		System.out.println(ip);
		System.out.println("===========");
		filterchain.doFilter(request, response);
		System.out.println("**Demo Filter-doFillter()-after");
		Object object = request.getAttribute("MESSAGE");
		System.out.println(object);
		String message = object.toString();
		System.out.println(message);
	}

	public void destroy() {
		System.out.println("**DemoFilter-destroy()");
	}
}
