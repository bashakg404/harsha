package com.servletfilterchain.servlets;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;

public class FilterB implements Filter {
	public void desttroy() {
		System.out.println("FilterB destroy");
	}

	public void service(ServletRequest request, ServletResponse response, FilterChain filterchain)
			throws IOException, ServletException {
		System.out.println("Filter doFilterB started");
		filterchain.doFilter(request, response);
		System.out.println("Filter doFilterB completed");
	}

	public void init(FilterConfig filterconfig) throws ServletException {
		System.out.println("filterB init()");
	}
}
