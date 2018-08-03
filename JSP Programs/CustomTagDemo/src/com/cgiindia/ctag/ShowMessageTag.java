package com.cgiindia.ctag;

import java.io.Writer;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ShowMessageTag extends TagSupport{

private String email;
private String ename;
public void setEname(String ename){
	this.ename=ename;
}
public void setEmail(String email){
	this.email=email;
}
public int soEndTag()throws JspException{
	Writer out=pageContext.getOut();
	try{
		if(ename==null || ename.trim().isEmpty()){
			out.write("<font color='red'>You Have Not Specified Your Name</font>");
		}else{
			out.write("Hi<font color='blue'>"+ename+"</font>");
			if(email==null || email.trim().isEmpty()){
				out.write("<br/><font color='red'>You Have Not Specified Your Email</font>");
			}else{
				out.write("<br/> Your email is<font color='blue'>"+email+"</font>");
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return super.doEndTag();
}
}
