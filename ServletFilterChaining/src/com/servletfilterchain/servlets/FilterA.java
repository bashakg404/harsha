package com.servletfilterchain.servlets;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;

public class FilterA implements Filter {
	
	public void destroy() {
		System.out.println("FilterA destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
			throws IOException, ServletException {
		System.out.println("FilterA doFilter started()");
		filterchain.doFilter(request, response);
		System.out.println("FilterA doFilter completed");
	}

	public void init(FilterConfig filterconfig) {
		System.out.println("filterA init()");
	}
}
