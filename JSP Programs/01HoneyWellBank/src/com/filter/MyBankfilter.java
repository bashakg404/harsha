package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

public class MyBankfilter implements Filter {
	Logger LOG = Logger.getLogger(MyBankfilter.class);
	@Override
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("Inside the system context initialised>>>>");
		
	}


	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain fc) throws IOException, ServletException {
		
	}

	@Override
	public void destroy() {
		
	}

}
