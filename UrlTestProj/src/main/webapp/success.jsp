<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% if ((session.getAttribute("username")==null) || (session.getAttribute("username")=="") || (session.getAttribute("password")==null)||(session.getAttribute("password")=="")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%}else{
%>
Welcome <%= session.getAttribute("username")%>
<a href='logout.jsp'>Log out</a>
<%}
%>