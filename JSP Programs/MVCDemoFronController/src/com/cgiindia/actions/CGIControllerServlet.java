package com.cgiindia.actions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CGIControllerServlet extends HttpServlet {
	LoginAction loginaction=null;
	RegisterAction registeraction=null;
	ForgotPWAction fpwaction=null;
	CGIBaseAction action=null;
	
	public void init(ServletConfig servletconfig){
		System.out.println("Initializing CGIControllerServlet");
		loginaction=new LoginAction();
		registeraction=new RegisterAction();
		fpwaction=new ForgotPWAction();
	}
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		System.out.println("CGIControllerServlet is Processing the Request");
		String URI=request.getRequestURI();
		System.out.println("Requesting URI:"+URI);
		if(URI.endsWith("login.cgi")){
		action=loginaction;
		
		}else if (URI.endsWith("forgotpw.cgi"));{
			action=fpwaction;
			
		}
		String result="";
		try{
			result=action.process(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Resultant resource:"+result);
		RequestDispatcher requestdispatcher=request.getRequestDispatcher(result);
		requestdispatcher.forward(request, response);
		System.out.println("CGIControllerServlet processing completed");
				
		}
	

}
