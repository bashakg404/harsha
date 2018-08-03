package com.cgiindia.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgiindia.jdbc.UserService;

public abstract class CGIBaseAction {
	static UserService userservice = null;
	static{
		userservice=new UserService();
	}

public abstract String process(HttpServletRequest request, HttpServletResponse response)throws Exception;
}
